package com.xworkz.self_driving.selfdriving;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.self_driving.selfdriving.dto.SelfDrivingDTO;
import com.xworkz.self_driving.selfdriving.service.SelfDrivingService;
import com.xworkz.self_driving.selfdriving.service.SelfDrivingServiceImpl;

@WebServlet("/selfdrive")
public class SelfDrivingServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ServletContext sContext = getServletContext();
		String msg = sContext.getInitParameter("message");
		String nam = req.getParameter("sdCustomerName");
		String loc = req.getParameter("sdCustomerLocation");
		String mo= req.getParameter("sdCustomerNumber");
		
		SelfDrivingDTO sDTO = new SelfDrivingDTO();
		sDTO.setName(nam);
		sDTO.setLocation(loc);
		sDTO.setMobileNo(mo);
		SelfDrivingService sService  = new SelfDrivingServiceImpl();
		sService.validateAndSave(sDTO);
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.print("thank you for entry "+msg);
		
	}
	

}
