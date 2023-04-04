<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in</title>
</head>
<body>
	<h2>Welcome to the login page!</h2>
	<h3>${error}</h3>
	<form method="post">
	Name: <input type="text" name="name">
	Password: <input type="text" name="password">
	<input type="submit">
	</form>
</body>
</html>