<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp의 기본태그</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

	
	comment tag :<br> 
	<!-- <h1>comment tag 학습 : html의 주석 태그</h1> -->
	<%
		//String str = "hello";
	%>
	<%--
		String msg = "world";
	--%>
	directive tag:<%@ %><br>
	-page directive tag : 거의 손 댈 게 없음.4가지 경우 제외하고<%@ page %><br>
	-include directive tag : 어떤 파일을 현재 페이지에 포함시키고 싶을 때.<\%@ include %><br>
	-talib directive tag : 사용자가 정의한 태그를 사용하고 싶을 때.<\%@ taglib %><br>
	declaration tag:<br>
	scriptlet tag: <% %><br>
	expression tag:<br>
	



</body>
</html>