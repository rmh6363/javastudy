<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.domain.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>   회원 목록입니다.</h1>

<table>
   <thead>
      <tr>
         <th>id</th>
         <th>name</th>
      </tr>
   </thead>
   <tbody>
      <%
         List<MemberDTO> list =(List<MemberDTO>) request.getAttribute("list");
         if(list == null){
            return;
         }
         for(int i=0;i<list.size();i++){
            out.print("<tr>");
            out.print("<td>");
            out.print("<a href='read.do?id="+list.get(i).getId()+"'>"+list.get(i).getId()+"</a>");
            out.print("</td>");
            out.print("<td>");
            out.print(list.get(i).getName());
            out.print("</td>");
            out.print("</tr>");
         }
      
      %>
   
   </tbody>

</table>

</body>
</html>