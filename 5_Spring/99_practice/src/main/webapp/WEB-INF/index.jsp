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
	<a href="/register">회원가입</a><br>
	<a href="/login">로그인</a><br>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
	<c:forEach items="${allMember}" var="member">
		<tr>
			<th>${member.id}</th>
			<th>${member.password}</th>
			<th>${member.name}</th>
		</tr>
	</c:forEach>
	</table>
</body>
</html> 