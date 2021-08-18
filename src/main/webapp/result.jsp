<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<style>
a{
	border:2px solid green;
	padding:5px;
	border-radius:5px;
	text-decoration:none;
}
</style>
</head>
<body style="text-align:center">
<div style="border:3px solid black; width:20%; margin:auto">
<h2 style="text-decoration:underline">Student Details</h2>
<h3>Roll-no:${roll}</h3>
<h3>Name:${name}</h3>
<h3>Marks:${marks}</h3>
</div><br>
<a href="delete?sid=${roll}">Delete</a>
<a href="update.jsp?sid=${roll}" style="margin-left:20px">Update</a>
</body>
</html>