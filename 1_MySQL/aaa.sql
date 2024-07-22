CREATE TABLE Member(
	id VARCHAR(30) PRIMARY KEY,
    password VARCHAR(30),
    name VARCHAR(30)
);
DROP TABLE book;
SELECT * FROM member;	

DELETE FROM member
WHERE member_pwd = "cotmdgns";



SELECT * FROM book 
    join rent on (rent_book_no = bk_no); 
SELECT * FROM member join rent on(member_no = rent_no);


DELETE FROM book
WHERE bk_no = 15;

SELECT * FROM book;
SELECT * FROM member;
SELECT * FROM rent;
SELECT * FROM publisher;
desc member;

INSERT INTO member(member_no,member_id,member_pwd) VALUES (?,?,?);

desc book;
desc member;
desc publisher;
desc rent;

CREATE TABLE book(
	bk_no INT PRIMARY KEY AUTO_INCREMENT,
    bk_title VARCHAR(50) NOT NULL,
    bk_author VARCHAR(20) NOT NULL,
    bk_price INT,
    bk_pub_no INT,
    CONSTRAINT pub_no_fk FOREIGN KEY (bk_pub_no) 
		REFERENCES publisher(pub_no) ON DELETE CASCADE
);
INSERT INTO book(bk_title, bk_author, bk_price, bk_pub_no)
VALUES('개발자를 위한 생각의 정리, 문서 작성법', '카이마이 미즈히로', 20000, 1);
INSERT INTO book(bk_title, bk_author, bk_price, bk_pub_no)
VALUES('1일 1로그 100일 완성 IT 지식', '브라이언 W. 커니핸', 200000, 2);
INSERT INTO book(bk_title, bk_author, bk_price, bk_pub_no)
VALUES('개발자가 영어도 잘해야 하나요?', '최희철', 27000, 3);
INSERT INTO book(bk_title, bk_author, bk_price, bk_pub_no)
VALUES('피플웨어', '톰 드마르코', 16800, 2);
INSERT INTO book(bk_title, bk_author, bk_price, bk_pub_no)
VALUES('그로스 해킹', '라이언 홀리데이', 13800, 3);

SELECT * FROM book;
DROP TABLE book;

INSERT INTO book(bk_title, bk_author) VALUES (?,?);
SELECT * FROM book WHERE bk_title = ? AND bk_author = ?;

SELECT * FROM rent JOIN book ON (rent_book_no = bk_no);
SELECT * FROM rent WHERE rent_mem_no = ?;

SELECT * FROM rent WHERE rent_book_no =3;
DELETE FROM book;


;