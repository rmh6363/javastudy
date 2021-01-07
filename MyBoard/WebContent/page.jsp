<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
    <c:if test="${to.beginLineNum - to.perLine > 0 }">
	<a href="list.do?curPage=${to.beginLineNum-to.perLine}">&laquo;</a>
	</c:if>
	<c:if test="${to.curPage > 1 }">
		<a href="list.do?curPage=${to.curPage - 1}">&lt;</a>
	</c:if>
    <c:forEach var="i" end="${to.stopLineNum}" begin="${to.beginLineNum}">
    	<a class="${to.curPage == i?'itsme':'' }" href="list.do?curPage=${i}"> ${i} </a>
    </c:forEach>
    
    <c:if test="${to.curPage < to.totalPage}">
	    <a href="list.do?curPage=${to.curPage + 1 }">&gt;</a>
    </c:if>
    
    <c:if test="${to.totalPage > to.stopLineNum}">
    <a href="list.do?curPage=${to.beginLineNum + to.perLine}">&raquo;</a>
    </c:if>
   