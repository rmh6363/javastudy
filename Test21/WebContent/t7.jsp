<%@page import="java.util.List"%>
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
<%!
	public void me(){
	System.out.print(11);
	}

	

%>
<%
	int a = 10;

	a = 55;
	me();
	int[] arr = {1,3,5,7,9};
	for(int i = 0; i < arr.length; i++){
		
		pageContext.setAttribute("e", arr[i]);
		%>
		${e}<br>

		
		
	<%}
%>

</body>
</html>