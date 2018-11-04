package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		String temp = "<br/>";
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body");
		out.print("<h3>네트워크 관련 요청 정보 </h3>");
		out.print("Request Scheme : " + req.getScheme() + temp);
		out.print("Server Name: " + req.getServerName() + temp);
		out.print("Server Address: " + req.getLocalAddr() + temp);
		out.print("Server Port: " + req.getLocalPort() + temp);
		out.print("Client Address: " + req.getRemoteAddr() + temp);
		out.print("Client Host: " + req.getRemoteHost() + temp);
		out.print("Client Port: " + req.getRemotePort() + temp);
		out.print("</body></html>");
		out.close();
	}

}
