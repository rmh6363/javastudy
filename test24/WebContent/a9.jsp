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
<h1>EL의 null처리</h1>
<%
	pageContext.setAttribute("m", null);
%>
${m.charAt(0)}<br>
<h1>EL에서의 null은 데이터 자체가 없다고처리함</h1>

<h1>EL에서 데이터가 null인지 여부 확인하기</h1>
${ empty m }<br>
${m!=null}<br>
${not empty m}<br>


</body>
</html>