package com.xworkz.festival.festivals;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/cook")
public class CookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//4.Fetching all cookie object back from response header
		Cookie cookie[] = req.getCookies();
		
		//4.Fetch the session object back from the scope
		HttpSession httpSession = req.getSession(false);
		String name = (String) httpSession.getAttribute("name");
		
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.print("Cookie Value" +cookie[0].getValue());
		pw.print("Session scope data" +"  "+name+" "+httpSession.getId());
	}

}
