package org.apache.jsp.pages.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarLivro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">  \r\n");
      out.write("  <link rel=\"icon\" href=\"../../dist/img/icon.png\" type=\"image/x-icon\"/>\r\n");
      out.write("  <title>Biblioteca Municipal</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <!-- Bootstrap 3.3.7 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../bower_components/bootstrap/dist/css/bootstrap.min.css\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../bower_components/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../bower_components/Ionicons/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../dist/css/AdminLTE.min.css\">\r\n");
      out.write("  <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("   <!-- Logo -->\r\n");
      out.write("    <a href=\"../../inicio.jsp\" class=\"logo\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><i class=\"fa fa-book\"></i> </span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>Gestão </b><i class=\"fa fa-book\"></i></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"navbar-custom-menu\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          <!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("          <li class=\"dropdown user user-menu\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <img src=\"../../dist/img/admin.png\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("              <span class=\"hidden-xs\">Admin</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <!-- User image -->\r\n");
      out.write("              <li class=\"user-header\">\r\n");
      out.write("                <img src=\"../../dist/img/admin.png\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\r\n");
      out.write("                <p>\r\n");
      out.write("                  Admin\r\n");
      out.write("                  <small>Bibliotecário</small>\r\n");
      out.write("                </p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Footer-->\r\n");
      out.write("              <li class=\"user-footer\">\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                  <a href=\"../examples/profile.jsp\" class=\"btn btn-default btn-flat\">Perfil</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pull-right\">\r\n");
      out.write("                  <a href=\"../../index.jsp\" class=\"btn btn-default btn-flat\">Sair</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write(" <aside class=\"main-sidebar\">\r\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar user panel -->\r\n");
      out.write("      <div class=\"user-panel\">\r\n");
      out.write("        <div class=\"pull-left image\">\r\n");
      out.write("          <img src=\"../../dist/img/admin.png\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"pull-left info\">\r\n");
      out.write("          <p>Admin</p>\r\n");
      out.write("          <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- search form -->\r\n");
      out.write("      <form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Procurar...\">\r\n");
      out.write("          <span class=\"input-group-btn\">\r\n");
      out.write("                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("              </span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      <!-- /.search form -->\r\n");
      out.write("      <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("      <ul class=\"sidebar-menu\" data-widget=\"tree\">\r\n");
      out.write("        <li class=\"header\">NAVEGAÇÃO</li>\r\n");
      out.write("        <li class=\"treeview\">\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-edit\"></i> <span>Cadastrar</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li><a href=\"cadastrarLivro.jsp\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\r\n");
      out.write("            <li><a href=\"cadastrarLeitor.jsp\"><i class=\"fa fa-circle-o\"></i> Clientes</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"treeview\">\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-edit\"></i> <span>Editar</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li><a href=\"../edit/editarLivro.jsp\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\r\n");
      out.write("            <li><a href=\"../edit/editarCliente.jsp\"><i class=\"fa fa-circle-o\"></i> Clientes</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"treeview\">\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Relatórios</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li><a href=\"../tables/relatorioCliente.jsp\"><i class=\"fa fa-circle-o\"></i> Clientes</a></li>\r\n");
      out.write("            <li><a href=\"../tables/relatorioLivro.jsp\"><i class=\"fa fa-circle-o\"></i> Livros</a></li>\r\n");
      out.write("            <li><a href=\"../tables/relatorioAlugados.jsp\"><i class=\"fa fa-circle-o\"></i> Livros Alugados</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"header\">MENSAGENS</li>\r\n");
      out.write("        <li><a href=\"\"><i class=\"fa fa-circle-o text-red\"></i> <span>Importante</span></a></li>\r\n");
      out.write("        <li><a href=\"\"><i class=\"fa fa-circle-o text-yellow\"></i> <span>Alerta</span></a></li>\r\n");
      out.write("        <li><a href=\"\"><i class=\"fa fa-circle-o text-aqua\"></i> <span>Informação</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("      <h1>\r\n");
      out.write("        Livro\r\n");
      out.write("        <small>Cadastrar Livro</small>\r\n");
      out.write("      </h1>\r\n");
      out.write("      <ol class=\"breadcrumb\">\r\n");
      out.write("        <li><a href=\"../../inicio.jsp\"><i class=\"fa fa-dashboard\"></i> Início</a></li>\r\n");
      out.write("        <li><a href=\"clientes.jsp\">Cadastrar</a></li>\r\n");
      out.write("        <li class=\"active\">Livro</li>\r\n");
      out.write("      </ol>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write(" <section class=\"content\">\r\n");
      out.write("    <div class=\"box box-primary\">\r\n");
      out.write("      <div class=\"box-header with-border\">\r\n");
      out.write("        <h3 style=\"font-size: 40px\" class=\"box-title\">Cadastrar Livro</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- form start -->\r\n");
      out.write("      <form action=\"../../CadastrarLivro\" method=\"post\" data-toggle=\"validator\" role=\"form\" id=\"cadastrarLivro\">\r\n");
      out.write("        <div class=\"box-body\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"col-md-6\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"titulo\">Título</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-sticky-note\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"titulo\" class=\"form-control\" id=\"titulo\" placeholder=\"Título do Livro\" data-error=\"Por favor, informe apenas caractéres.\" pattern=\"[a-z A-Z á-ú Á-ú-]*\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("              <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-6\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"subtitulo\">Subtítulo</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-sticky-note\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"subtitulo\" class=\"form-control\" id=\"subtitulo\" placeholder=\"Subtítulo do Livro\" data-error=\"Por favor, informe apenas caractéres.\" pattern=\"[a-z A-Z á-ú Á-ú-]*\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"col-md-3\" style=\"width: 50%;\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"autor\">Autor</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-sticky-note\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"autor\" class=\"form-control\" id=\"autor\" placeholder=\"Nome do Autor\" data-error=\"Por favor, informe apenas caractéres.\" pattern=\"[a-z A-Z á-ú Á-ú-]*\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-2\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"genero\">Gênero</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-list\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <select required class=\"form-control\" name=\"genero\">\r\n");
      out.write("                    <option value=\"Ciência\">Ciência</option>\r\n");
      out.write("                    <option value=\"Ficção Científica\">Ficção Científica</option>\r\n");
      out.write("                    <option value=\"Fantasia\">Fantasia</option>\r\n");
      out.write("                    <option value=\"Filosofia\">Filosofia</option>\r\n");
      out.write("                    <option value=\"História\">História</option>\r\n");
      out.write("                    <option value=\"Política\">Política</option>\r\n");
      out.write("                    <option value=\"Romance\">Romance</option>\r\n");
      out.write("                    <option value=\"Religião\">Religião</option>\r\n");
      out.write("                    <option value=\"Terror\">Terror</option>\r\n");
      out.write("                    <option value=\"Poesia\">Poesia</option>\r\n");
      out.write("                    <option value=\"Drama\">Drama</option>\r\n");
      out.write("                    <option value=\"Comédia\">Comédia</option>\r\n");
      out.write("                    <option value=\"Biografias\">Biografias</option>\r\n");
      out.write("                    <option value=\"Infanto Juvenil\">Infanto Juvenil</option>\r\n");
      out.write("                    <option value=\"Suspense\">Suspense</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-2\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"ano\">Ano de Publicação</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-calendar\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"anoPublicacao\" class=\"form-control\" id=\"ano\" placeholder=\"Publicação\" data-error=\"Por favor, informe apenas números.\" pattern=\"[0-9]+$\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-2\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"paginas\">Páginas</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-columns\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"qtdPaginas\" class=\"form-control\" id=\"paginas\" placeholder=\"Nº de Páginas\" data-error=\"Por favor, informe apenas números.\" pattern=\"[0-9]+$\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"col-md-6\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"editora\">Editora</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-sticky-note\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"editora\" class=\"form-control\" id=\"editora\" placeholder=\"Editora da Publicação\" data-error=\"Por favor, informe apenas caractéres.\" pattern=\"[a-z A-Z á-ú Á-ú-]*\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-2\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"publicacao\">Publicação</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-list\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                    <select required class=\"form-control\" name=\"publicacao\">\r\n");
      out.write("                    <option value=\"Nacional\">Nacional</option>\r\n");
      out.write("                    <option value=\"Internacional\">Internacional</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-2\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"exemplares\">Exemplares</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-columns\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" required name=\"qtdExemplares\" class=\"form-control\" id=\"exemplares\" placeholder=\"Quantidade\" data-error=\"Por favor, informe apenas números.\" pattern=\"[0-9]+$\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"eror\" class=\"help-block with-errors\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-2\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"data\">Data</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\">\r\n");
      out.write("                    <i class=\"fa fa-calendar\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" name=\"data\" class=\"form-control\"  id=\"data\" readonly=\"true\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"help-block with-errors\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("        <!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"box-footer\" style=\"text-align: right;\">\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\" style=\"width:15%;\"><i class=\"fa fa-edit\"></i> <br>Cadastrar</button>\r\n");
      out.write("          <button onclick=\"limpar()\" class=\"btn btn-primary\"  style=\"width:15%;\"><i class=\"fa fa-repeat\"></i> <br>Limpar Campos</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.box -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("<!-- jQuery 3 -->\r\n");
      out.write("<script src=\"../../bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("<script src=\"../../bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Slimscroll -->\r\n");
      out.write("<script src=\"../../bower_components/jquery-slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<!-- FastClick -->\r\n");
      out.write("<script src=\"../../bower_components/fastclick/lib/fastclick.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"../../dist/js/adminlte.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"../../dist/js/demo.js\"></script>\r\n");
      out.write("<script src=\"../../dist/js/validator.min.js\"></script>\r\n");
      out.write("<script src=\"../../dist/js/jquery.form.js\"></script>\r\n");
      out.write("<script src=\"../../dist/js/jquery.mask.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function Data()\r\n");
      out.write("  {\r\n");
      out.write("      data = new Date();\r\n");
      out.write("      dia_semana = data.getDate();\r\n");
      out.write("      mes = data.getMonth();\r\n");
      out.write("      ano = data.getFullYear()\r\n");
      out.write("      dataCompleta = dia_semana + '/'+ (mes+1) +'/' + ano;\r\n");
      out.write("\r\n");
      out.write("      return dataCompleta;\r\n");
      out.write("  }\r\n");
      out.write("   window.onload = function(){\r\n");
      out.write("      document.getElementById(\"data\").value = Data();\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function limpar(){\r\n");
      out.write("    $(\"#cadastrarLivro\").resetForm();\r\n");
      out.write("    $(\"#data\").val(Data());\r\n");
      out.write("}\r\n");
      out.write("   jQuery(function($){\r\n");
      out.write("    $(\"#paginas\").mask(\"99999\");\r\n");
      out.write("    $(\"#ano\").mask(\"9999\");\r\n");
      out.write("    $(\"#exemplares\").mask(\"99999\");\r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
