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
	List<String> list = new ArrayList<String>();
	list.add("hello");
	list.add("hello1");
	list.add("hello2");
	list.add("hello3");
	request.setAttribute("list", list);
	%>
	<%
	for(int i = 0; i < list.size(); i++){
		pageContext.setAttribute("m", list.get(i));%>
		${m}<br>
	<%}
	
	%>

</body>
</html>