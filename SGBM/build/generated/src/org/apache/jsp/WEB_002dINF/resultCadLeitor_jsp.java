package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Usuario;
import models.Leitor;
import java.util.ArrayList;
import java.util.List;
import models.Livro;

public final class resultCadLeitor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    HttpSession sessao = request.getSession();
    Usuario usuario = new Usuario();
    if(sessao.getAttribute("usuario")==null){
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }else{
        usuario =  (Usuario) sessao.getAttribute("usuario");
    }

    // Declaração das Váriaveis que contens as url 
    //Logout
    String urlLogout = "Authentication?tipoRequisicao=Logout";
   
    //Titullo 1 page e table
    String titulo1 = (String) request.getAttribute("titulo1");
    String tituloTable = (String) request.getAttribute("tituloTable");
    
    //Menu - Itens - Listar
    String urlListEmprestimos = "Listar?tipoListagem=Emprestimo"; 
    String urlListLivros = "Listar?tipoListagem=Livro"; 
    String urlListLeitores = "Listar?tipoListagem=Leitor";
    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">  \n");
      out.write("        <link rel=\"icon\" href=\"dist/img/icon.png\" type=\"image/x-icon\"/>\n");
      out.write("        <title>Biblioteca Municipal</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.7 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/Ionicons/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("             folder instead of downloading all of them to reduce the load. -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("          th, td{\n");
      out.write("            text-align: center;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("         <!-- Logo -->\n");
      out.write("          <a href=\"inicio.jsp\" class=\"logo\">\n");
      out.write("            <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("            <span class=\"logo-mini\"><i class=\"fa fa-book\"></i> </span>\n");
      out.write("            <!-- logo for regular state and mobile devices -->\n");
      out.write("            <span class=\"logo-lg\"><b>Gestão </b><i class=\"fa fa-book\"></i></span>\n");
      out.write("          </a>\n");
      out.write("          <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("          <nav class=\"navbar navbar-static-top\">\n");
      out.write("            <!-- Sidebar toggle button-->\n");
      out.write("            <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <div class=\"navbar-custom-menu\">\n");
      out.write("              <ul class=\"nav navbar-nav\">\n");
      out.write("                <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                <li class=\"dropdown user user-menu\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                    <img src=\"dist/img/admin.png\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                    <span class=\"hidden-xs\">Admin</span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <!-- User image -->\n");
      out.write("                    <li class=\"user-header\">\n");
      out.write("                      <img src=\"dist/img/admin.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                      <p>\n");
      out.write("                        ");
      out.print(usuario.getNome() );
      out.write("\n");
      out.write("                        <small>Bibliotecário</small>\n");
      out.write("                      </p>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Menu Footer-->\n");
      out.write("                    <li class=\"user-footer\">\n");
      out.write("                      <div class=\"pull-left\">\n");
      out.write("                        <a href=\"pages/examples/profile.jsp\" class=\"btn btn-default btn-flat\">Perfil</a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"pull-right\">\n");
      out.write("                        <a href=\"");
      out.print(urlLogout );
      out.write("\" class=\"btn btn-default btn-flat\">Sair</a>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("       <aside class=\"main-sidebar\">\n");
      out.write("          <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("          <section class=\"sidebar\">\n");
      out.write("            <!-- Sidebar user panel -->\n");
      out.write("            <div class=\"user-panel\">\n");
      out.write("              <div class=\"pull-left image\">\n");
      out.write("                <img src=\"dist/img/admin.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"pull-left info\">\n");
      out.write("                <p>Admin</p>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- search form -->\n");
      out.write("            <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Procurar...\">\n");
      out.write("                <span class=\"input-group-btn\">\n");
      out.write("                      <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                      </button>\n");
      out.write("                    </span>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- /.search form -->\n");
      out.write("            <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("            <ul class=\"sidebar-menu\" data-widget=\"tree\">\n");
      out.write("              <li class=\"header\">NAVEGAÇÃO</li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-edit\"></i> <span>Cadastrar</span>\n");
      out.write("                  <span class=\"pull-right-container\">\n");
      out.write("                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"pages/forms/cadastrarEmprestimo.jsp\"><i class=\"fa fa-circle-o\"></i> Empréstimos</a></li>\n");
      out.write("                    <li><a href=\"pages/forms/cadastrarLivro.jsp\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\n");
      out.write("                    <li><a href=\"pages/forms/cadastrarLeitor.jsp\"><i class=\"fa fa-circle-o\"></i> Leitores</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-edit\"></i> <span>Editar</span>\n");
      out.write("                  <span class=\"pull-right-container\">\n");
      out.write("                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"pages/edit/editarEmprestimo.jsp\"><i class=\"fa fa-circle-o\"></i> Empréstimos</a></li>\n");
      out.write("                    <li><a href=\"pages/edit/editarLivro.jsp\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\n");
      out.write("                    <li><a href=\"pages/edit/editarLeitor.jsp\"><i class=\"fa fa-circle-o\"></i> Leitores</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-edit\"></i> <span>Listar</span>\n");
      out.write("                  <span class=\"pull-right-container\">\n");
      out.write("                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"");
      out.print(urlListEmprestimos);
      out.write("\"><i class=\"fa fa-circle-o\"></i> Empréstimos</a></li>\n");
      out.write("            <li><a href=\"");
      out.print(urlListLivros);
      out.write("\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\n");
      out.write("            <li><a href=\"");
      out.print(urlListLeitores);
      out.write("\"><i class=\"fa fa-circle-o\"></i> Leitores</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-table\"></i> <span>Relatórios</span>\n");
      out.write("                  <span class=\"pull-right-container\">\n");
      out.write("                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"pages/tables/relatorioLeitores.jsp\"><i class=\"fa fa-circle-o\"></i> Leitores</a></li>\n");
      out.write("                  <li><a href=\"pages/tables/relatorioLivro.jsp\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\n");
      out.write("                  <li><a href=\"pages/tables/relatorioAlugados.jsp\"><i class=\"fa fa-circle-o\"></i> Livros Alugados</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"header\">MENSAGENS</li>\n");
      out.write("              <li><a href=\"\"><i class=\"fa fa-circle-o text-red\"></i> <span>Importante</span></a></li>\n");
      out.write("              <li><a href=\"\"><i class=\"fa fa-circle-o text-yellow\"></i> <span>Alerta</span></a></li>\n");
      out.write("              <li><a href=\"\"><i class=\"fa fa-circle-o text-aqua\"></i> <span>Informação</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </section>\n");
      out.write("          <!-- /.sidebar -->\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("        <!-- Content Wrapper. Contains page content -->\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("          <!-- Content Header (Page header) -->\n");
      out.write("          <section class=\"content-header\">\n");
      out.write("            <h1>\n");
      out.write("              Leitor\n");
      out.write("              <small>");
      out.print(titulo1 );
      out.write("</small>\n");
      out.write("            </h1>\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("              <li><a href=\"inicio.jsp\"><i class=\"fa fa-dashboard\"></i> Início</a></li>\n");
      out.write("              <li><a href=\"pages/edit/editarLivro.jsp\">Editar</a></li>\n");
      out.write("              <li class=\"active\">Livros</li>\n");
      out.write("            </ol>\n");
      out.write("          </section>\n");
      out.write("\n");
      out.write("          <!-- Main content -->\n");
      out.write("          <section class=\"content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
      out.write("          <!-- /.content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.content-wrapper -->\n");
      out.write("      <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("      <!-- jQuery 3 -->\n");
      out.write("      <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("      <!-- Bootstrap 3.3.7 -->\n");
      out.write("      <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("      <!-- Slimscroll -->\n");
      out.write("      <script src=\"bower_components/jquery-slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("      <!-- FastClick -->\n");
      out.write("      <script src=\"bower_components/fastclick/lib/fastclick.js\"></script>\n");
      out.write("      <!-- AdminLTE App -->\n");
      out.write("      <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("      <!-- AdminLTE for demo purposes -->\n");
      out.write("      <script src=\"dist/js/demo.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
