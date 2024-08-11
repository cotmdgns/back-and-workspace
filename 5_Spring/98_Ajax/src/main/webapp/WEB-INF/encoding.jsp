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
	<h2>Encoding 처리하기</h2>
		닉네임 : <input type="text" id="nick">
		 <input type="button" value="닉네임 보내기" id="btn">
	<div id="result"></div>
	
	
	<!-- encodeURI -->
	<script>
		$("#btn").click(() => {
			const text = $("#nick").val();
			$.ajax({
				get : "get",
				url : "/encoding",
				data : "nickname=" + encodeURI(text),
				
				success:function(result){
					$("#result").text(result);
				}
				
			})
		});
	</script>
</body>
</html>