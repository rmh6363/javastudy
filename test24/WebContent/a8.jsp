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
<h1>EL 비교연산</h1>

${3<=5}<br>
${3 le 5 }<br>
<h1>EL 논리연산자</h1>
${true && true }
${true && false }
${false && true }
${false && false }
<br>
${true||true }
${true||false }
${true||true }
${false||false}
<br>
${!true }
${!false }
<br>
<h1>EL 조건 연산자</h1>

${3>4?45:100}<br>
</body>
</html>