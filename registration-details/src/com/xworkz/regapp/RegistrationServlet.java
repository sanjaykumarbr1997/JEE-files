package com.xworkz.regapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.xworkz.regapp.dto.RegisterDTO;
import com.xworkz.regapp.service.RegisterService;
import com.xworkz.regapp.service.RegisterServiceImpl;


@WebServlet("/reqs")

public class RegistrationServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age = req.getParameter("age");
		
		PrintWriter printWriter = res.getWriter();
		res.setContentType("text/html");
		printWriter.print("Thank you "+name);
		
		
		RegisterDTO dto = new RegisterDTO();
		dto.setName(name);
		dto.setEmail(email);
		dto.setAge(age);
		
		RegisterService registerService = new RegisterServiceImpl() ;
		registerService.validateAndSave(dto);
		
	}

}
