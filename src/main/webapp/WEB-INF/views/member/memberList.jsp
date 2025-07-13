<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 목록</title>
</head>

<body>

<h2>회원 목록</h2>

<table border='1'>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>

    <c:forEach var="member" items="${members}">
        <tr>
            <td><a href="/member/memberDetail?id=${member.id}">${member.id}</a></td>  
            <td>${member.name}</td>  
            <td><a href="/member/delete?id=${member.id}"><button>삭제</button></a></td>
        </tr>   
    </c:forEach>

</table>

</body></html>