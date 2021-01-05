<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
<form action="update.do" method="post">
	ID:<input value="${dto.id}" name="id" readonly="readonly"><br>
	NAME:<input name="name" value="${dto.name}"><br>
	AGE:<input type="number" name="age" value="${dto.age}"><br>
	<input type="submit" value="수정완료">

</form>
</body>
</html>