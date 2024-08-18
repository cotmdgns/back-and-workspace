create table sign (
	id varchar(50) primary key,
    password varchar(100),
    name varchar(50),
    email varchar(100) unique,
    date varchar(100),
    phone varchar(100),
    address varchar(100),
    userDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    img1 blob default null,
    img2 varchar(255) default null    
);
drop table sign;




insert into sign (id, password, name, email, date, phone, address)
value('rla2012','1234','김춘식','qwer@naver.com','2000-01-01','010-1111-1111','서울 어디동');

SELECT * FROM sign;











