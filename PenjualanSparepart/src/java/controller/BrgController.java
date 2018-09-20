/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Barang;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Yurike
 */
@WebServlet(name = "BrgController", urlPatterns = {"/BrgController"})
public class BrgController extends HttpServlet{
    public String addBarang(Barang brg) {
        String message = null;
        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = s.getTransaction();
            tr.begin();
            s.save(brg);
            tr.commit();
            message = "Data tersimpan";
            return message;
        } catch (Exception e) {
            return (e.getMessage());
        } finally {
            s.close();
        }
    }

    public String updateBarang(int kodeBarang, Barang brg) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction trs = sess.getTransaction();
            trs.begin();
            SQLQuery query = sess.createSQLQuery("update masterbarang set namaBarang='" + brg.getNamaBarang()+ "',hargaJual='" + brg.getHargaJual()+ "',hargaBeli='" + brg.getHargaBeli()+ "',satuan='" + brg.getSatuan()+ "',kategori='" + brg.getKategori()+ "' where kodeBarang='" + kodeBarang + "'");
            query.executeUpdate();
            String message = "Ubah data";
            return message;
        } catch (Exception e) {
            return (e.getMessage());
        } finally {
            sess.close();
        }
    }
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String submit = request.getParameter("submit");
        if (submit.equalsIgnoreCase("Tambah")) {
            String namaBarang = request.getParameter("namaBarang");
            double hargaJual = Double.parseDouble(request.getParameter("hargaJual"));
            double hargaBeli = Double.parseDouble(request.getParameter("hargaBeli"));
            int satuan = Integer.parseInt(request.getParameter("satuan"));
            String kategori = request.getParameter("kategori");
            
            Barang br = new Barang(namaBarang, hargaJual, hargaBeli, satuan, kategori);
            String resultMessage = addBarang(br);
            RequestDispatcher rd = request.getRequestDispatcher("InputBarang.jsp?message=" + resultMessage);
            request.setAttribute("searchResult", null);
            rd.forward(request, response);
        } else if (submit.equalsIgnoreCase("Update")) {
            int kodeBarang = Integer.parseInt(request.getParameter("kodeBarang"));
            String namaBarang = request.getParameter("namaBarang");
            double hargaJual = Double.parseDouble(request.getParameter("hargaJual"));
            double hargaBeli = Double.parseDouble(request.getParameter("hargaBeli"));
            int satuan = Integer.parseInt(request.getParameter("satuan"));
            String kategori = request.getParameter("kategori");

            Barang br = new Barang();

            br.setNamaBarang(namaBarang);
            br.setHargaJual(hargaJual);
            br.setHargaBeli(hargaBeli);
            br.setSatuan(satuan);
            br.setKategori(kategori);
            
            String resultMessage = updateBarang(kodeBarang, br);
            RequestDispatcher rd = request.getRequestDispatcher("UpdateBarang.jsp?message=" + resultMessage);
            request.setAttribute("searchResult", null);
            rd.forward(request, response);
        }
        }
    }
}
