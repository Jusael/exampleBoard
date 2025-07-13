<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시글 수정</title>
</head>
<body>
    <h1>게시글 수정</h1>
    
    <form action="/board/update" method="post">
     <input type="hidden" name="id" value="${boardDto.id}" />
     <label for="editTitle">제목:</label><br/>
     <input type="text" id="editTitle" name="title" value="${boardDto.title}" /><br/>
     <label for="editTitle">내용:</label><br/>
     <input type="text" id="editTitle" name="content" value="${boardDto.content}" /><br/>
     <input type="hidden" name="name" value="${boardDto.name}" />
     <input type="hidden" name="currentDate" value="${boardDto.currentDate}" />
     <input type="hidden" name="num" value="${num}" />
     <input type="submit" value="수정 완료" />
     
    </form>