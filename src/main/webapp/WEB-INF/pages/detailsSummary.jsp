<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Summary page</title>
</head>
<body>

	<h3>Details submitted!</h3>

	<table>
		<tr>
			<td>Name:</td>
			<td>${detail.name}</td>
		</tr>
		<tr>
			<td>Coding Language:</td>
			<td>${detail.lang}</td>
		</tr>
	</table>

</body>
</html>
