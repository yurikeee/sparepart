<%-- 
    Document   : InputBarang
    Created on : 19-Sep-2018, 16:38:06
    Author     : Yurike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#F0FFFF">
    <center>
        <h1>Silahkan Masukkan Sparepart</h1>
            <form method="post" name="formAddBarang" action="BrgController">
                <input type="text" name="namaBarang" id="namaBarang" placeholder="ex. Oli Honda"><br>
                <input type="number" name="hargaJual" id="hargaJual" placeholder="ex. 45.000"><br>
                <input type="number" name="hargaBeli" id="hargaBeli" placeholder="ex. 36.500"><br>
                <input type="number" name="satuan" id="satuan" placeholder="ex. 20"><br>
                <input type="text" name="kategori" id="kategori" placeholder="ex. oli"><br>
                <input type="submit" name="submit" id="submit" value="Tambah">
            </form>
    </center>
        <%
            String msg = request.getParameter("message");
            if (msg == null) {
                msg = "";
            }
            out.println(msg);

        %>
    </body>
</html>
