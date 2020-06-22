<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.error {
	color: red;
	margin-left: 30px;
	position: fixed;
	text-align: left;
}
</style>


<style type="text/css">
span {
	color: blue;
	font-family: arial;
	margin: 10px;
}
</style>

<meta charset="ISO-8859-1">
<title>Sign in page</title>
</head>
<body>

	<h1 align="center">
		<span> User Registration Page...! </span>
	</h1>
	<hr>
	<form:form action="userSigninSuccess" modelAttribute="userSign">
		<div align="center">
			<p>
				<label>Your Name :</label>
				<form:input path="name" />
				<form:errors path="name" cssClass="error"/>
				<br>
			</p>

			<p>
				<label>User Name :</label>
				<form:input path="username" />
				<form:errors path="username" cssClass="error"/>
				<br>
			</p>

			<p>
				<label>Password :</label>
				<form:password path="password" />
				<form:errors path="password" cssClass="error"/>
				<br>
			</p>

			<p>
				<label>Country :</label>
				<form:select path="country">
					<form:option value="India" label="IND" path="country"></form:option>
					<form:option value="England" label="UK" path="country"></form:option>
					<form:option value="America" label="USA" path="country"></form:option>
					<form:option value="Srilanka" label="SRI" path="country"></form:option>
					<form:option value="Australia" label="AUS" path="country"></form:option>
					<form:errors path="country" cssClass="error"/>
				</form:select>
				<br>
			</p>


			<p>
				<label>Hobbies :</label> Cricket :
				<form:checkbox path="hobbies" value="cricket" />
				Reading books :
				<form:checkbox path="hobbies" value="reading books" />
				Music :
				<form:checkbox path="hobbies" value="music" />
				programming :
				<form:checkbox path="hobbies" value="programming" />
				Dancing :
				<form:checkbox path="hobbies" value="dancing" />
				<form:errors path="hobbies" cssClass="error"/>
				<br>
			</p>

			<p>
				<label>Gender :</label>
				 Male :<form:radiobutton path="gender" value="male" />
				Female :<form:radiobutton path="gender" value="female" />
				<form:errors path="gender" cssClass="error"/>
				<br>
			</p>
			
			<p>
			<label>Age :</label>
			<form:input path="age"/>
			<form:errors path="age"  cssClass="error" />
			</p><br>
			
			<div align="center">
			<h2>Communication Details:</h2>
			<p>
			<label>Email :</label>
			<form:input path="userCommunicationDTO.email"/>
			
			<label>Phone :</label>
			<form:input path="userCommunicationDTO.phone"/>
			</p><br>
			
			</div>
			
			<input type="submit" value="Register">
			
		</div>
	</form:form>
</body>
</html>