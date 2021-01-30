<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Search</title>
</head>
<body>
<h1>User Search Form</h1>
	<form action="/" method="POST">
		User ID: <input type="text" name="id" /> <input type="submit"
			value="search" />
	</form>
	<div style="color: red">${error}</div>
</body>
</html>