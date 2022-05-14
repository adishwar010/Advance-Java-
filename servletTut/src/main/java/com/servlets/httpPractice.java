package com.servlets;

import java.io.*;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class httpPractice extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String Contact = req.getParameter("contact");
		String Email = req.getParameter("mail");
		String Password = req.getParameter("password");
//		super.doPost(req, resp);
		out.println("Username: "+username);
		out.print("<br />");
		out.println("Email: "+Email);
		out.print("<br />");
		out.println("Contact: "+Contact);
		out.print("<br />");
		out.println("Password: "+Password);
		out.print("<br />");
		
	}
}
