DROP TABLE rent;
DROP TABLE member;
DROP TABLE book;
DROP TABLE publisher;

-- 실습 문제
-- 도서관리 프로그램을 만들기 위한 테이블 만들기

-- 1. 출판사들에 대한 데이터를 담기 위한 출판사 테이블(publisher) 
--    컬럼 : pub_no(출판사번호) -- 기본 키
--           pub_name(출판사명) -- NOT NULL
--           phone(전화번호)
-- 쌤이한거
CREATE TABLE publisher(
	pub_no INT PRIMARY KEY auto_increment,
    pub_name VARCHAR(20) not null,
    phone VARCHAR(20)
);
insert into publisher (pub_name, phone) values ('프리렉','032-326-7282');
insert into publisher (pub_name, phone) values ('인사이드','02-322-5143');
insert into publisher (pub_name, phone) values ('킬벗','02-332-0931');

-- 내가한거
CREATE TABLE publisher(
	pub_no INT PRIMARY KEY,
    pub_name VARCHAR(20) NOT NULL,
    phone VARCHAR(20)
);
INSERT INTO publisher (pub_no,pub_name,phone) 
VALUES('1','프리렉','032-326-7282');
INSERT INTO publisher (pub_no,pub_name,phone) 
VALUES('2','인사이드','02-322-5143');
INSERT INTO publisher (pub_no,pub_name,phone) 
VALUES('3','킬벗','02-332-0931');

SELECT * 
FROM publisher;


-- 2. 도서들에 대한 데이터를 담기 위한 도서 테이블 (book)
--    컬럼 : bk_no (도서번호) -- 기본 키
--           bk_title (도서명) -- NOT NULL
--           bk_author(저자명) -- NOT NULL
--           bk_price(가격)
--           bk_pub_no(출판사 번호) -- 외래 키(publisher 테이블을 참조하도록)
--    조건 : 이때 참조하고 있는 부모 데이터 삭제 시 자식 데이터도 삭제 되도록 옵션 지정

-- 쌤이한거
CREATE TABLE book(
	bk_no int primary key auto_increment,
    bk_title varchar(50) not null,
    bk_author varchar(20) not null,
    bk_price int,
    bk_pub_no int ,
    constraint pub_no_fk foreign key (bk_pub_no) 
		references publisher(pub_no) on delete cascade
);
insert into book(bk_title, bk_author, bk_price, bk_pub_no)
values('개발자를 위한 생각의 정리,문서 작성법','카이마이 미즈히로','20000','1');
insert into book(bk_title, bk_author, bk_price, bk_pub_no)
values('1월1로그 100일완성 IT지식','브라이언W.커니핸','200000','2');
insert into book(bk_title, bk_author, bk_price, bk_pub_no)
values('개발자가 영어도 잘해야 하나요?','최희철','27000','3');
insert into book(bk_title, bk_author, bk_price, bk_pub_no)
values('피플웨어','톰 드마르코','16800','2');
insert into book(bk_title, bk_author, bk_price, bk_pub_no)
values('그로스 해킹','라이언 홀리데이','13800','3');

-- 내가한거
CREATE TABLE book(
	bk_no int PRIMARY KEY,
    bk_title VARCHAR(30) NOT NULL,
    bk_author VARCHAR(30) NOT NULL,
    bk_price VARCHAR(30),
    bk_pub_no INT,
    FOREIGN KEY (bk_pub_no) REFERENCES publisher(pub_no) ON DELETE CASCADE
);
SELECT * 
FROM book;

INSERT INTO book (bk_no,bk_title,bk_author,bk_price,bk_pub_no) 
	VALUES('1','개발자를 위한 생각의 정리,문서 작성법','카이마이 미즈히로','20000','1');
INSERT INTO book (bk_no,bk_title,bk_author,bk_price,bk_pub_no) 
	VALUES('2','1월1로그 100일완성 IT지식','브라이언W.커니핸','200000','2');
INSERT INTO book (bk_no,bk_title,bk_author,bk_price,bk_pub_no) 
	VALUES('3','개발자가 영어도 잘해야 하나요?','최희철','27000','3');
INSERT INTO book (bk_no,bk_title,bk_author,bk_price,bk_pub_no) 
	VALUES('4','피플웨어','톰 드마르코','16800','2');
INSERT INTO book (bk_no,bk_title,bk_author,bk_price,bk_pub_no) 
	VALUES('5','그로스 해킹','라이언 홀리데이','13800','3');

ALTER TABLE book RENAME COLUMN bk_pub_no TO pub_no;


-- 3. 회원에 대한 데이터를 담기 위한 회원 테이블 (member)
--    컬럼 : member_no(회원번호) -- 기본 키
--           member_id(아이디)   -- 중복 금지
--           member_pwd(비밀번호) -- NOT NULL
--           member_name(회원명) -- NOT NULL
--           gender(성별)        -- 'M' 또는 'F'로 입력되도록 제한
--           address(주소)       
--           phone(연락처)       
--           status(탈퇴여부)     -- 기본값 'N' / 'Y' 혹은 'N'만 입력되도록 제약조건
--           enroll_date(가입일)  -- 기본값 현재날짜

-- 쌤이한거
CREATE TABLE member(
	member_no int primary key auto_increment,
    member_id varchar(20) not null unique,
    member_pwd varchar(20) not null,
    member_name varchar(20) not null,
    gender char(1) check(gender in('M','F')),
    adderss varchar(50),
    phone varchar(20),
    status char(1) check(status in ('Y','N')) default 'N',
    enroll_date date default (current_date)
);

