<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정 화면</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1>게시글 수정 화면</h1>
<form action="update.do" method="post">
	글번호: <input name="num" value="${dto.num}" readonly>
	<br>
	작성자: <input name="author" value="${dto.author}">
	<br>
	제목: <input name="title" value="${dto.title}">
	<br>
	내용:<br>
	<textarea rows="5" name="content">${dto.content}</textarea>
	<br>
	<input type="submit" value="수정완료">
</form>


</body>
</html>