package com.signUp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	String name = req.getParameter("username");
	String email = req.getParameter("mail");
	String password = req.getParameter("password");
	String age = req.getParameter("age");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3307/signup","root","9622289090");
		
		PreparedStatement ps = conn.prepareStatement("insert into userlogin values(?,?,?,?)");
		
		
		out.print("send");
		ps.setString(1, name);
		ps.setString(2,  email);
		ps.setString(3, password);
		ps.setString(4, age);
		
		int i = ps.executeUpdate();
		if(i>0) {
			out.println("You are successfully registered.....");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		out.print("error");
		e.printStackTrace();
	}
	
	
}
}
