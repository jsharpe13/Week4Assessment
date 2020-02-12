<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rock Paper Scissors Results</title>
</head>
<body>
<p>${userChoicePouch.getResults()}<br />
${userChoicePouch.getplayerResult()} - your choice <br />
${userChoicePouch.getcomputerResult()} - computer's choice<br />
</p>
<a href="RPS.jsp">try again</a>
<a href="degrees.jsp">Degree Conversion</a>
<a href="index.jsp">Home</a>
</body>
</html>