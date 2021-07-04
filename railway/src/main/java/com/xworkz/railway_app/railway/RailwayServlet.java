package com.xworkz.railway_app.railway;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ticket")
public class RailwayServlet extends HttpServlet {
	
	public RailwayServlet() {
		System.out.println("Railway Servlet object is created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String trainNo = req.getParameter("trainNo");
		String source = req.getParameter("trainSource");
		String destin = req.getParameter("trainDestination");
		
		req.setAttribute("nam", "Thank you for booking :"+name+"Happy journey");
		RequestDispatcher dispatcher = req.getRequestDispatcher("railway.jsp");
		dispatcher.forward(req, resp);
		
	}

}
