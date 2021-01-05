<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 목록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<a href="insertui.do">글쓰기</a>
<h1>검색 목록</h1>
<table>
<thead>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>조회수</th>
		<th>작성일</th>
		<th>indent</th>
	</tr>

</thead>
<tbody>
<c:forEach items="${list}" var="list">
	<tr>
	
		<td>${list.num}</td>
		<td><a href="read.do?num=${list.num}">${list.title}</a></td>
		<td>${list.author}</td>
		<td>${list.readcnt}</td>
		<td>${list.writeday}</td>
		<td>${list.repIndent}</td>
	
	</tr>
</c:forEach>
</tbody>
</table>
<form action="search.do">
<select name="searchoption">
	<option value="author">작성자</option>
		<option value="title">제목</option>
			<option value="content">내용</option>
</select>
<input name="searchkeyword">
<input type="submit" value="검색">



</form>

</body>
</html>