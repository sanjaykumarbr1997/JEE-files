package com.xworkz.netflix_app.netflix;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import org.hibernate.HibernateException;

import com.xworkz.netflix_app.netflix.dto.NetflixDTO;
import com.xworkz.netflix_app.netflix.service.NetflixService;
import com.xworkz.netflix_app.netflix.service.NetflixServiceImpl;

@WebServlet(urlPatterns="/net",loadOnStartup=72,initParams= { 
		@WebInitParam(name="key",value="Roy")
		
		
})


public class NetflixServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException  {

			ServletConfig config =getServletConfig();
			String name = config.getInitParameter("key");
			System.out.println(name);
			
			ServletContext context = getServletContext();
			String msg = context.getInitParameter("message");
			
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
			/*
			PrintWriter printWriter2 = res.getWriter();
			res.setContentType("text/html");
			printWriter2.print("thank you"+name+" "+msg);
			
			*/
			List<NetflixDTO> netDTOs;
			try {
				netDTOs = netflixService.validateAndFetch();
				PrintWriter printWriter = res.getWriter();
				res.setContentType("text/html");

				printWriter.println("<html> \r\n" + 
						"	 <meta charset=\\\"ISO-8859-1\\\"> \r\n" + 
						"	<head>\r\n" +
						"	<title>Movies List</title> \r\n" + 
						"	<h3 style:>Entries Updated<h3>\r\n" +
						"	<style>\r\n" + 
						"       	 table,td,th{\r\n" + 
						"            border:  solid ;\r\n" + 
						"		    border-collapse: collapse;\r\n" + 
						         
						"            } \r\n" + 
						"		        	   		\r\n" + 
						"		        	   		\r\n" + 
						"		   </style>\r\n" + 
						"		    </head>\r\n" + 
						"		    <body bgcolor=black>\r\n" + 
						"		        	   	    	   \r\n" + 
						"		        <table align=\"center\" style=\"color: red;\" > \r\n" + 
						"                 \r\n" + 
						"                <caption style=\"font-size: 30px;\">ENTRIES UPDATED</caption>         \r\n" +
						"                   <tr>\r\n" + 
						"                        <th style=\"height: 50px;width: 100px;\">Id</th>\r\n" + 
						"                        <th style=\"height: 50px;width: 100px;\">Name</th>\r\n" + 
						"                        <th style=\"height: 50px;width: 100px;\">Type</th>\r\n" + 
						"                        <th style=\"height: 50px;width: 100px;\">Ratings</th>\r\n" + 
						"                        <th style=\"height: 50px;width: 100px;\">Release Year</th>\r\n" + 
						"                    </tr> </table> ");  
		       for(NetflixDTO netsDTO :netDTOs){
		           if(netsDTO!=null){
		        	   printWriter.print("<table align=\"center\" style=\"color: red;\">"
		        	   		+ "<tr>\r\n" + 
		        	   		"                        <td style=\"height: 50px;width: 100px;\">"+netsDTO.getId()         +"</td>\r\n" + 
		        	   		"                        <td style=\"height: 50px;width: 100px;\">"+netsDTO.getName()       +"</td>\r\n" + 
		        	   		"                        <td style=\"height: 50px;width: 100px;\">"+netsDTO.getType()       +"</td>\r\n" + 
		        	   		"                        <td style=\"height: 50px;width: 100px;\">"+netsDTO.getRatings()    +"</td>\r\n" + 
		        	   		"                        <td style=\"height: 50px;width: 100px;\">"+netsDTO.getReleaseYear()+"</td>\r\n" + 
		        	   		"                    </tr>   		\r\n" + 
		        	   		"		        \r\n" + 
		        	   		"\r\n" + 
		        	   		"		        	   		\r\n" + 
		        	   		"		    	</table>\r\n" + 
		        	   		"            </body>\r\n" + 
		        	   		" </html>");
		      
		           }

			
		           	}
			} catch (HibernateException e) {
				e.printStackTrace();
			} 
	         
			
	      
	}

}
