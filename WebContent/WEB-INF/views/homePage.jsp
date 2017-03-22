<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Bake It Web Store</title>
	<script src='<c:url value="/resources/js/jquery-3.2.0.min.js" />'></script>
	<script src='<c:url value="/resources/js/common.js" />'></script>
</head>
<body>
	${welcomeMessage}
	<br>
	<p>Click the below button to load create an ajax request and load the values from a JSON file</p>
    <br>
    <button id="clickMe" type="button">Click Me!</button>
    <br>
    <div id="tableDiv">
    </div>
</body>
</html>