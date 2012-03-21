
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Welcome</title>
</head>
<body>

	<h1>Hello world!</h1>
	<p>${message}</p>

	<form:form model="command">

		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Mail:</td>
				<td><form:input path="mail" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Click" /></td>
			</tr>

		</table>



	</form:form>



</body>
</html>
