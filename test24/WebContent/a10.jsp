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
<h1>영역객체에 바인딩된 데이터 출력하기</h1>
<%
	pageContext.setAttribute("p", "pageContext");
request.setAttribute("r", "request");
application.setAttribute("s", "application");
session.setAttribute("a", "session");

%>
${p}
${r}
${s}
${a}
<hr>
${pageScope.p}
${requestScope.r}

</body>
</html>