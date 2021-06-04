package com.xworkz.regapp.registration;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/reqs")

public class RegistrationServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age = req.getParameter("age");
		
		PrintWriter printWriter = res.getWriter();
		res.setContentType("text/html");
		printWriter.print("Thank you"+name);
		
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/fbn","root","passw");
			preparedStatement =connection.prepareStatement("insert into user_details values(?,?,?,?) ");
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(4, age);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);	
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
			
		
	}

}
