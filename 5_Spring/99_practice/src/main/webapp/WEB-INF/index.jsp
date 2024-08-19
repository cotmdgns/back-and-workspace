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
	<a href="/myhome">연습장으로</a>
	<!-- 
	<c:choose>
	<c:when test="${empty vo}">
		<a href="/register">회원가입</a><br>
		<a href="/login">로그인</a><br>
		<form action="search" method="get">
			<select>
				<option value="all">이름 또는 아이디</option>
				<option value="name">이름</option>
				<option value="id">아이디</option>
			</select>
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
		
		<form action="delet" method="get">
			<table border="1">
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이름</th>
					<th>삭제</th>
				</tr>
			<c:forEach items="${allMember}" var="member">
				<tr>
					<th>${member.id}</th>
					<th>${member.password}</th>
					<th>${member.name}</th>
					<th><input type="checkbox" name="idList" value="${member.id}"></th>
				</tr>
			</c:forEach>
			</table>
			<input type="submit" value="삭제">
		</form>
	</c:when>
	<c:otherwise>
	<ul>
		<li><a href="/logout">로그아웃</a></li>
	</ul>
	<form action="/update" method="post">
		아이디 : <input type="text" name="id"  value="${vo.id}" readonly><br>
		비밀번호 : <input type="password" name="password"  value="${vo.password}"><br>
		이름 : <input type="text" name="name"  value="${vo.name}"><br>
		<input type="submit" value="수정">
	</form>
	
	<h1>비밀번호만 변경</h1>
	<form action="/update" method="post">
		비밀번호 : <input type="password" name="password"><br>
		<input type="submit" value="비밀번호 수정"><br>
	</form>
	</c:otherwise>
	</c:choose>
	
	 -->
	

</body>
</html> 