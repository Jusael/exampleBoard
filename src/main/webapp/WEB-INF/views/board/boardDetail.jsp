<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.spring.board.model.dto.BoardDto" %>
<%
com.spring.board.model.dto.BoardDto boardDto = (com.spring.board.model.dto.BoardDto)request.getAttribute("boardDto");
%>
<!DOCTYPE html>
<html>
<head>
    <title>게시글 상세보기</title>
</head>
    <style type="text/css">
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        h1, h2 {
            color: #333;
            text-align: center;
        }
        p {
            color: #666;
            text-align:center
        }
        form {
           text-align:center; 
           margin-bottom :20px ;
           margin-top :50px ;
         }
        button {
            display:block; 
            width :100px; 
            height :30px; 
            margin:auto ;  
            margin-top :20px ;  
            background-color:#FF2B91 ;   
            color:white ;
            border-radius :4px ;
            border:none ;    
        }
        button:hover{
             background-color:#828282 ;
         }

    </style>
<body>
    <h1>${boardDto.title}</h1> <!-- 게시글 제목 -->
    <p>작성자: ${boardDto.name}</p> <!-- 작성자 -->
    <p>작성일: ${boardDto.currentDate}</p> <!-- 작성일 -->
    <hr/>
    <p>${boardDto.content}</p> <!-- 게시글 내용 -->
<% 
if (boardDto.getId().equals(session.getAttribute("id"))) {
%>	
        <form action="/board/modify?num=${boardDto.num}" method="post">
           <button type='submit'>게시물 수정</button>
     		<input type="hidden" name="postId" value="${boardDto.id}"/>
        </form>
    	<form action="/board/delete?num=${boardDto.num}" method="post">
     		<input type="hidden" name="postId" value="${boardDto.id}"/>
            <button type='submit'>게시물 삭제</button>
        </form>
<% 
}
%>  
    <hr/>
    <h2>댓글 목록</h2>
    <c:forEach var="reply" items="${replyList}">
        <div>
            <p>작성자: ${reply.replyWriter}</p>
            <p>내용: ${reply.replyContent}</p>
        </div>
        <hr/>
    </c:forEach>
    <h2>댓글 작성</h2>
    <form action="/reply/write" method="post">
        <input type="hidden" name="id" value="${boardDto.id}"/>
        <label for="commentAuthor">작성자:</label><br/>
        <input type="text" id="inputName" name="replyWriter" value="<%= session.getAttribute("name") %>" readonly="readonly" /><br/>
        <input type="hidden" id="inputName" name="boardNum" value="<%= session.getAttribute("num") %>" readonly="readonly" /><br/>
        <label for="commentContent">댓글:</label><br/>
        <textarea id="commentContent" name="replyContent"></textarea><br/>
        <button type='submit'>댓글 작성</button>
    </form>
    <a href="/board/list">목록으로 돌아가기</a>
    
</body>
</html>