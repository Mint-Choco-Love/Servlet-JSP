package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookie2")
public class CookieTest2Servlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		Cookie[] list = req.getCookies();
		for(int i = 0; list != null && i < list.length; i++) {
			out.println(list[i].getName() + " : " + list[i].getValue() + "<br />");
		}
		out.close();
	}
}
