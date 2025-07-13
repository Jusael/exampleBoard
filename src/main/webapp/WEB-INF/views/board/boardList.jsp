<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
}

h2 {
   color: #333;
   text-align: center;
   margin-top: 50px;
}

form {
   text-align: center;
   margin-bottom: 20px;
}

table {
    width: 80%;
    border-collapse: collapse;
    margin:auto; 
}

th, td {
    border-bottom : 1px solid #ddd;  
    padding :10px; 
}
th{
   background-color:#333333; 
   color:#ffffff; 
}
td{
   text-align:center
}
a button{
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
a button:hover{
   background-color:#828282 ;
}
</style>

</head>

<body>

<h2>게시판 검색기능</h2>

<form action="/board/findSearch">
   <select name="searchCode">
   <option value="name">이름검색</option>
   </select>
   <input type ="text" name ="name">
   <input type ="submit" value = "검색">
</form>


<table>
<tr><th>글 번호</th><th>제목</th><th>글쓴이 </th><th>업로드 날짜 </th></tr>

<c:forEach var="list" items="${list}">
<tr >
<td><a href="/board/detail?num=${list.num}">${list.num}</a></td >
<td>${list.title}</td >
<td>${list.name}</td >
<td>${list.insertDate}</td >
</tr >
</c:forEach> 
</table>

<a href="/board/writeView"><button > 글 등록  </button></a >
<a href="/member/login"><button > 로그아웃  </button></a >

<c:if test="${sessionScope.name == 'admin'}">
    <a href="/member/memberList"><button>관리자 모드</button></a>
</c:if>

<body>

</html>