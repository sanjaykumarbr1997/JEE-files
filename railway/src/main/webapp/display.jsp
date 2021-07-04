<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Railway</title>
</head>
<body>

	
	<!-- scriptlet tag -->
	<%
	String name = request.getParameter("name");
	String trainNo = request.getParameter("trainNo");
	String source = request.getParameter("trainSource");
	String destin = request.getParameter("trainDestination");
	
	/* request.setAttribute("nam", "Thank you for booking :"+name+"Happy journey");
	RequestDispatcher dispatcher = request.getRequestDispatcher("railway.jsp");
	dispatcher.forward(request, response); */
		
	

		Date date = new Date(); 
	%>
	<%=date%> 
	
	<!-- expression tag -->
	<%=getData() %>
		<!-- declarative tag -->
		<%!public Date getData(){
			Date dat = new Date();
			return dat;
		}%>
	
	

</body>
</html>