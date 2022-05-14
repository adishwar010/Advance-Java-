package com.servlets;

import java.io.*;

import jakarta.servlet.*;

public class FirstServlet implements Servlet {
	
//	init
	public void init(ServletConfig conf) {
		System.out.println("Servlet Started...");
	}
	
//	service
	public void service(ServletRequest req,ServletResponse resp) throws IOException {
		System.out.println("Servlet servicing...");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>ADISHWAR RESPONDING!</h1>");
		String msg = req.getParameter("name");
		out.println(msg);
	}
//	destroy
	public void destroy() {
		System.out.println("servlet destroyed");
	}
	
//	Non LifeCycle Methods
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	public String getServletInfo() {
		return null;
	}
	
}
