package com.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class ThirdServlet extends HttpServlet {
	
	@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String str1 = req.getParameter("uname");
		
		out.println(str1);
//		super.doPost(req, resp);
		}	
		
	
	
}
