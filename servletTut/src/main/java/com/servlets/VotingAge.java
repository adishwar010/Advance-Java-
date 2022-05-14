package com.servlets;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class VotingAge extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("Username");

		String age = req.getParameter("Userage");
		
		int ag = Integer.parseInt(age);
		if(ag>=18) {
			out.print("<h1>"+name+" is eligible to vote</h1>");
//			out.print();
		}else {
			out.print("<h1>is not eligible to vote</h1>");
		}
	}
}
