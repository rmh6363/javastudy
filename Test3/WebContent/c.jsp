<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="test" method="post">
	<input type="radio" name="school" value="e" id="e" checked="checked"><label for="e">초등학교</label><br>
	<input type="radio" name="school" value="m" id="m"><label for="m">중등학교</label><br>
	<input type="radio" name="school" value="h" id="h"><label for="h">고등학교</label><br>
	<input type="radio" name="school" value="u" id="u"><label for="u">대학교</label><br>
	
	<input type="checkbox" name="hobby" value="c" id="c" checked="checked"><label for="c">등산</label><br>
	<input type="checkbox" name="hobby" value="r" id="r" checked="checked"><label for="r">독서</label><br>
	<input type="checkbox" name="hobby" value="s" id="s"><label for="s">축구</label><br>
	<input type="checkbox" name="hobby" value="m" id="m"><label for="m">마라톤</label> <br>
	
	<input type="submit" value="전송"> 
</form>

</body>
</html>