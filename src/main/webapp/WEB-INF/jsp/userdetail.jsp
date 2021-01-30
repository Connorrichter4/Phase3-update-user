<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
<h1>Update User Form</h1>
	<form action="/update/${user.id}" method="POST">
		User ID: ${user.id}<br /> 
		User Name: <input type="text" name="name" value="${user.name}"/><br />  
		User Password: <input type="text" name="password" value="${user.password}" /><br /> 
		<input
			type="submit" value="Update" />
	</form>
</body>
</html>