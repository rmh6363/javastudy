<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="dto" class="kr.co.ezen.MemberDTO" scope="request"/>
    
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
	<c:set target="${dto}" property="id" value="m001"/>
	<c:set target="${dto}" property="name" value="kim"/>
	<c:set target="${dto}" property="age" value="11"/>
	${dto.id} : ${dto.name } : ${dto.age }
	<c:set var="a1"	 value="hello world" scope="page"/>
	${a1}<br>
	<c:set var="a2" value="${dto.name}" />
	${a2}<br>
</body>
</html>