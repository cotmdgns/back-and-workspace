<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/phaser@3.55.2/dist/phaser.min.js"></script>

<style>
	body{
		background-color: black;
		margin: 0;	
	}

</style>
</head>
<body id="body">
 
	
	<script>
	const config = {
		    type: Phaser.AUTO,
		    width: 800,
		    height: 600,
		    scene: {
		        preload: preload,
		        create: create,
		        update: update
		    }
		};

		const game = new Phaser.Game(config);

		let sun;
		let object;
		let shadow;

		function preload() {
		    this.load.image('object', 'path/to/your/object/image.png'); // 물체 이미지 로드
		}

		function create() {
		    // 해 그리기
		    sun = this.add.circle(700, 100, 50, 0xffff00); // 해 위치 및 색상

		    // 물체 생성
		    object = this.add.sprite(400, 300, 'object').setOrigin(0.5, 0); // 물체의 기준점을 아래쪽으로 설정

		    // 그림자 생성
		    shadow = this.add.graphics();
		}

		function update() {
		    // 그림자 업데이트
		    shadow.clear();
		    
		    // 그림자의 위치 계산
		    const shadowOffsetX = 50; // 그림자 이동 거리
		    const shadowOffsetY = 20; // 그림자 이동 거리
		    const shadowColor = 0x000000; // 그림자 색상

		    // 그림자 그리기
		    shadow.fillStyle(shadowColor, 0.5); // 투명도 설정
		    shadow.beginPath();
		    shadow.fillRect(object.x - shadowOffsetX, object.y + shadowOffsetY, object.width, 10); // 그림자 위치 및 크기
		    shadow.fillPath();
		}

	</script>
</body>
</html>