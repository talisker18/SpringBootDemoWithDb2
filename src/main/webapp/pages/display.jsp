<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>Sid</th>
			<th>sName</th>
			<th>SEmail</th>
		</tr>
		
		<c:forEach var="student" items="${list}">
			 <tr>
				<td>${student.sid}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
			</tr>
        </c:forEach>  
	</table>
	
	
</body>
</html>