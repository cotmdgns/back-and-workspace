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
	<input type="button" value="중복체크" id="idCheck"><br>
	<br><br><br><br><br><br>
	<div id="idCheckView"></div>
	
	<!-- 중복체크 버튼을 눌렀을 때 post 방식으로 
		/check로 id 값 넘겨서 결과값(boolean)을 받아서
		아이디 있으면 ID 사용 불가, 없으면 ID 사용 가능
		DB는 스키마 : member, 테이블 : member
	-->
    </style>
	<script>
		$("#idCheck").click(()=>{
			$.ajax({
				//요청
				type:"post",
				url: "/check",
				data: "id=" + $("#id").val(),
				//응답
				success : function(result){
					let tt = "가입" + (result?"실패":"성공");
					let col = !result?"green":"red";
					let width = 1000;
					let height = 100;
					$("#idCheckView").text(tt).css({
						color: "white", 
						width : width, 
						height : height
					}).addClass("aa");
				}
			})
		});
	</script>	
	
		 <style>
      @keyframes a {
        0% {
          transform: scaleY(0.3);
          background-color: aqua;
        }
        50% {
          transform: scaleY(1.5);
          background-color: red;
        }
        100% {
          transform: scaleY(0.3);
          background-color: green;
        }
      }
      .aa {
        animation: a 1s linear infinite;
      }
	
</body>
</html>