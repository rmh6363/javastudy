<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="m" class="kr.co.ezen.MemberBean"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<%
		m.setId("m001");
		m.setName("kim");
		m.setAge(11);
	
	%>
	${m.id} : ${m.name} : ${m.age}
	
	
	
</body>
</html>