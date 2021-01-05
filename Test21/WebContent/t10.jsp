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
<h1>include action tag</h1>
<jsp:include page="footer.jsp">
	<jsp:param value="hello" name="msg"/>
	<jsp:param value="kim" name="name"/>
</jsp:include>

여기는 메인입니다.<br>
아래는 part.jsp에서 가져온 내용입니다.
<%@ include file="part.jsp" %>
</body>
</html>