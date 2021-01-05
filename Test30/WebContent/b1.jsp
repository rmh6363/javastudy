<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<c:out value="hello world"/>
	<a href='<c:out value="http://naver.com"></c:out>'>naver</a>
	<%
	/*Command 클래스에서 데이터 바인딩한 것이라고 가정  */
	request.setAttribute("msg", "hello");
	
	%>
	<c:out value="${msg}"/>



</body>
</html>