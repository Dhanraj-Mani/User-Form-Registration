<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
span{
color: blue;
font-family: Italic;
}
</style>
<meta charset="ISO-8859-1">
<title>payment page</title>
</head>
<body>
	
	<h1 align="center"><span>Payment page..!!</span></h1>
	<hr>
	<form:form action="paymentSuccess" modelAttribute="userBill" method="GET">
	<table align="center" border="1">
	<tr>
	<td><label>Credit Card Number :</label></td>
	<td><form:input path="creditcard"/></td>
	</tr>
	
	<tr>
	<td><label>Amount :</label></td>
	<td><form:input path="amount"/></td>
	</tr>
	
	<tr>
	<td><label>Currency :</label></td>
	<td><form:input path="currency"/></td>
	<tr>
		
	<tr>
	<td><label for="date_format">Date :</label></td>
	<td><form:input path="date" placeholder="dd-mm-yyyy" id="date_formate"/></td>
	<tr>
	
	<tr>
	<td>
	<a href="paymentSuccess"><input type="button" value="proceed"></a>
	</td>
	</tr>
	
	</table>
	</form:form>	
</body>
</html>