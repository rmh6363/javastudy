<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>현재 시각: 2020년 12월 16일 오전 11시 31분 34초</h1>	
<%
	Date d = new Date();
	out.print(d.toLocaleString());

%>
</body>
</html>