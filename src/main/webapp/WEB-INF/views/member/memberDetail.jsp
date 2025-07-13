<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세정보</title>
</head>
<body>

<h2>${member.name}님의 상세정보</h2>

<p>ID: ${member.id}</p>
<p>Name: ${member.name}</p>
<p>Password: ${member.pw}</p>

<a href="/board/list">목록으로 돌아가기</a>

</body>
</html>