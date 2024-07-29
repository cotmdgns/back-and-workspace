CREATE TABLE sign_up(
	id VARCHAR(30) PRIMARY KEY, -- 유저
    pwd VARCHAR(30), -- 비밀번호
    addr VARCHAR(30), -- 주소
    phone VARCHAR(30), -- 전회번호
    email VARCHAR(30), -- 이메일
    name VARCHAR(30), -- 이름
    age int, -- 나이
    gender VARCHAR(30) -- 성별
);
CREATE TABLE user(
	user_code int PRIMARY KEY AUTO_INCREMENT, -- 유저코드
    user_manner int, -- 유저 온도
	user_name VARCHAR(30), -- 유저 닉네임
	user_img TEXT, -- 유저프로필
    user_info VARCHAR(100), -- 유저 간단한 자기소개
	user_hobby VARCHAR(30), -- 유저 관심사
    user_location VARCHAR(30), -- 유저 선호 지역
    id VARCHAR(30)-- 포링키 (sing_up)
);
ALTER TABLE user ADD FOREIGN KEY (id) REFERENCES sign_up(id);


CREATE TABLE membership(
	membership_code int PRIMARY KEY AUTO_INCREMENT, -- 클럽코드
    membership_name VARCHAR(30), -- 클럽 이름
    membership_img TEXT, -- 클럽 썸네일
    membership_info VARCHAR(100), -- 클럽 소개
    membership_grade VARCHAR(100), -- 클럽 등급(별점)
    membership_max int, -- 클럽 최대 인원
    membership_date date -- 클럽 생성날짜
);

-- 유저 && 클럽 조인부분 테이블

CREATE TABLE metting_borad(
	met_code int PRIMARY KEY AUTO_INCREMENT, -- 모임 게시판 코드
    met_calender TEXT, -- 캘런더
    met_into VARCHAR(30), -- 모임 정확히 뭐하는지
    met_yn boolean, -- 클럽 유저들 참 불참 여부
    membership_code int, -- 포링키(membership)
    user_code int -- 포링키(user)
);

CREATE TABLE main(
	main_code int PRIMARY KEY AUTO_INCREMENT, -- 메인코드
    main_name VARCHAR(30), -- 메인글 제목
    main_text VARCHAR(30), -- 메인글 내용
	main_views int, -- 메인글 조회수
    main_date date, -- 메인글 작성일자
    user_code int, -- 포링키
    membership_code int -- 포링키
);

CREATE TABLE img(
	img_code int  PRIMARY KEY AUTO_INCREMENT, -- 사진코드
    img_url TEXT, -- 사진주소
    main_code int, -- 포링키
    met_code int -- 포링키
);

CREATE TABLE commen(
	comment_code int PRIMARY KEY AUTO_INCREMENT, -- 메인게시판
    comment_text TEXT, -- 메인게시판 댓글 내용
    comment_date date, -- 메인게시간 댓글 시간
    user_code int, -- 포링키
    comment_code int,-- 포링키
	main_code int -- 포링키 (자기자신 조인)
);

CREATE TABLE list(
	list_code int PRIMARY KEY AUTO_INCREMENT, -- 클럽 유저 리스트 코드
    list_grade VARCHAR(30), -- 유저등급
    user_code int, -- 포링키
    membership_code int -- 포링키
);

CREATE TABLE chaanel(
	chan_code int PRIMARY KEY AUTO_INCREMENT, -- 채널 코드
    chan_img TEXT, -- 채널사진
	chan_name VARCHAR(30), -- 채널 명
    membership_code int, -- 포링키
    user_code int -- 포링키
);

-- 대분류 및 소분류 조인
-- 클럽 개별 조인
