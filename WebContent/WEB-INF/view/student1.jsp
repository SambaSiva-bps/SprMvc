<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="stude">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />


		<br>
		<br>
		<br>
		<br>
		<form:select path="country">
			<form:options items="${stude.countryOptions}" />
		</form:select>


		<input type="submit" value="Submit" />

	</form:form>

</body>

</html>