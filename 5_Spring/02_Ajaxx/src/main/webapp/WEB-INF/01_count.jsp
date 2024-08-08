<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Ajax(Asynchronous JavaScript and XML) : 비동기적 정보 교환 기법 -->
	<h1>Show Count</h1>
	<input type="button" id="btn" value="count 증가" onclick="startRequest()">
	<p id="result"></p>
	
	<!-- 자바스크립트 방식 -->
	<script>
	let xhr;
	
	function startRequest(){ // 요청에 해당하는 로직을 담는 메서드
		xhr = new XMLHttpRequest();// 새로운 XMLHttpRequest 객체를 생성
		xhr.onreadystatechange = callback;// 상태가 변경될 때 호출할 콜백 함수 설정
		xhr.open("get","/count"); // 서버에 GET 요청을 준비, 요청 URL은 "/count"
		xhr.send(null); // 이때 서버로 전송된다.. 실직적인 요청이 들어간다. //send는 post때 사용
	}
	
	function callback(){  // 응답에 해당하는 로직을 담는 메서드
		if(xhr.readyState == 4){  // 요청의 상태가 완료(4)되었는지 확인
			if(xhr.status === 200){// 응답 상태 코드가 200(성공)인지 확인
				const count = xhr.responseText;
				document.querySelector("#result").innerHTML = count;
			};
		};
	}
	</script>
</body>
</html>