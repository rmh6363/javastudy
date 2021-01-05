<%@page import="kr.co.domain.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 자세히 보기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1>회원 정보 자세히 보기</h1>


ID: ${dto.id }<br>
NAME: ${dto.name }<br>
AGE: ${dto.age }<br>

<a href="updateui.do?id=${dto.id}">수정</a> 
<a id="del" href="delete.do?id=${dto.id }">삭제</a>

<script type="text/javascript">
   $("#del").click(function(event) {
      event.preventDefault();
      var choice = confirm("정말로 삭제할래요?");
      var href = $(this).attr("href");
            
      if(choice){
         location.assign(href);
      }
      
   });

</script>
</body>
</html>