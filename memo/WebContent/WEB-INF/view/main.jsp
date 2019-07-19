<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <style>
    div{
       text-align: center;
    }
    </style>
    <div>
<h1>메모장</h1>
<a href="${pageContext.request.contextPath}/write">메모등록</a>
<a href="${pageContext.request.contextPath}/list">메모목록</a>
</div>