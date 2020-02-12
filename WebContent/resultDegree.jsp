<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Degree Conversion</title>
</head>
<body>
<p>${modifierPouch.getInitialTemp()} ${modifierPouch.getInitialScale()}<br />
${modifierPouch.getFinalScale()} ${modifierPouch.getFinalTemp()}<br />
</p>
<a href="degrees.jsp">try again</a>
<a href="RPS.jsp">Rock Paper Scissors Game</a>
<a href="index.jsp">Home</a>
</body>
</html>