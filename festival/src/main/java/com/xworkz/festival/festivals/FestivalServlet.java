package com.xworkz.festival.festivals;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xworkz.festival.festivals.dto.FestivalDTO;
import com.xworkz.festival.festivals.service.FestivalService;
import com.xworkz.festival.festivals.service.FestivalServiceImpl;

@WebServlet("/fest")
public class FestivalServlet extends HttpServlet {
	
	public FestivalServlet() {
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
		//req.setAttribute("listOfFestivals",lsDTO );
		
		//Session
				//1.Get reference of session object 
				HttpSession httpSession = req.getSession();
				
				//2.Set age for session object
				httpSession.setMaxInactiveInterval(200);
				
				//3.add session object into scope
				httpSession.setAttribute("name", name);
				
				
		//Cookie information
		//1.Create an object of cookie class
		Cookie ckie = new Cookie("ccccccobject",httpSession.getId());
		//2.Set age for cookie
		ckie.setMaxAge(5000);
		//3.Add coookie into response headr
		resp.addCookie(ckie);
		
		
		
		
		//RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		RequestDispatcher dispatcher = req.getRequestDispatcher("cook");
		dispatcher.forward(req,resp);
		
		
		
		
		
		
	}

}
