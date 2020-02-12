<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Degree Conversion</title>
</head>
<body>
	<h1>Degree Conversion</h1>
	<form action = "getConversionServlet" method= "post">
	Enter the initial temperature in either (C)elsius or (F)ahrenheit
	<input type="text" name="userTemp" size="10">
	<input type="text" name="currentScale" size="1">
	<input type="submit" value="Convert to new" />
	</form>
</body>
</html>