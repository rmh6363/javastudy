<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<h1>
		<%@ include file="part.jsp"%>
	</h1>
	<h1>본문</h1>

	<h1>
		<jsp:include page="footer.jsp">
			<jsp:param value="hello" name="msg" />
			<jsp:param value="kim" name="name" />


		</jsp:include>


	</h1>
</body>
</html>