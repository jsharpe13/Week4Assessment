<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rock Paper Scissors</title>
</head>
<body>
	<h1>Rock, Paper, Scissors</h1>
	<form action="getWinnerServlet" method="post">
	Enter either rock paper or scissors:
	<input type="text" name="userInput" size="10">
	<input type="submit" value="determine winner" />
	</form>
</body>
</html>