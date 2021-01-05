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
<jsp:forward page="next.jsp">

   <jsp:param value="hello" name="msg"/>
   <jsp:param value="123" name="pw"/>

</jsp:forward>
</body>
</html>