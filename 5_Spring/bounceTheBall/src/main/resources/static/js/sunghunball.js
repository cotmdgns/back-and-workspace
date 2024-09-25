$(document).ready(function() {
    let a = $(".ball");
    let x = 0; // x 좌표 초기값
    let direction = 10; // 이동할 거리

    function move() {
        // 경계 검사
		let e = true;
        if (x > window.innerWidth - a.width()-10|| x < 0) {
            direction = -direction; // 경계를 넘어가면 방향을 반전
        }

        // x 좌표 업데이트
        x += direction; // 현재 방향으로 이동

        // 스타일 업데이트
        a.css({
            top: '50px', // 고정된 y 위치
            left: x + 'px' // 업데이트된 x 위치
        });

        requestAnimationFrame(move); // 다음 프레임 요청
    }

    move(); // 움직임 시작
});
