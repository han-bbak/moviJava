/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-02-03 02:17:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.moviedetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import movie.MovieVO;
import member.model.vo.Member;

public final class Moviedetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("movie.MovieVO");
    _jspx_imports_classes.add("member.model.vo.Member");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write('\r');
      out.write('\n');
 
	MovieVO movie = (MovieVO)request.getAttribute("movie");
// 별점을 등록할떄 어떤회원이 등록하는지 알아야하기때문에 로그인정보를 가져온다 
    Member loginUser = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"\r\n");
      out.write("    integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>moviedetail</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("    background: #363636;\r\n");
      out.write("}\r\n");
      out.write(".inline {\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Information {\r\n");
      out.write("    color: white;\r\n");
      out.write("    width : 100%;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("/* story 보드 및 전체 포함(이미지뺴고) */\r\n");
      out.write("#summary {\r\n");
      out.write("    color: white;\r\n");
      out.write("    width : 66%;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inline{\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("    border: 1px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrapper {\r\n");
      out.write("    width: 1190px;\r\n");
      out.write("    height: 1400px;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    border: 1px solid white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 10%;\r\n");
      out.write("    border: 1px solid white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer {\r\n");
      out.write("    background-color: rgb(24, 24, 24);\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 10%;\r\n");
      out.write("    border: 1px solid white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header {\r\n");
      out.write("    float: left;\r\n");
      out.write("    border: 1px solid white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header-menu {\r\n");
      out.write("    width: 5%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header1 {\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header2 {\r\n");
      out.write("    width: 55%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header2 > #search-form {\r\n");
      out.write("    width: 70%;\r\n");
      out.write("    height: 40%;\r\n");
      out.write("\r\n");
      out.write("    top: 0;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#search-text-area {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 85%;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#search-btn-area {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#search-input {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border-top-right-radius: 10px;\r\n");
      out.write("    border-bottom-right-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#search-btn {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border-top-left-radius: 10px;\r\n");
      out.write("    border-bottom-left-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header3 {\r\n");
      out.write("    width: 25%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    padding: 6px 8px 6px 16px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header3 a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    color: #a49e9e;\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    float: left;\r\n");
      out.write("    margin: 0 8px;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    position: absolute; \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logform {\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    height: 20%;\r\n");
      out.write("\r\n");
      out.write("    top: 0;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    position: absolute; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginform {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#joinform {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header3 a:hover {\r\n");
      out.write("    color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content1 {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 35%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content2 {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 32.5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content3 {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 32.5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html.open { \r\n");
      out.write("    overflow: hidden; \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".btn { \r\n");
      out.write("    width: 100%; \r\n");
      out.write("    height: 100%; \r\n");
      out.write("    position: absolute; \r\n");
      out.write("    left: 0px; \r\n");
      out.write("    top: 0px; \r\n");
      out.write("    z-index: 1; \r\n");
      out.write("    background-size: 50%; \r\n");
      out.write("    background-repeat: no-repeat; \r\n");
      out.write("    background-position: center; \r\n");
      out.write("    cursor: pointer; \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".close { \r\n");
      out.write("    width: 50px; \r\n");
      out.write("    height: 50px; \r\n");
      out.write("    position: absolute; \r\n");
      out.write("    right: 0px; \r\n");
      out.write("    top: 0px; \r\n");
      out.write("    background-size: 50%; \r\n");
      out.write("    background-repeat: no-repeat; \r\n");
      out.write("    background-position: center; \r\n");
      out.write("    cursor: pointer; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu a {\r\n");
      out.write("    padding: 10px 40px 10px 20px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    color: #818181;\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    float: left;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("#menu a:hover {\r\n");
      out.write("    color: #f1f1f1;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("#menu { \r\n");
      out.write("    width: 250px; \r\n");
      out.write("    height: 100%; \r\n");
      out.write("    position: fixed; \r\n");
      out.write("    top: 0px; \r\n");
      out.write("    left: -252px; \r\n");
      out.write("    z-index: 10; \r\n");
      out.write("    background-color: black; \r\n");
      out.write("    text-align: center; \r\n");
      out.write("    transition: All 0.2s ease; \r\n");
      out.write("    -webkit-transition: All 0.2s ease; \r\n");
      out.write("    -moz-transition: All 0.2s ease; \r\n");
      out.write("    -o-transition: All 0.2s ease; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu.open { \r\n");
      out.write("    left: 0px; \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".page_cover.open { \r\n");
      out.write("    display: block; \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".page_cover { \r\n");
      out.write("    width: 100%; \r\n");
      out.write("    height: 100%; \r\n");
      out.write("    position: fixed; \r\n");
      out.write("    top: 0px; \r\n");
      out.write("    left: 0px; \r\n");
      out.write("    background-color: rgba(0,0,0,0.4); \r\n");
      out.write("    z-index: 4; \r\n");
      out.write("    display: none; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*=============별점============*/\r\n");
      out.write(".star_rating {font-size:0; letter-spacing:-4px;}\r\n");
      out.write(".star_rating a {\r\n");
      out.write("    font-size:30px;\r\n");
      out.write("    letter-spacing:0;\r\n");
      out.write("    display:inline-block;\r\n");
      out.write("    margin-left:5px;\r\n");
      out.write("    color:#ccc;\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("    cursor : pointer;\r\n");
      out.write("}\r\n");
      out.write(".star_rating a:first-child {margin-left:0;}\r\n");
      out.write(".star_rating a.on {color:yellow;}\r\n");
      out.write("/*==============   상세페이지 전체=======================*/\r\n");
      out.write("#Information{\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Average{\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#story{\r\n");
      out.write("    \r\n");
      out.write("     margin-top: -7%;\r\n");
      out.write("}\r\n");
      out.write(".star_rating{\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#detail{\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".Attention{\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#comment-input{\r\n");
      out.write("    margin-top: 12%;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*====================리뷰 전체페이지==================*/\r\n");
      out.write("#form-commentInfo{ width: 100%; \r\n");
      out.write("} \r\n");
      out.write("  #comment-count{ margin-bottom: 10px; }\r\n");
      out.write("\r\n");
      out.write("  #comment-input{     width: 100%; height: 100px;\r\n");
      out.write("}  \r\n");
      out.write("  #submit{ background-color: rgb(0, 128,255); width: 5.5em; height: 3.3em;; font-size: 15px; font-weight: bold; color: aliceblue; \r\n");
      out.write("}\r\n");
      out.write("   #comments{ margin-top: 10px;\r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <div class=\"header\" id=\"header-menu\">\r\n");
      out.write("                <div class=\"btn\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"100%\" height=\"100%\" fill=\"currentColor\"\r\n");
      out.write("                        class=\"bi bi-justify\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\"\r\n");
      out.write("                            d=\"M2 12.5a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5z\">\r\n");
      out.write("                        </path>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header\" id=\"header1\">\r\n");
      out.write("                <p>로고</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header\" id=\"header2\">\r\n");
      out.write("                <form id=\"search-form\">\r\n");
      out.write("                    <section id=\"search-btn-area\">\r\n");
      out.write("                        <button type=\"submit\" id=\"search-btn\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\"\r\n");
      out.write("                                height=\"16\" fill=\"currentColor\" class=\"bi bi-search\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z\">\r\n");
      out.write("                                </path>\r\n");
      out.write("                            </svg></button>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section id=\"search-text-area\">\r\n");
      out.write("                        <input type=\"text\" id=\"search-input\" name=\"search-input\" placeholder=\"  보고싶은 영화를 검색해보세요.\">\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header\" id=\"header3\">\r\n");
      out.write("\r\n");
      out.write("                <form id=\"logform\">\r\n");
      out.write("                    <section id=\"loginform\">\r\n");
      out.write("                        <a href=\"#\">로그인</a>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section id=\"joinform\">\r\n");
      out.write("                        <a href=\"#\">회원가입</a>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div onclick=\"history.back();\" class=\"page_cover\"></div>\r\n");
      out.write("        <div id=\"menu\" class=\"\">\r\n");
      out.write("            <div onclick=\"history.back();\" class=\"close\">\r\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"100%\" height=\"100%\" fill=\"white\" class=\"bi bi-x-circle\"\r\n");
      out.write("                    viewBox=\"0 0 16 16\">\r\n");
      out.write("                    <path d=\"M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z\"></path>\r\n");
      out.write("                    <path\r\n");
      out.write("                        d=\"M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                </svg>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br><br><br><br>\r\n");
      out.write("            <a href=\"%>/views/mypage/mypagemain.jsp\">마이페이지</a><br>\r\n");
      out.write("            <a href=\"%>/views/mypage/mypageInterest.jsp\">관심 영화</a><br>\r\n");
      out.write("            <a href=\"#\">Watcha Party</a><br>\r\n");
      out.write("            <a href=\"#\">Netflix Party</a><br>\r\n");
      out.write("            <a href=\"#\">Q&amp;A</a><br>\r\n");
      out.write("            <a href=\"#\">STORE - Goods</a><br>\r\n");
      out.write("            <a href=\"#\">STORE - Ticket</a><br>\r\n");
      out.write("            <!-- ==================================여기서부터 바디내용 시작-======================================-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 이미지-->\r\n");
      out.write("        <div class=\"moviemain\">\r\n");
      out.write("            <div id=\"movieimg\" class=\"inline\">\r\n");
      out.write("           <img src=\"");
      out.print( movie.getM_image() );
      out.write("\"\r\n");
      out.write("            style=\"width:400px; \r\n");
      out.write("            height:500px;\">\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write(" </div>   <div id=\"summary\" class=\"inline\">\r\n");
      out.write("    <div id=\"Information\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <h2>");
      out.print( movie.getM_title() );
      out.write("</h2> \r\n");
      out.write("        <h3>");
      out.print( movie.getM_date() );
      out.write('/');
      out.print( movie.getM_country() );
      out.write('/');
      out.print( movie.getM_genre() );
      out.write("</h3>\r\n");
      out.write("        <h4>");
      out.print( movie.getM_director() );
      out.write("</h4> \r\n");
      out.write("        <div id=\"Average\">\r\n");
      out.write("            <h3>평균:</h3> </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <div id=\" story\">\r\n");
      out.write("    <h2>기본정보</h2> \r\n");
      out.write("    <br>\r\n");
      out.write("   ");
      out.print( movie.getM_summary() );
      out.write("\r\n");
      out.write("</div>   \r\n");
      out.write("           <!--  별점      \r\n");
      out.write("             로그인이 안되면  로그인페이지로  (if문)\r\n");
      out.write("       그러면 로그인이 된지 안된지를 어떻게 확인하지?  \r\n");
      out.write("      만약에 로그인상태에서 별점을 등록하면  강제 f5 로 평균 넘어오기 \r\n");
      out.write("      db에서 입력하고 그값을 다시 불러올 쿼리문도 필요  \r\n");
      out.write("      별점html 라디오버튼으로 (여기서 submit 전송이필요한가?) 한다음에 클릭버튼을 ★이걸로 대체한다 \r\n");
      out.write("      이벤트 효과로 별점등록 완료 창까지 뜨게 만든다 \r\n");
      out.write("      마우스로 클릭하면 css에서는 검은색별에서 클릭한수만큼 노란색으로 변경 \r\n");
      out.write("   html로 라디오버튼을 만든다음 라디오 버튼클릭버튼을 ★로 바꾼다음  div를 하나로 묶어서\r\n");
      out.write("      form태그안에 input type = radio 로 만들어서 id= star \r\n");
      out.write("      id=star1 value=1    \r\n");
      out.write("                         \r\n");
      out.write("              --> \r\n");
      out.write("             <div id=\"stargrade\">               \r\n");
      out.write("           <div class=\"star_rating\">\r\n");
      out.write("            <a class=\"on\">★</a>\r\n");
      out.write("            <a class=\"on\">★</a>\r\n");
      out.write("            <a class=\"on\">★</a>\r\n");
      out.write("            <a>★</a>\r\n");
      out.write("            <a>★</a>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write(" \r\n");
      out.write("        </div> \r\n");
      out.write("         <button id=\"starto\">별점넣기</button>\r\n");
      out.write("         </div>  \r\n");
      out.write("\r\n");
      out.write("        <!--    버튼-->      \r\n");
      out.write("        <div class=\"Attention\">\r\n");
      out.write("            <button class=\"button\">관심목록</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <details id=\"detail\">\r\n");
      out.write("        <summary><h3>더보기</h3></summary>\r\n");
      out.write("        <p> 시간남으면 유투브 리소스로 영화예고편 or 영화 주연배우들 넣을 계획</p>\r\n");
      out.write("      </details>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- -->\r\n");
      out.write("    <div id=\"form-commentInfo\">\r\n");
      out.write("           \r\n");
      out.write("    <input id=\"comment-input\" placeholder=\"댓글을 입력해 주세요.\">\r\n");
      out.write("    <button id=\"submit\">등록</button>\r\n");
      out.write("    <div id=\"comment-count\">댓글 <span id=\"count\">0</span></div> \r\n");
      out.write("   <div class=\"score\">\r\n");
      out.write("       <ul>\r\n");
      out.write("           <li>\r\n");
      out.write("               \r\n");
      out.write("              <div class=\"star_score\">★★★★★ <em>별점점수</em></div> \r\n");
      out.write("              <span class=\"st_on\"></span>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"score_reple\">\r\n");
      out.write("                    <p id=\"score\">\r\n");
      out.write("                    <!-- 스포일러 컨텐츠로 처리되는지 여부 -->\r\n");
      out.write("                 <h3>wwwww</h3>>\r\n");
      out.write("    </p>\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <em>\r\n");
      out.write("                <a href=\"#\" onclick=\"javascript:showPointListByNid(16402064);return false;\">\r\n");
      out.write("                    <span>베베(alfn****)    yy/mm/dd</span> \r\n");
      out.write("                </a>\r\n");
      out.write("                <!--줄바꿈-->\r\n");
      out.write("                <hr>\r\n");
      out.write("            </em>\r\n");
      out.write("       \r\n");
      out.write("        </dt>\r\n");
      out.write("        \r\n");
      out.write("    </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("               \r\n");
      out.write("        <div class=\"star_score\">★★★★★<em>별점점수</em></div> \r\n");
      out.write("        <span class=\"st_on\"></span>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"score_reple\">\r\n");
      out.write("              <p id=\"score\">\r\n");
      out.write("              <!-- 스포일러 컨텐츠로 처리되는지 여부 -->\r\n");
      out.write("           <h3>wwwww</h3>>\r\n");
      out.write("</p>\r\n");
      out.write("<dl>\r\n");
      out.write("  <dt>\r\n");
      out.write("      <em>\r\n");
      out.write("          <a href=\"#\" onclick=\"javascript:showPointListByNid(16402064);return false;\">\r\n");
      out.write("              <span>베베(alfn****)    yy/mm/dd</span> \r\n");
      out.write("          </a>\r\n");
      out.write("          <!--줄바꿈-->\r\n");
      out.write("          <hr>\r\n");
      out.write("      </em>\r\n");
      out.write(" \r\n");
      out.write("  </dt>\r\n");
      out.write("  \r\n");
      out.write("</dl>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("        <p>\r\n");
      out.write("            © 2021 MOVIEJAVA | 요금제 및 소개 : NETFLIX(넷플릭스) | 왓챠플레이<br>\r\n");
      out.write("            Data &amp; Content Image Based On Netflix.inc , Watcha.inc, TVNNG<br>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            Copyright© 2021, Moviejava , All Rights Reserved.\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   <script>\r\n");
      out.write("\r\n");
      out.write("        $(\".btn\").click(function () {\r\n");
      out.write("            $(\"#menu,.page_cover,html\").addClass(\"open\");\r\n");
      out.write("            window.location.hash = \"#open\";\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        window.onhashchange = function () {\r\n");
      out.write("            if (location.hash != \"#open\") {\r\n");
      out.write("                $(\"#menu,.page_cover,html\").removeClass(\"open\");\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        // html dom 이 다 로딩된 후 실행된다.\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            // menu 클래스 바로 하위에 있는 a 태그를 클릭했을때\r\n");
      out.write("            $(\".menu>a\").click(function () {\r\n");
      out.write("                var submenu = $(this).next(\"ul\");\r\n");
      out.write("\r\n");
      out.write("                // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기\r\n");
      out.write("                if (submenu.is(\":visible\")) {\r\n");
      out.write("                    submenu.slideUp();\r\n");
      out.write("                } else {\r\n");
      out.write("                    submenu.slideDown();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <!--  별점 기능 -->\r\n");
      out.write("    <script>\r\n");
      out.write("        $(\".star_rating a\").click(function () {\r\n");
      out.write("            $(this).parent().children(\"a\").removeClass(\"on\");\r\n");
      out.write("            $(this).addClass(\"on\").prevAll(\"a\").addClass(\"on\");\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("          \r\n");
      out.write("                //페이지가 열렸을때 해당코드를 실행할수있게  $(function(){\r\n");
      out.write("                 // 서블렛을 생성하고 url 만들기 \r\n");
      out.write("                  $(function(){\r\n");
      out.write("                \t  $(\"#starto\").click(function(){\r\n");
      out.write("                \t\t  var star= document.getElementsByClassName(\"on\");\r\n");
      out.write("                          // stargrade 에 별점 길이가들어간다 \r\n");
      out.write("                   \t\tvar stargrade= star.length;\r\n");
      out.write("                \t  \r\n");
      out.write("                  ");
 if(loginUser != null) {
      out.write("\r\n");
      out.write("                \t $.ajax({\r\n");
      out.write("                \t\t  url: \"");
      out.print( request.getContextPath());
      out.write("/Star\",\r\n");
      out.write("                \t\t  data : {stargrade:stargrade,\r\n");
      out.write("                \t\t\t    MovieVo:");
      out.print(movie.getM_code());
      out.write("\r\n");
      out.write("                \t\t\t  },\r\n");
      out.write("                \t\t  type :\"post\", \r\n");
      out.write("                \t\t  success: function(result){\r\n");
      out.write("                \t\t\t  var Average = \r\n");
      out.write("                \t\t\t\t  // \r\n");
      out.write("                \t\t\t\t  \"<h3>평균: </h3>\" +result; \r\n");
      out.write("                \t\t\t  $(\"#Average\").html(Average);\r\n");
      out.write("                \t\t  },\r\n");
      out.write("                \t\t  error : function(e){\r\n");
      out.write("                \t\t\t  console.log(e);\r\n");
      out.write("                \t\t  }\r\n");
      out.write("                \t\t\t  \r\n");
      out.write("                \t  })\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                alert(\"로그인후 이용가능한 서비스입니다.\");\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                \t  })\r\n");
      out.write("                  }) \r\n");
      out.write("           \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 댓글 150자이상 금지 -->\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        // textarea에서 keyup 이벤트 발생했을 경우\r\n");
      out.write("        $(\"textarea\").keyup(function(){\r\n");
      out.write("            // textarea의 길이 값 저장\r\n");
      out.write("            var inputLength = $(this).val().length;\r\n");
      out.write("            $(\"#counter\").html(inputLength);\r\n");
      out.write("\r\n");
      out.write("            var remain = 150 - inputLength;\r\n");
      out.write("\r\n");
      out.write("            if(remain >= 0)\r\n");
      out.write("                $(\"#counter\").css(\"color\", \"black\");\r\n");
      out.write("            else\r\n");
      out.write("                $(\"#counter\").css(\"color\", \"red\");\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
