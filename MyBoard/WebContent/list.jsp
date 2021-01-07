<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


<style type="text/css">
	.itsme{
		font-weight: bolder;
		color: red;
	}
	
	a{
		text-decoration: none;
	}

</style>


</head>
<body>
<a href="insertui.do">글쓰기</a>

<h1>게시글 목록</h1>

<table>
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
			
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.num}</td>
				<td>
					
						<c:forEach begin="1" end="${dto.repIndent}">
							&nbsp;&nbsp;
						</c:forEach>
					
					<a href="read.do?num=${dto.num}">
					  ${dto.title}
					</a>
				</td>
				<td>${dto.author}</td>
				<td>${dto.readcnt}</td>
				<td>${dto.writeday}</td>
				
			</tr>
		
		</c:forEach>
	
	</tbody>

</table>

<div>
	<jsp:include page="page.jsp"/>
</div>



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