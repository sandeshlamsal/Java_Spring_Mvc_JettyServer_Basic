package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html ng-app=\"UserModule\">\r\n");
      out.write("<head><title>Angular js java</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.angularjs.org/1.4.5/angular-route.js\"></script>     \r\n");
      out.write("<script src=\"/resources/js/UserJS.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-controller=\"UserController\">\r\n");
      out.write("<div>\r\n");
      out.write(" \t<p>Name : <input type=\"text\" ng-model=\"name\"/></p>\r\n");
      out.write(" \t<p>Pass : <input type=\"password\" ng-model=\"pass\"/></p>\r\n");
      out.write("\t<input type=\"submit\" name=\"changeName\" ng-click=\"buttonClicked()\"/> \t\r\n");
      out.write("\t<input type=\"submit\" ng-click=\"frmSubmit()\"/>\r\n");
      out.write("\t{{name}}\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
