<%@page import="kr.co.ezen.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<%
	int[] arr = {1,2,3,4,5,10};
	request.setAttribute("arr", arr);

%>
	<c:forEach items="${arr}" var="num">
	${num}<br>
	
	</c:forEach>
	
	<c:forEach begin="1" items="${arr}" var="num">
	${num }<br>
	</c:forEach>
	<hr>
	<%
		request.setAttribute("begin", 31);
		request.setAttribute("end",40);
		
	%>
	<c:forEach items="${arr}" var="num"	begin="${begin}" end="${end}">
		${num}
	
	</c:forEach>
	<hr>
	<c:forEach begin="1" end="20" var="i" step="2">
	${i}<br>
	</c:forEach>
	<hr>
	
	<%
	List<MemberDTO> list = new ArrayList<MemberDTO>();
	list.add(new MemberDTO("m001","kim",11));
	list.add(new MemberDTO("m002","lee",22));
	list.add(new MemberDTO("m003","park",33));
	request.setAttribute("list", list);
	%>
	<c:forEach items="${list}" var="num">
	${num.id} : ${num.name} : ${num.age}<br>
	
	</c:forEach>
	
	
	
	
</body>
</html>