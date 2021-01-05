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
next.jsp<br>
<hr>
<%
	String msg = request.getParameter("msg");
	String pw = request.getParameter("pw");
	request.setAttribute("msg", msg);
	request.setAttribute("pw", pw);
%>
 ${msg} : ${pw}


</body>
</html>