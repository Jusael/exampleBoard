<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<%
	String sessionName1 = "id";
	String sessionName2 = "name";
	session.removeAttribute(sessionName1);
	session.removeAttribute(sessionName2);
%>
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

h1 {
   color: #333;
   text-align: center;
}

label{
   display:block ;  
   margin-bottom :5px ;   
}
input[type=text], input[type=password]{
   width :86% ;  
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

hr {
   width:80%; 
   border-top :1px solid #ccc;  
   margin-top :30px ;   
   margin-bottom :30px
}
a{
   text-align:center;  
   display:block;    
   color:#333333;     
   text-decoration:none;     
   font-weight:bold
}
</style>

</head>

<body>

<h1>로그인</h1>

<form action="/member/loginCheck" method="post">
   <label for="inputTitle">아이디:</label><br/>
   <input type="text" id="inputTitle" name="id"/><br/>
   <label for ="inputContent">비밀번호:</label><br/>
   <input id ="inputContent"type ="password"name ="pw"><br/>
   <input type = "submit"value = "로그인"/>
 </form >

<hr/>

<a href="/member/signup">회원가입</a>

<body >

<html>