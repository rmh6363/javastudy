<%@page import="kr.co.ezen.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>java bean 학습1</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<%
	MemberBean m = new MemberBean();
	m.setId("m001");
	m.setName("kim");
	m.setAge(11);
	pageContext.setAttribute("m", m);	
	
%>
	${m.id}<br>
	${m.name}<br>
	${m["age"]}<br>
	

</body>
</html>