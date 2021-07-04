<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td, tr {
	border: solid black;
	border-collapse: collapse;
	height: 50px;
	width: 100px;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>Id</th>
			<th>Festival Name</th>
			<th>Festival Month</th>
			<th>Festival No of Days</th>
		
		</tr>
		<caption style="font-size: 30px;">List Of Festivals</caption>

		<c:forEach var="festival" items="${listOfFestivals }">

			<tr>
				<td>${festival.getId() }</td>
				<td>${festival.getName() }</td>

				<td>${festival.getMonth() }</td>

				<td>${festival.getDays() }</td>
				<br>
			</tr>




		</c:forEach>
	</table>
</body>
</html>