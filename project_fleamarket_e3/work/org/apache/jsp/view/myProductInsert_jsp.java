/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2022-06-27 02:41:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import util.ImageConvert;
import bean.User;

public final class myProductInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/common/header.jsp", Long.valueOf(1656061149866L));
    _jspx_dependants.put("/common/footer.jsp", Long.valueOf(1655881629201L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.User");
    _jspx_imports_classes.add("util.ImageConvert");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<String> error = (ArrayList<String>) request.getAttribute("error");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>出品登録</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#wrapper {\r\n");
      out.write("\tmax-width: 970px;\r\n");
      out.write("\tmargin: 10px auto 0px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-family: \"游ゴシック Medium\", \"Yu Gothic Medium\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #464646;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 10px;\r\n");
      out.write("\twidth: 970px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".copyright {\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hr {\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\theight: 2px;\r\n");
      out.write("\tbackground-color: orange;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bottom_button_right, .bottom_button_left {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\tpadding: 3px 5px 1px;\r\n");
      out.write("\tmargin: 10px 0px 0px 1px;\r\n");
      out.write("\tborder-top: 2px solid orange;\r\n");
      out.write("\tborder-right: 2px solid orange;\r\n");
      out.write("\tborder-left: 2px solid orange;\r\n");
      out.write("\tborder-radius: 8px 8px 0 0;\r\n");
      out.write("\tbackground-color: #ffff0054;\r\n");
      out.write("\tcolor: #464646;\r\n");
      out.write("\tfont-size: medium;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer_a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bottom_button_right:hover, .bottom_button_left:hover {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tbackground-color: #ffb70054;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bottom_button_right:active, .bottom_button_left:active {\r\n");
      out.write("\tborder-top: 2px inset #ff6800;\r\n");
      out.write("\tborder-right: 2px inset #ff6800;\r\n");
      out.write("\tborder-left: 2px inset #ff6800;\r\n");
      out.write("}\r\n");
      out.write(".\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"wrapper\">\r\n");
      out.write("\t<!-- header -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

User user = (User)session.getAttribute("user");

String authority = "";
String name = "かんちゃん";

if(user != null){
	if(user.getAuthority()){
		authority = "管理者";
	}else{
		authority = "会員";
	}
	name = user.getNickname();
}

if(user == null){
	// セッション切れならerror.jspへフォワード
	request.setAttribute("error","セッション切れの為、画面が表示できませんでした。");
	request.setAttribute("cmd","logout");
	request.getRequestDispatcher("/view/error.jsp").forward(request, response);
	return;
}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t#wrapper{\r\n");
      out.write("\t\t\t\tmax-width:1200px;\r\n");
      out.write("\t\t\t\tmargin:0px auto 0px;\r\n");
      out.write("\t\t\t\ttext-align:center;\r\n");
      out.write("\t\t\t\tfont-family:\"游ゴシック Medium\",\"Yu Gothic Medium\";\r\n");
      out.write("\t\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\t\tcolor: #464646;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbutton, input, select, textarea, th, td, li {\r\n");
      out.write("\t\t\t\tfont-family : inherit;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbutton:hover, a:hover{\r\n");
      out.write("\t\t\t\tcursor:pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tform{\r\n");
      out.write("\t\t\t\tmargin-block-end:0em;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.kome{\r\n");
      out.write("\t\t\t\tfont-size:small;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#menu{\r\n");
      out.write("\t\t\t\tfloat:right;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#menu_ul{\r\n");
      out.write("\t\t\t\tdisplay:flex;\r\n");
      out.write("\t\t\t\twidth:700px;\r\n");
      out.write("\t\t\t\tpadding:10px;\r\n");
      out.write("\t\t\t\tmargin:0px;\r\n");
      out.write("\t\t\t\tflex-direction: row;\r\n");
      out.write("\t\t\t\tflex-wrap: wrap;\r\n");
      out.write("\t\t\t\tjustify-content:flex-end;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#menu_ul li{\r\n");
      out.write("\t\t\t\tlist-style: none;\r\n");
      out.write("\t\t\t\twidth:150px;\r\n");
      out.write("\t\t\t\tpadding:5px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#menu_ul li a{\r\n");
      out.write("\t\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\t\tcolor:inherit;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.footer{\r\n");
      out.write("\t\t\t\tposition:sticky;\r\n");
      out.write("\t\t\t\tbottom:0; top:100vh;\r\n");
      out.write("\t\t\t\twidth:100%;\r\n");
      out.write("\t\t\t\tfont-size:small;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.copyright{\r\n");
      out.write("\t\t\t\tfont-size:small;\r\n");
      out.write("\t\t\t\theight:25px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.hr, .admin_hr{\r\n");
      out.write("\t\t\t\tmargin:8px auto 0px;\r\n");
      out.write("\t\t\t\tclear: both;\r\n");
      out.write("\t\t\t\theight:2px;\r\n");
      out.write("\t\t\t\tbackground-color:orange;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.admin_hr{\r\n");
      out.write("\t\t\t\tbackground-color:green;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.bottom_button_right, .admin_bottom_button_right{\r\n");
      out.write("\t\t\t\tfloat:right;\r\n");
      out.write("\t\t\t\theight:25px;\r\n");
      out.write("\t\t\t\twidth:150px;\r\n");
      out.write("\t\t\t\tpadding:3px 5px 1px;\r\n");
      out.write("\t\t\t\tmargin:10px 0px 0px 1px;\r\n");
      out.write("\t\t\t\tborder-top:2px solid orange;\r\n");
      out.write("\t\t\t\tborder-right:2px solid orange;\r\n");
      out.write("\t\t\t\tborder-left:2px solid orange;\r\n");
      out.write("\t\t\t\tborder-radius: 8px 8px 0 0;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tbackground-color:#ffff0054;\r\n");
      out.write("\t\t\t\tcolor: #464646;\r\n");
      out.write("\t\t\t\tfont-size:medium;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.footer_a{\r\n");
      out.write("\t\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.bottom_button_right:hover, .admin_bottom_button_right:hover{\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t\tbackground-color:#ffb70054;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.bottom_button_right:active{\r\n");
      out.write("\t\t\t\tborder-top: 2px inset #ff6800;\r\n");
      out.write("\t\t\t\tborder-right: 2px inset #ff6800;\r\n");
      out.write("\t\t\t\tborder-left: 2px inset #ff6800;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.admin_bottom_button_right{\r\n");
      out.write("\t\t\t\tborder-top:2px solid green;\r\n");
      out.write("\t\t\t\tborder-right:2px solid green;\r\n");
      out.write("\t\t\t\tborder-left:2px solid green;\r\n");
      out.write("\t\t\t\tbackground-color:#9bff7f54;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.admin_bottom_button_right:hover{\r\n");
      out.write("\t\t\t\tbackground-color:#9bff7fd1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.admin_bottom_button_right:active{\r\n");
      out.write("\t\t\t\tborder-top: 2px inset #005200;\r\n");
      out.write("\t\t\t\tborder-right: 2px inset #005200;\r\n");
      out.write("\t\t\t\tborder-left: 2px inset #005200;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body id=\"wrapper\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t\t<header style=\"position:sticky; top:0px; background-color:white; padding:5px 0px 0px;\">\r\n");
      out.write("\t\t\t\t");
 if(authority.equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\" style=\"float:left; padding:5px;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath());
      out.write("/image/logo.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"menu_ul\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\">商品一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li style=\"color:red\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/login.jsp\">ログイン</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/register.jsp\">会員登録</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr class=\"hr\"/>\r\n");
      out.write("\t\t\t\t");
 }else if(authority.equals("会員")){
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\" style=\"float:left; padding:5px;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath());
      out.write("/image/logo.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"float:left; height:80;\">\r\n");
      out.write("\t\t\t\t\t\t<span style=\"display:block;padding:30px 30px 30px; font-weight:normal\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( name );
      out.write(" <span style=\"font-weight:bold\">さん</span></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"menu_ul\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/menu.jsp\">メニュー</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\">商品一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/myProductInsert.jsp\">出品する</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/buyList\">購入一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/dealList\">取引一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/myProductList\">出品一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/userDetail\">ユーザー情報の変更</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li style=\"color:red\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/logout\">ログアウト</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr class=\"hr\"/>\r\n");
      out.write("\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\" style=\"float:left; padding:5px;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath());
      out.write("/image/logo.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"menu_ul\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/menu.jsp\">メニュー</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\">商品一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/userList\">ユーザー一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/salesList\">売上げ一覧</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li style=\"color:red\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/logout\">ログアウト</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr class=\"admin_hr\"/>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<h2 align=\"center\">出品登録</h2>\r\n");
      out.write("\t<!-- contents -->\r\n");
      out.write("\r\n");
      out.write("\t");

		if (error != null) {
			for (int i = 0; i < error.size(); i++) {
	
      out.write("\r\n");
      out.write("\t<font size=\"3\" color=\"#ff0000\">");
      out.print(error.get(i));
      out.write("</font>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");

			}
		}
	
      out.write("\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/myProductInsert\" method=\"post\">\r\n");
      out.write("\t\t<table border=0 align=\"center\" summary=\"出品画面\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 100\">カテゴリ<font\r\n");
      out.write("\t\t\t\t\tsize=\"1\" color=\"#ff0000\">必須</font></th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td><select name=\"category\">\r\n");
      out.write("\t\t\t\t<option value=\"レディース\">レディース</option>\r\n");
      out.write("\t\t\t\t<option value=\"メンズ\">メンズ</option>\r\n");
      out.write("\t\t\t\t<option value=\"ベビー・キッズ\">ベビー・キッズ</option>\r\n");
      out.write("\t\t\t\t<option value=\"インテリア・住まい・小物\">インテリア・住まい・小物</option>\r\n");
      out.write("\t\t\t\t<option value=\"本・音楽・ゲーム\">本・音楽・ゲーム</option>\r\n");
      out.write("\t\t\t\t<option value=\"おもちゃ・ホビー・グッズ\">おもちゃ・ホビー・グッズ</option>\r\n");
      out.write("\t\t\t\t<option value=\"コスメ・香水・美容\">コスメ・香水・美容</option>\r\n");
      out.write("\t\t\t\t<option value=\"家電・スマホ・カメラ\">家電・スマホ・カメラ</option>\r\n");
      out.write("\t\t\t\t<option value=\"スポーツ・レジャー\">スポーツ・レジャー</option>\r\n");
      out.write("\t\t\t\t<option value=\"ハンドメイド\">ハンドメイド</option>\r\n");
      out.write("\t\t\t\t<option value=\"チケット\">チケット</option>\r\n");
      out.write("\t\t\t\t<option value=\"自動車・オートバイ\">自動車・オートバイ</option>\r\n");
      out.write("\t\t\t\t<option value=\"その他\">その他</option>\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 100\">商品名<font\r\n");
      out.write("\t\t\t\t\tsize=\"1\" color=\"#ff0000\">必須</font></th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"productname\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 100\">個数<font\r\n");
      out.write("\t\t\t\t\tsize=\"1\" color=\"#ff0000\">必須</font></th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"stock\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 100\">価格(単価)<font\r\n");
      out.write("\t\t\t\t\tsize=\"1\" color=\"#ff0000\">必須</font></th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"price\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 180\">出品地域(都道府県)<font\r\n");
      out.write("\t\t\t\t\tsize=\"1\" color=\"#ff0000\">必須</font></th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"address_level1\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 100\">商品画像</th>\r\n");
      out.write("\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<img id=\"thumbnail\" src=\"\" alt=\"イメージ\"><br>\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" id=\"uploadImg\" accept=\".png, .jpg, .jpeg, .bmp\"><br>\r\n");
      out.write("\t\t\t\t\t<font color=\"grey\" size=\"2\">画像は64*64に縮小表示されます。</font>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"image\" name=\"image\" value=\"\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background-color: #99FF66; width: 100\">備考</th>\r\n");
      out.write("\t\t\t\t<td><textarea name=\"remark\" rows=\"5\" cols=\"23\"></textarea></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=2 style=\"text-align: center\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\tvalue=\"登録\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");



      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body id=\"wrapper\">\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t\t\t");
if(authority.equals("") || authority.equals("会員")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"class=\"footer_a\"><div class=\"bottom_button_right\">ページトップへ</div></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\" class=\"footer_a\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bottom_button_right\">ホームへ</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<hr class=\"hr\"/>\r\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">Copyright(C)2022 All Rights Reserved.</p>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"class=\"footer_a\"><div class=\"admin_bottom_button_right\">ページトップへ</div></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/productList\" class=\"footer_a\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"admin_bottom_button_right\">ホームへ</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<hr class=\"admin_hr\"/>\r\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">Copyright(C)2022 All Rights Reserved.</p>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tconst uploadImg = document.getElementById(\"uploadImg\");\r\n");
      out.write("\r\n");
      out.write("\t\tif(uploadImg !== null){\r\n");
      out.write("\t\t\tuploadImg.addEventListener('change', function(){\r\n");
      out.write("\t\t\t\tif (this.files.length > 0) {\r\n");
      out.write("\t\t\t\t\t// 選択されたファイル情報を取得\r\n");
      out.write("\t\t\t\t\tvar file = this.files[0];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t// readerのresultプロパティに、データURLとしてエンコードされたファイルデータを格納\r\n");
      out.write("\t\t\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\t\t\treader.readAsDataURL(file);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\treader.onload = function() {\r\n");
      out.write("\t\t\t\t\t\t$('#thumbnail').attr('src', reader.result);\r\n");
      out.write("\t\t\t\t\t\t$('#image').attr('value', reader.result.split(',')[1]);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
