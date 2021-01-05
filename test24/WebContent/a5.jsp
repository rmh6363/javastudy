<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="m" class="kr.co.ezen.MemberBean" scope="application"/>
    <jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	${m.id} : ${m.name } : ${m.age }

</body>
</html>