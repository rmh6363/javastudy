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
	<c:set var="myColor" value="blue"/>
	<c:if test="${myColor=='red'}">
	빨간색입니다.
	</c:if>
	<c:if test="${myColor!='red'}">
	파랑색입니다.
	</c:if>
	<br>
	<%
		request.setAttribute("score", 85);
	%>
	<c:if test="${score >=90 }">수</c:if>
	<c:if test="${score <90 && score>=80 }">우</c:if>
	<c:if test="${score <80 && score>=70 }">미</c:if>
	<c:if test="${score <70 && score>=60 }">양</c:if>
	<c:if test="${score <60}">가</c:if>
	<br>
	<c:choose>
		<c:when test="${score >= 90 }">
		A
		</c:when>
		<c:when test="${score >= 80 }">
		B
		</c:when>
		<c:when test="${score >= 70 }">
		C
		</c:when>
		<c:when test="${score >= 60 }">
		D
		</c:when>
		<c:otherwise>
		F
		</c:otherwise>
	
	
	</c:choose>
</body>
</html>