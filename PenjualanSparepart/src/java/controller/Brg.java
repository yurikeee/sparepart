/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Barang;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
/**
 *
 * @author Yurike
 */
public class Brg extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
            try {
                Session sess = HibernateUtil.getSessionFactory().openSession();
                SQLQuery query = sess.createSQLQuery("select * from masterbarang");

                query.addEntity(Barang.class);
                List<Barang> listBrg = query.list();
             
                sess.close();
                
                ArrayList<Barang> arrList = new ArrayList<>();
                for (Barang listBrg1 : listBrg) {
                    Barang br = new Barang();
                    br.setKodeBarang(listBrg1.getKodeBarang());
                    br.setNamaBarang(listBrg1.getNamaBarang());
                    br.setHargaJual(listBrg1.getHargaJual());
                    br.setHargaBeli(listBrg1.getHargaBeli());
                    br.setSatuan(listBrg1.getSatuan());
                    br.setKategori(listBrg1.getKategori());
                    arrList.add(br);
                }
                
                request.setAttribute("masterbarang",arrList);
                request.getRequestDispatcher("tampilData.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
}