insert into member (member_id, member_pwd, member_name, gender, adderss , phone)
values('user01','pass01','가나다','M','서울시 강남구','010-1111-2222');
insert into member (member_id, member_pwd, member_name, gender, adderss , phone)
values('user02','pass02','라마바','M','서울시 서초구','010-3333-4444');
insert into member (member_id, member_pwd, member_name, gender, adderss , phone)
values('user03','pass03','사아자','F','경기도 광주시','010-4444-5555');

-- 내가한거
CREATE TABLE member(
	member_no int PRIMARY KEY,
    member_id VARCHAR(30) NOT NULL UNIQUE,
    member_pwd VARCHAR(30) NOT NULL,
    member_name VARCHAR(30) NOT NULL,
    gender VARCHAR(3) CHECK(gender IN ('M','F')) NOT NULL,
    address VARCHAR(30),
    phone VARCHAR(30),
    status VARCHAR(3) CHECK(status IN ('N','Y')) NOT NULL DEFAULT 'N',
    enroll_date VARCHAR(30)
);
INSERT INTO member (member_no, member_id, member_pwd, member_name, gender, address, phone, status,enroll_date)
VALUES('1','user01','pass01','가나다','M','서울시 감낭구','010-1111-2222','N','2024-06-24');
INSERT INTO member (member_no, member_id, member_pwd, member_name, gender, address, phone, status,enroll_date)
VALUES('2','user02','pass02','라마바','M','서울시 서초구','010-3333-4444','N','2024-06-24');
INSERT INTO member (member_no, member_id, member_pwd, member_name, gender, address, phone, status,enroll_date)
VALUES('3','user03','pass03','사아자','F','경기도 광주시','010-4444-5555','N','2024-06-24');

SELECT * 
FROM member;



-- 4. 도서를 대여한 회원에 대한 데이터를 담기 위한 대여 목록 테이블(rent)
--    컬럼 : rent_no(대여번호) -- 기본 키
--           rent_mem_no(대여 회원번호) -- 외래 키(member와 참조)
--           rent_book_no(대여 도서번호) -- 외래 키(book와 참조)
--           rent_date(대여일) -- 기본값 현재날짜
--    조건 : 이때 부모 데이터 삭제 시 NULL 값이 되도록 옵션 설정

-- ALTER로 FOREIGN KEY만 관리

-- 쌤이 한다
CREATE TABLE rent(
	rent_no int primary key auto_increment,
    rent_mem_no int,
    rent_book_no int,
    rent_date date default (current_date)
);

DROP TABLE rent;
SELECT * FROM rent;
alter table rent add constraint member_no_fk
	foreign key(rent_mem_no) references member(member_no) on delete set null;
alter table rent add constraint book_no_fk
	foreign key(rent_book_no) references book(bk_no) on delete set null;

INSERT INTO rent( rent_mem_no, rent_book_no) VALUES ('1','2');
INSERT INTO rent( rent_mem_no, rent_book_no) VALUES ('1','3');
INSERT INTO rent( rent_mem_no, rent_book_no) VALUES ('2','1');
INSERT INTO rent( rent_mem_no, rent_book_no) VALUES ('2','2');
INSERT INTO rent( rent_mem_no, rent_book_no) VALUES ('1','5');



-- 내가 한거
CREATE TABLE rent(
	rent_no int PRIMARY KEY,
    rent_mem_no int,
    rent_book_no int,
    rent_date DATE
);
SELECT * FROM rent;

INSERT INTO rent(rent_no, rent_mem_no, rent_book_no, rent_date) 
VALUES ('1','1','2',now());
INSERT INTO rent(rent_no, rent_mem_no, rent_book_no, rent_date) 
VALUES ('2','1','3',now());
INSERT INTO rent(rent_no, rent_mem_no, rent_book_no, rent_date) 
VALUES ('3','2','1',now());
INSERT INTO rent(rent_no, rent_mem_no, rent_book_no, rent_date) 
VALUES ('4','2','2',now());
INSERT INTO rent(rent_no, rent_mem_no, rent_book_no, rent_date) 
VALUES ('5','1','5',now());

ALTER TABLE rent ADD foreign key (rent_mem_no) REFERENCES member(member_no) ON DELETE SET NULL;
ALTER TABLE rent ADD foreign key (rent_book_no) REFERENCES book(bk_no) ON DELETE SET NULL;
ALTER TABLE rent RENAME COLUMN rent_mem_no TO member_no;
ALTER TABLE rent RENAME COLUMN rent_book_no TO bk_no;

-- 5. 2번 도서를 대여한 회원의 이름, 아이디, 대여일, 반납 예정일(대여일 + 7일)을 조회하시오.
SELECT * FROM book;   		-- bk_no	pub_no
SELECT * FROM member; 		-- 					member_no
SELECT * FROM rent;			-- bk_no			member_no  rent_no
SELECT * FROM publisher;	-- 			pub_no

SELECT 
	member_name, 
	member_id, 
	rent_date,
	substr(adddate(now(), interval 7 day),1,10) "반납 예정일"
FROM book
JOIN rent USING (bk_no)
JOIN member USING (member_no)
JOIN publisher USING (pub_no)
WHERE bk_no = '2';
-- 6. 회원번호가 1번인 회원이 대여한 도서들의 도서명, 출판사명, 대여일, 반납예정일을 조회하시오.
SELECT 
bk_title,
pub_name,
rent_date, 
substr(adddate(now(), interval 7 day),1,10) "반납 예정일" 
FROM book
JOIN rent USING (bk_no)
JOIN member USING (member_no)
JOIN publisher USING (pub_no)
WHERE member_no = '1';

