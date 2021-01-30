<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 1rem;
}
</style>
</head>
<body>
	<h1>Success!</h1>
	<h3>Showing updated user below:</h3>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.password}</td>
		</tr>
	</table>
</body>
</html>