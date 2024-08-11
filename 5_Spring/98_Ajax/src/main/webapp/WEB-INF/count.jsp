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
	<h1>Show Count</h1>
	<input type="button" id="btn" value="count 증가" >
	<p id="result"></p>
	
	<script>
		$("#btn").click(() => {
		 	$.ajax({
		 		type: "get",
		 		url : "/count",
		 		
		 		success : function(result){
		 			$("#result").text(result);
		 		}
		 	});
		});
	</script>
</body>
</html>