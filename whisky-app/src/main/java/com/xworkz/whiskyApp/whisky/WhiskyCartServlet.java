package com.xworkz.whiskyApp.whisky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cart")
public class WhiskyCartServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	//getting attribute
		String nme = (String) req.getAttribute("na");
		String qty = (String)req.getAttribute("qu");
		String ordNo = (String)req.getAttribute("or");
		String price = (String)req.getAttribute("pr");
		
		double totalValue = Double.parseDouble(price)*Integer.parseInt(ordNo);
	

	PrintWriter pw = resp.getWriter();
	resp.setContentType("text/html");
	pw.println("Total cart value of "+nme+ "  :"+totalValue);
	}

}
