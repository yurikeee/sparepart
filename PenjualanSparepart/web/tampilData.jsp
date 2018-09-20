<%-- 
    Document   : tampilData
    Created on : 19-Sep-2018, 17:02:56
    Author     : Yurike
--%>
<%@page import="PackagePdh.ProductHelper"%>
<%@page import="java.util.List"%>
<%@page import="model.Barang"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tampilkan Data Sparepart</title>
    </head>
    <body bgcolor="#F0FFFF">
        <table cellpadding="7">
            <%
                ProductHelper ph = new ProductHelper();
                List<Barang> brg = ph.getData();
                for(Barang x : brg){
                    out.print("<tr>");
                    out.print("<td>" + x.getKodeBarang() + "</td>");
                    out.print("<td>" + x.getNamaBarang() + "</td>");
                    out.print("<td>" + x.getHargaJual() + "</td>");
                    out.print("<td>" + x.getHargaBeli() + "</td>");
                    out.print("<td>" + x.getSatuan() + "</td>");
                    out.print("<td>" + x.getKategori() + "</td>");
                    out.print("</tr>");
                }
            %>
        </table>
    </body>
</html>
