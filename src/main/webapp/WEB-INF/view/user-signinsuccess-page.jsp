<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
span {
	color: blue;
	font-family: arial;
}
</style>
</head>
<meta charset="ISO-8859-1">
<title>Signin success page</title>
</head>
<body>

	<h1 align="center">
		<span>Signed in Successful..!!</span>
	</h1>
	<hr>
	<form:form action="payment">
	<div align="center">
		<p>Your registered details are:</p>
		Your Name : ${userSign.name} <br>
		User Name :${userSign.username} <br> 
		Password : ${userSign.password} <br>
		Hobbies : ${userSign.hobbies} <br>
		Country Name :${userSign.country} <br>
		Gender : ${userSign.gender}<br/>
		Age : ${userSign.age}<br/>
		Email : ${userSign.userCommunicationDTO.email}<br/>
		Phone : ${userSign.userCommunicationDTO.phone}<br/>
		
		<h2 align="center"> <span>Payment..</span></h2>
		<div align="center">
		<a href="payment">Make payment to click this link</a>
		</div>
	</div>
	</form:form>
</body>
</html>