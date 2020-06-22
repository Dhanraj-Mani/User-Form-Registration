<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.error{
color: red;
margin-left: 30px;
position: fixed;
text-align: left;
}
</style>

<style type="text/css">
span{
color: blue;
font-family: arial;
}
</style>

<meta charset="ISO-8859-1">
<title>Login page</title>

<script type="text/javascript">
function validateUserName(){

	var userName = document.getElementById("un").value
	alert("UserName can't be less than five charectors")
	if(userName.length < 5){
		return false;
	}
		else{
			return true;
			}

}
</script>


</head>
<body>

	
	<h1 align="center"> <span> Welcome to login page </span> </h1>
	<hr>
	<form:form action ="loginsuccess" method="get" modelAttribute="userReg" onsubmit="return validateUserName()">
	<div align="center">
	<p>
	<label>User Name :</label>
	<input type="text" name="userName" id="un" />
	<form:errors path="userName" cssClass="error"></form:errors>
	
	<br></p>
	
	<p>
	<label>Password :</label>
	<input type="text" name="password" id="pass"/>
	<form:errors path="password" cssClass="error"></form:errors>
	<br></p>
	
	<input type="submit" value="sign in">
	
	<a href="userSignin"> Sign up </a>
	</div>
	</form:form>
	
</body>
</html>