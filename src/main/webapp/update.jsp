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
<h2>Update Student</h2>
<form action="update" method="post">
<a href="index.jsp">Home</a><br><br>
Roll-No:<input type="text" name="sid" value="<%=request.getParameter("sid")%>" readonly="readonly"/>
<br><br>
New Name:<input type="text" name="sname" required/>
<br><br>
<input type="submit" value="Update">
</form>
</body>
</html>