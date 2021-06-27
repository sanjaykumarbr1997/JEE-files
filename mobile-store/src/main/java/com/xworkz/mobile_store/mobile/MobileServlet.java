package com.xworkz.mobile_store.mobile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mobile_store.mobile.dto.MobileDTO;
import com.xworkz.mobile_store.mobile.service.MobileService;
import com.xworkz.mobile_store.mobile.service.MobileServiceImpl;

@WebServlet(urlPatterns ="/mobile" ,loadOnStartup=72,initParams= {
		@WebInitParam(name="key",value="Mob")
})
public class MobileServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String mobName = req.getParameter("mobileName");
		String mobColor = req.getParameter("mobileColor");
		String mobPrice = req.getParameter("mobilePrice");
		
		 ServletConfig config = getServletConfig();
		 String nm =config.getInitParameter("key");
		
		MobileDTO mDTO = new MobileDTO();
		mDTO.setName(mobName);
		mDTO.setColor(mobColor);
		mDTO.setPrice(mobPrice);
		
		MobileService mService = new MobileServiceImpl();
		mService.validateAndSave(mDTO);
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.print("thank you for entering details of"+mobName+"value is"+nm);
	}

}
