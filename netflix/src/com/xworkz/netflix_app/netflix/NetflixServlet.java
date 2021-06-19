package com.xworkz.netflix_app.netflix;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.xworkz.netflix_app.netflix.dto.NetflixDTO;
import com.xworkz.netflix_app.netflix.service.NetflixService;
import com.xworkz.netflix_app.netflix.service.NetflixServiceImpl;

@WebServlet(urlPatterns="/net",initParams= { 
		@WebInitParam(name="key",value="Roy")
		
		
})


public class NetflixServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)throws ServletException  {

			ServletConfig config =getServletConfig();
			String name = config.getInitParameter("key");
			System.out.println(name);
			
			String movieName=req.getParameter("movieName");
			String movieType=req.getParameter("movieType");
			String movieRatings = req.getParameter("movieRatings");
			String movieReleaseYear = req.getParameter("movieReleaseYear");
			
			
			NetflixDTO dto = new NetflixDTO();
			dto.setName(movieName);
			dto.setType(movieType);
			dto.setRatings(movieRatings);
			dto.setReleaseYear(movieReleaseYear);
			
			
			
		
			NetflixService netflixService = new NetflixServiceImpl() ;
			netflixService.validateAndSave(dto);
			
			
			
			List<NetflixDTO> netDTOs;
			try {
				netDTOs = netflixService.validateAndFetch();
				PrintWriter printWriter = res.getWriter();
				res.setContentType("text/html");
				printWriter.write("Thank you ");
				printWriter.println(" ");
		       for(NetflixDTO netsDTO :netDTOs){
		           if(netsDTO!=null){
		        	   printWriter.print(" <html>\r\n" + 
		        	   		"	        	   <head>\r\n" + 
		        	   		"	        	   <meta charset=\"ISO-8859-1\">\r\n" + 
		        	   		"	        	   <title>Movies List</title>\r\n" + 
		        	   		"                   <style>table,td{\r\n" + 
		        	   		"        border: 1px solid black;\r\n" + 
		        	   		"        border-collapse: collapse;     \r\n" + 
		        	   		
		        	   		"\r\n" + 
		        	   		"        } </style>"+
		        	   		"	        	   </head>\r\n" + 
		        	   		"	        	   <body bgcolor=white>\r\n" + 
		        	   		"	        	   	\r\n" + 
		        	   		"\r\n" + 
		        	   		"	        	  \r\n" + 
		        	   		"	        	   <table border=\"2\" bgcolor=\"grey\" > \r\n" + 
		        	   		
		        	   		"	        		<tr> \r\n" + 
		        	   		"	        			<td style=\"height:50px;width:100px\" >"+ netsDTO.getId()+"</td>\r\n" + 
		        	   		"	        			<td style=\"height:50px;width:100px\"> "+ netsDTO.getType()+" </td>   \r\n" + 
		        	   		"	        			<td style=\"height:50px;width:100px\">"+ netsDTO.getName()+"</td>\r\n" + 
		        	   		"	        			<td style=\"height:50px;width:100px\">"+ netsDTO.getRatings()+"</td>\r\n" + 
		        	   		"	        			<td style=\"height:50px;width:100px\">"+ netsDTO.getReleaseYear()+"</td>\r\n" + 
		        	   		"\r\n" + 
		        	   		"	        		</tr>\r\n" + 
		        	   		"\r\n" + 
		        	   		"	        		\r\n" + 
		        	   		"\r\n" + 
		        	   		
		        	   		"	        	</table>\r\n" + 
		        	   		"	        	</body>\r\n" + 
		        	   		"	        	   </html>");
		      
		           }

			
		           	}
			} catch (SQLException |ClassNotFoundException | IOException e) {
				e.printStackTrace();
			} 
	         
			
	      
	}

}
