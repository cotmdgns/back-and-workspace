<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="/register">회원가입</a></li>
		<li><a href="/login">회원가입</a></li>
	</ul>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		<c:forEach items="${allmember}" var="member">
		<tr>
			<th>${member.id}</th>
			<th>${member.password}</th>
			<th>${member.name}</th>
		</tr>	
		</c:forEach>
		
	</table>
</body>
</html> 