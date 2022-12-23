<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>

<head>

	<title>COUSTOMER PAGE</title>
	
	<style>
		
		.error{color:red}
		
	</style>

</head>

<body>

	<form:form action="submitForm" modelAttribute="customer"> 
	
		First Name: <form:input path="firstName"/>
		
		<br><br>
		
		Last Name(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"> </form:errors>
		
		<br><br>
		
		<input type="submit" value="SUBMIT"/>
	
	</form:form>

</body>

</html>