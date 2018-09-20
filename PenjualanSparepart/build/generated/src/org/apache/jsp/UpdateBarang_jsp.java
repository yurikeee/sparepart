package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateBarang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#F0FFFF\">\n");
      out.write("        <center>\n");
      out.write("            <h1>Ubah Data Sparepart</h1>\n");
      out.write("            <form name=\"formAddBarang\" method=\"post\" action=\"BrgController\">\n");
      out.write("                <input type=\"text\" name=\"kodeBarang\" id=\"kodeBarang\" placeholder=\"ex. 1\"><br>\n");
      out.write("                <input type=\"text\" name=\"namaBarang\" id=\"namaBarang\" placeholder=\"ex. Oli Honda\"><br>\n");
      out.write("                <input type=\"number\" name=\"hargaJual\" id=\"hargaJual\" placeholder=\"ex. 45.000\"><br>\n");
      out.write("                <input type=\"number\" name=\"hargaBeli\" id=\"hargaBeli\" placeholder=\"ex. 36.500\"><br>\n");
      out.write("                <input type=\"number\" name=\"satuan\" id=\"satuan\" placeholder=\"ex. 10\"><br>\n");
      out.write("                <input type=\"text\" name=\"kategori\" id=\"kategori\" placeholder=\"ex. oli\"><br>\n");
      out.write("                <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Update\">\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("        ");

            String msg = request.getParameter("message");
            if (msg == null) {
                msg = "";
            }
            out.println(msg);
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
