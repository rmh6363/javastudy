<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<%= "hello" %><br>
<%= "world" %><br>
${"hello"}<br>
${"world"}<br>
<hr>
<%
 String msg = "hello world";
	request.setAttribute("msg", msg);
%>
<p title="${msg}">1234 5666 77777 888888 999999</p>
<p title="<%=msg%>">1234 5666 77777 888888 999999</p>


</body>
</html>