<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 화면</title>
</head>
<body>
	 <h1>회원 가입 화면</h1>
	 <form action="insert.do" method="post">
	 ID:<input name="id"><br>
	 NAME:<input name="name"><br>
	 AGE:<input type="number" name="age"><br>
	 <input type="submit" value="회원 등록">
	 
	 </form>
</body>
</html>