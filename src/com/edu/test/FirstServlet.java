package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 실행됨!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 실행됨!");
	}
	
}
