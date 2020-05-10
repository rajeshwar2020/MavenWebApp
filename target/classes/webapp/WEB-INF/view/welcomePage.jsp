<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cafe</title>
</head>
<body>
	<h1 align="center">${cafeName}</h1>
	<hr>
	<form action="orderPlaced">
		<label for="abc">Item name: </label> 
		<input type="text" name="dish" placeholder="???" id="abc" /> 
		<input type="submit" value="Order" />
	</form>
	
</body>
</html>