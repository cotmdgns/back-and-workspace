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
	아이디 : <input type="text" id="id">
	<input type="button" value="중복체크" id="idCheck">
	<div id="idCheckView"></div>
	
	<script>
		$("#idCheck").click(() => {
			const idCheck = $("#id").val();
			$.ajax({
				type:"post",
				url:"/register",
				data:"idCheck=" + encodeURI(idCheck),
				
				success : function(result){
					let idCheck = "가입"+(result ? "실패" : "성공");
					let col = result ? "red" : "green";
					$("#idCheckView").text(idCheck).css({color : col})
			     
				}
			});
		});
		
	</script>
</body>
</html>