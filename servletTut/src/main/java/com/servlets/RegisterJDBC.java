package com.servlets;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class RegisterJDBC extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		String email = req.getParameter("mail");
		String country = req.getParameter("country");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/servlet","root","9622289090");
			PreparedStatement ps=con.prepareStatement("insert into userlogin values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2, pass);
			ps.setString(3,email);
			ps.setString(4,country);
			
			int i = ps.executeUpdate();

            if (i > 0) {

                out.println("You are successfully registered.....");

            }
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
