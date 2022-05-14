package com.servlets;

import java.io.*;
import jakarta.servlet.*;

public class SecondServlet extends GenericServlet {
	
	public void service(ServletRequest req,ServletResponse resp) throws IOException {
		System.out.println("Generic responding....");
		PrintWriter out = resp.getWriter();
		out.println("<h1>GENERIC WORKING FINE</h1>");
	}
}
