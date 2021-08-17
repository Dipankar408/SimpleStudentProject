<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Student</title>
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
<h2>Check Student</h2>
<form action="find" method="post">
Type Roll-No:<input type="text" name="sid"><br>
<input type="submit" value="Search">
</form>
<a href="index.jsp">Home</a>
</body>
</html>