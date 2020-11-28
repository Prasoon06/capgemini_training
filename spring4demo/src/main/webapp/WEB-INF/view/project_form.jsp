<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Project Form</h1>
<form action="./process_form" method="post">
<table>
	<tr>
		<td>Name</td>
		<td><input type="text" name="name" placeholder="Enter Project Name"/></td>
	</tr>
	<tr>
		<td>Description</td>
		<td><textarea cols="20" rows="10" name="description"></textarea></td>
	</tr>
	<tr>
		
		<td align="right" colspan="2"><input type="submit" value="Save"/></td>
	</tr>
</table>

</form>
</body>
</html>