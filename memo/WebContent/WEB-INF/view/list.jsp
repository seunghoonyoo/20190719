<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <style>
   h1{
   text-align: center;
   }
.table {
	margin:auto;
    border: 1px solid gray;
    border-collapse: collapse;
}
.table > thead > tr > th, 
.table > thead > tr > td, 
.table > tbody > tr > th, 
.table > tbody > tr > td,
.table > tfoot > tr > th, 
.table > tfoot > tr > td {
    border: 1px solid gray;
    padding: 0.5rem;
}
</style>
      
<table class="table ">
	<h1>메모 목록</h1>
	<br>
	<thead>
		<tr>
			<th>번호</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
	</thead>
	<!-- 게시글 -->
	<tbody align="center">
		<c:forEach var="bdto" items="${list}">
		<tr>
			<td>${bdto.no}</td>
			<td>${bdto.content}</td>
			<td>${bdto.when}</td>
		</tr>
		</c:forEach>
	</tbody>

</table>