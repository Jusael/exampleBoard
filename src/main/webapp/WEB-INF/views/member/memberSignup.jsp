<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
}

form {
   width: 300px;
   margin-left:auto; 
   margin-right:auto; 
   padding :20px ;
   border-radius :5px ;
   background-color:white ; 
}

h2 {
   color: #333;
   text-align: center;
}

label{
   display:block ;  
   margin-bottom :5px ;   
}
input[type=text], input[type=password]{
   width : 86% ;  
   padding :12px 20px ;
   margin-bottom :15px ;
   border:none ; 
   background-color:#e6e6e6 ;
}
input[type=submit]{
   width :100% ;   
   padding :12px 20px ;
   border:none ;   
   color:white ;
   background-color:#FF2B91
}
input[type=submit]:hover{
   background-color:#828282
}

</style>

</head>

<body>

<h2>회원가입</h2>

<form action="/member/login" method="post">
    <label for ="username">사용자 이름:</label><br/>
    <input type ="text" id ="name" name ="name" required/><br/>
    <label for ="id">아이디:</label><br/>
    <input type ="text" id = "id" name = "id" pattern="[a-zA-Z0-9]+" title="영문자와 숫자만 가능합니다." required/><br/>
    <label for = "password">비밀번호:</label><br/>
    <input type = "password"id = "pw" name = "pw" minlength="2" title="8글자 이상 입력하세요." required/><br/>
    <input type = "submit"value = "회원가입"/>
 </form>
 
<body >

<html>