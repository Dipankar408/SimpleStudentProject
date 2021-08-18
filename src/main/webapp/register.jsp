<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style type="text/css">
form{
	border: 2px solid black;
	padding:10px 30px;
	width:30%;
	margin:auto;
}
h2{
text-align:center;
}
</style>
</head>
<body>
<h2>Registration</h2>
<form action="save" method="post">
<a href="index.jsp">Home</a><br><br>
Name:<input type="text" name="sname" required><br><br>
Roll-no:<input type="number" name="roll_no" required><br><br>
Marks:<input type="number" name="marks" required><br> 
<input type="submit">
</form>
</body>
</html>