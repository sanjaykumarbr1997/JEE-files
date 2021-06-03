package com.xworkz.regapp.registration2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/reqs")

public class Registration extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age = req.getParameter("age");
		
		PrintWriter printWriter = res.getWriter();
		res.setContentType("text/html");
		printWriter.print("Thank you"+name);
	}

}
