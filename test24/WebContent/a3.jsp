<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="m" class="kr.co.ezen.MemberBean"/>
    
    <jsp:setProperty property="id" name="m" value="m001"/>
    <jsp:setProperty property="name" name="m" value="kim"/>
    <jsp:setProperty property="age" name="m" value="11"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	
	${m.id}<br>
	${m.name}<br>
	${m.age }<br>
	
</body>
</html>