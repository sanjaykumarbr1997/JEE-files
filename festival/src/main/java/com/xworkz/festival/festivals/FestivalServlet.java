package com.xworkz.festival.festivals;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.festival.festivals.dto.FestivalDTO;
import com.xworkz.festival.festivals.service.FestivalService;
import com.xworkz.festival.festivals.service.FestivalServiceImpl;

@WebServlet("/fest")
public class FestivalServlet extends HttpServlet {
	
	public FestivalServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("festivalName");
		String festivalMonth = req.getParameter("festivalMonth");
		String festivalDays = req.getParameter("festivalDays");
		
		FestivalDTO festivalDTO = new FestivalDTO();
		festivalDTO.setName(name);
		festivalDTO.setMonth(festivalMonth);
		festivalDTO.setDays(festivalDays);
		
		FestivalService  fService = new FestivalServiceImpl();
		fService.validateAndSave(festivalDTO);
		
		List<FestivalDTO> lsDTO = fService.getAllDetails();
		req.setAttribute("listOfFestivals",lsDTO );
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req,resp);
		
		
		
		
		
		
	}

}
