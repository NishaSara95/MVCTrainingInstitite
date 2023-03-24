<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Management</title>
</head>
<body>
<div align="center">
	<h2>Application Management</h2>
		<h3><a href="add">Add Application</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>applicationid</th>
			<th>description</th>
			<th>applicationname</th>
			<th>owner</th>
		</tr>
		<c:forEach items="${applications}" var="application">
		<tr>
			<td>${application.applicationid}</td>
			<td>${application.description}</td>
			<td>${application.applicationname}</td>
			<td>${application.owner}</td>
			
			<td>
				<a href="editDetails/${application.applicationid}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete/${application.applicationid}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>