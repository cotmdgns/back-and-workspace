<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
	<h1>회원가입</h1>
	<form id="frm">
		아이디 : <input type="text" name="id" id="id"><br>
		비밀번호 : <input type="password" name="password" id="password"><br>
		이름 : <input type="text" name="name" id="name"><br>
	<input type="button" value="회원가입" id="btn">
	</form>
	
	<div id="result"></div>
	
	
	<script>
		$("#btn").click(() => {
			$.ajax({
				type:"post",
				url:"/serialize",
				data: $("#frm").serialize(),
				
				success : function(result){
					$("#result").text(result + "환영합니다!")
				}
			})
		});
	</script>
</body>
</html>