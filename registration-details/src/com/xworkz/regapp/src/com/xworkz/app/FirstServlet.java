package com.xworkz.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;


@WebServlet("/index")
public class FirstServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		PageContext
	 String name=      req.getParameter("name");
	 String place=      req.getParameter("place");
	 String occ=      req.getParameter("occupation");
	 
	   req.setAttribute("nm",name);
	   req.setAttribute("place",place);
	   req.setAttribute("occupation",occ );
	 
	   //chaining from one servlet to jsp (by passing the name of the jsp)
	   RequestDispatcher dispatcher = req.getRequestDispatcher("final.jsp");
	   dispatcher.forward(req, resp);
	}

}
