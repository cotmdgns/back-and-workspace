<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test=""></c:if>
	<h1>회원가입</h1>
	<form action="sign" method="post">
		<label>아이디 : <input type="text" name="id"> </label> <br><br>
		<label>비밀번호 : <input type="password" name="pwd"> </label> <br><br>
		<label>이름 : <input type="text" name="name"> </label> <br><br>
		<label>이메일 : <input type="email" name="email"> </label> <br><br>
		<label>생년월일 : <input type="date" name="date"> </label> <br><br>
		<label>전화번호 : <input type="text" name="phone"> </label> <br><br>
		<label>주소 : <input type="text" name="address"> </label> <br><br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>