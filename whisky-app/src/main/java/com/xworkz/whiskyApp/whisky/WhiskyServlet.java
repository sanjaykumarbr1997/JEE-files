package com.xworkz.whiskyApp.whisky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.whiskyApp.whisky.dto.WhiskyDTO;
import com.xworkz.whiskyApp.whisky.service.WhiskyService;
import com.xworkz.whiskyApp.whisky.service.WhiskyServiceImpl;

@WebServlet("/whisky")
public class WhiskyServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nam = req.getParameter("whiskyName");
		String quan = req.getParameter("whiskyQuantity");
		String ord = req.getParameter("whiskyOrderd");
		String price = req.getParameter("whiskyPrice");
		
		WhiskyDTO wDTO = new WhiskyDTO();
		wDTO.setName(nam);
		wDTO.setQuantity(quan);
		wDTO.setOrderdNo(ord);
		wDTO.setPrice(price);
		
		WhiskyService wService = new WhiskyServiceImpl();
		wService.validateAndSave(wDTO);
		
		//adding attribute
		req.setAttribute("na", nam);
		req.setAttribute("qu", quan);
		req.setAttribute("or", ord);
		req.setAttribute("pr", price);
		
		//servlet chaining
		RequestDispatcher rd = req.getRequestDispatcher("cart");
		rd.forward(req, resp);
		//rd.include(req,resp);
		
		
		
	}

}
