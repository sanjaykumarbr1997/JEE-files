package com.xworkz.waterPurifier.waterpurifier;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wpr")
public class WaterPurifierServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("wpName");
		String type = req.getParameter("wpType");
		String qnty = req.getParameter("wpOrderd");
		String price = req.getParameter("wpPrice");
		
		//setting attribute
		req.setAttribute("na", name);
		req.setAttribute("ty", type);
		req.setAttribute("qu", qnty);
		req.setAttribute("pr", price);
		
		//chaining
		resp.sendRedirect("https://www.kent.co.in/gdn-new/index.php?utm_source=Google_Paid&utm_campaign=Water_Purifier_Brand_Keywords_BMM_Demo_Search&utm_medium=Google_Search&utm_term=Buy&utm_content=Text_Ads&gclid=CjwKCAjww-CGBhALEiwAQzWxOvMrlwhxzcLClOFKzYhPTaH_sE34rNR15xWgld4GNLyCqJpp-gvdpBoCaKwQAvD_BwE"+name);
		
		
		
	}

}
