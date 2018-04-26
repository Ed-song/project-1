package com.atguigu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestCookie
 */
@WebServlet("/TestCookie")
public class TestCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      //1.创建cookie对象
 		Cookie cookie = new Cookie("name","admin");
 		response.addCookie(cookie);
 		//转发给页面
 		response.sendRedirect("index.jsp");
 	}

}
