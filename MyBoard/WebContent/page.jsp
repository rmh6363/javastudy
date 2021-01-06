<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

	<c:forEach begin="${to.beginLineNum}" end="${to.stopLineNum}" var="i">
		<a href="list.do?curPage=${i}">${i}</a> 
	</c:forEach>