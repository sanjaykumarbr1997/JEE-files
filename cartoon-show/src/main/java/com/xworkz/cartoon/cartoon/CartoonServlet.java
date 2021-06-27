package com.xworkz.cartoon.cartoon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cartoon.cartoon.dto.CartoonDTO;
import com.xworkz.cartoon.cartoon.service.CartoonService;
import com.xworkz.cartoon.cartoon.service.CartoonServiceImpl;



@WebServlet("/cartoon")
public class CartoonServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String cartoonName =req.getParameter("cartoonName");
		String cartoonRatings = req.getParameter("cartoonRatings");
		String cartoonReleaseYear = req.getParameter("cartoonReleaseYear");
		
		CartoonDTO cartDTO = new CartoonDTO();
		cartDTO.setName(cartoonName);
		cartDTO.setRatings(cartoonRatings);
		cartDTO.setRelease_year(cartoonReleaseYear);
		
		CartoonService cartoonService = new CartoonServiceImpl();
		cartoonService.validateAndSave(cartDTO);
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.print("thank you for entering details of:"+cartoonName);
		
		
		
		
		
		
	}

}
