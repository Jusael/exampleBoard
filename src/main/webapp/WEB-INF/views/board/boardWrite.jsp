<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시물 등록</title>
</head>
<body>
    <h1>게시물 등록</h1>
    
    <form action="/board/write" method="post">
        <label for="inputTitle">제목:</label><br/>
        <input type="text" id="inputTitle" name="title" /><br/>
        <label for="inputContent">내용:</label><br/>
		<input type="text" id="inputContent" name="content" /><br/>
        
        <label for="inputName">작성자:</label><br/>
        <input type="text" id="inputName" name="name" value="<%= session.getAttribute("name") %>" readonly="readonly" /><br/>
        <input type="hidden" id="inputName" name="id" value="<%= session.getAttribute("id") %>" readonly="readonly" /><br/>
        
        <input type="submit" value="등록" />
    </form>
    
    <hr/>
    
    <a href="/board/list">목록으로 돌아가기</a>
</body>
</html>