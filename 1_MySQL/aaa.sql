CREATE TABLE Member(
	id VARCHAR(30) PRIMARY KEY,
    password VARCHAR(30),
    name VARCHAR(30)
);
DROP TABLE member;
SELECT * FROM member;	

DELETE FROM member
WHERE member_pwd = "cotmdgns";



SELECT * FROM book 
    join rent on (rent_book_no = bk_no); 
SELECT * FROM member join rent on(member_no = rent_no);


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



INSERT INTO book(bk_title, bk_author) VALUES (?,?);
SELECT * FROM book WHERE bk_title = ? AND bk_author = ?;
SELECT * FROM rent;

SELECT * FROM rent WHERE rent_book_no =3;