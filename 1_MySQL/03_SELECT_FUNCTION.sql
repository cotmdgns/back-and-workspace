/*
	함수 : 전달된 컬럼값을 읽어들여서 함수를 실행한 결과를 반환
    
    - 단일행 함수 : N개의 값을 읽어서 N개의 결과값 리턴 (매 행마다 함수 실행 결과 반환)
	- 그룹 함수 : N개의 값을 읽어서 1개의 결과값 리턴(그룹결로 함수 실행 결과 반환)
    
    >> SELECT 절애 단일행 함수와 그룹 함수는 함께 사용하지 못함
    왜? 결과 행의 개수가 다르기 때문에!
    
    >> 함수를 사용할 수 있는 위치 : SELECT, WHERE, ORDER BY, GROUP BY, HAVING
    
*/

-- 단일행 함수

/*
	문자 처리 함수 
    
    LENGTH : 해당 문자열값의 BYTE 길이 수 반환
    - 한글 한 글자 -> 3BYTE
    - 영문자,숫자,특수문자,한글자 -> 1BYTE
    CHAR_LENGTH : 해당 문자열값의 글자 수 반환
*/
SELECT length('데이터베이스'), char_length('데이터베이스')
,char_length('datadase'), char_length('database');

-- 사원명(emp_name), 사원명의 글자수, 이메일(email), 이메일의 글자수 조회

SELECT  emp_name,char_length(emp_name), email,char_length(email)
FROM employee;

/*
	INSTR(컬럼|'문자열','찾을려는 문자열')
    - 특정 문자열에서 찾고자 하는 문자열의 위치 반환
    - 없으면 0 반환
*/
SELECT instr('BABAACAABBAA' , 'B'), instr('AABAACAABBAA' , 'D');

-- 's'가 포함되어 있는 이메일 중 이메일, 이메일의 @ 위치 조회
SELECT email ,instr(email ,'@') 
FROM employee
WHERE email LIKE '%s%';

/*
	LPAD|RPAD (컬럼|'문자열', 최종적으로 반환할 문자의 길이, '덧붙이고자 하는 문자')
    - 문자열에 덧붙이고자 하는 문자를 왼쪽 도는 오른쪽에 덧붙여서
    최종적으로 반환할 문자의 길이만큼 문자열 반환
*/

SELECT lpad('hello',10,'*'), rpad('hello',10,'+');

/*
	TRIM(컬럼|'문자열') | TRIN([LEADING|TRAILING|BOTH] 제거하고자하는문자들 FROM 컬럼|'문자열')
    - 문자열의 앞/뒤/양쪽에 있는 지정한 문자들을 제거한 나머지 문자열 반환
*/
SELECT trim('       KH          '); -- 기본적으로 양쪽에 있는 공백 제거
SELECT trim(BOTH ' ' FROM'       KH          ');

SELECT trim(LEADING 'Z' FROM 'ZZZZKHZZZZ'); -- KHZZZ 왼쪽(앞쪽) 문자제거
SELECT ltrim('       KH          '); -- LTRIM : 앞쪽 공백만 제거

SELECT trim(TRAILING 'Z' FROM 'ZZZZKHZZZZ'); -- ZZZKH 오른쪽(뒤쪽) 문제 제거
SELECT rtrim('       KH          '); -- RTRIM : 뒤쪽 공백만 제거

/*
	SUBSTR|SUBSTRING(컬럼|'문자열', 시작 위치 값, 추출할 문자 개수)
    - 문자열에서 특정 문자열을 추출해서 반환
*/
SELECT substr('PROGRAMMING', 5,2); -- RA
SELECT substr('PROGRAMMING', 1,6); -- PROGRA
SELECT substr('PROGRAMMING', -8,3); -- GRA

-- 여자 사원들의 이름(emp_name), 주민등록번호(emp_no) 조회
SELECT emp_name,emp_no ,substr(emp_no,8,1)
FROM employee
WHERE substr(emp_no,8,1) =2;

-- 남자 사원들의 이름, 민증 조회
SELECT emp_name,emp_no
FROM employee
WHERE substr(emp_no ,instr(emp_no,'-')+1,1) IN (1,3);

/*
	LOWER : 다 소문자로 변경한 문자열 반환
    UPPER : 다 대문자로 변경한 문자열 반환
*/
SELECT lower('Welcome To MySQL'), upper('Welcome To MySQL');

/*
	REPLACE(컬럼|'문자열', '바꾸고 싶은 문자열', '바꿀 문자열')
    - 특정 문자열로 변경하여 반환
*/
SELECT replace('서울특별시 강남구 역삼동','강남구','서초구');

/*
	CONCAT : 문자열을 하나로 합친 후 결과 반환
*/
SELECT concat('가나다라', 'ABCD','1234'); -- 가나다라ABCD1234

-- 실습문제 --
-- 1. 이메일의 kh.or.kr을 email.con으로 변경해서 이름, 변경 전 이메일, 변경후 이메일 조회
SELECT  emp_name, email "변경 전", replace(email,'kh.or.kr','email.com')
FROM employee;
-- 2. 사원명과 주민등록번호 (000000-0******)으로 조회

-- replace
SELECT emp_name, emp_no , replace(emp_no, substr(emp_no,-6,6),"******")
FROM employee;
-- rpad
SELECT emp_name, rpad(substr(emp_no,1,8), char_length(emp_no),'*') 
FROM employee;
-- concat
SELECT emp_name, concat(substr(emp_no,1,8),"******")
FROM employee;

-- 3. 사원명, 이메일,이메일에서 추출한 아이디 조회(@조회)
-- replace
SELECT emp_name,email, replace(email, '@kh.or.kr','')
FROM employee;

-- substr
SELECT emp_name,email, substr(email, 1 , instr(email, '@')-1)
FROM employee;

-- trim
SELECT emp_name, email, trim(TRAILING '@kh.or.kr' from email)
FROM employee;

/*
	숫자 처리 함수
    
    ABS : 절대값 반환
*/
SELECT abs(5.6), abs(-10);

/*
	숫자 DIV 숫자 = 숫자 / 숫자(소수점까지 결과나옴)
    숫자 MOD 숫자 = 숫자 % 숫자 = MOD(숫자,숫자)
*/
SELECT
	10 DIV 3, 10 /3,
    10 MOD 3, 10 % 3, MOD(10,3);
    
/*
	ROUND(숫자, [위치])
				 ㄴ 어디서 반올림 할지 결정
    - 반올림한 결과를 반환
*/
SELECT round(123.567), round(123.567, 2), round(123.567, -1);

/*
	CEIL : 올림 처리해서 반환
    FLOOR : 버림 처리해서 반환
*/
SELECT ceil(123.152),floor(123.952);

/*
	TRUNCATE(숫자, 위치) : 올림도 반올림도 버림도 아님 그냥 버려
    - 위치 지정하여 버림 처리해서 반환
*/
SELECT truncate(123.456,1) ,truncate(123.456,0);

/*
	날짜 처리 함수
    NOW, CURRENT_TIMESTAMP : 현재 날짜와 시간 반환
    CURDATE, CURRENT_DATE : 현재 날짜 반환
    CURTIME, CURRENT_TIME : 현재 시간 반환
*/
SELECT 
	now(), 		current_timestamp(), 
    curdate(),  current_date() , 
    curtime(),  current_time();
    
/*
	DAYOFYEAR : 날짜가 해당 연도에서 몇 번째 날인지 반환
    DAYOFMONTH : 날짜가 해당 월에서 명 번째 날인지 반환
    DATOFWEEK : 날짜가 해당 주에서 몇 번째 날인지 반환(일요일 =1,토요일=7)
*/
SELECT dayofyear(now()), dayofmonth(now()), dayofweek(now());

/*
	PREIOD_DIFF(날짜, 날짜) : 두 기간의 차이를 숫자로 반환
    DATEDIFF(날짜, 날짜) : 두 날짜 사이의 일수를 숫자로 반환
    TIMEDIFF(날짜, 날짜) : 두 시간의 차이를 날짜 형식으로 반환
    TIMESTAMPDIFF(날짜단위, 날짜, 날짜) : 두 날짜 사이의 기간을 날짜단위에 따라 변환
    
    * 날짜단위 : YEAR(연도), QUARTER(분기), MONTH(월), WEEK(주), DAY(일)
			   HOUR(시간), MINUTE(분), SECOND(초)
*/
SELECT 
	period_diff(202406,202411), -- -5  (앞빼기 ,뒤)
    period_diff(202412,202406); -- 6
SELECT 
	datediff('2024-12-31', now()),
    timediff('2025-01-01 00:00:00', now());

-- 직원명,입사일, 근무 일수, 근무 개월 수, 근무 년 수 조회
SELECT emp_name, hire_date,
	   timestampdiff(day, hire_date,now())"근무 일 수",
       timestampdiff(month, hire_date,now())"근무 개월 수",
       timestampdiff(year, hire_date,now())"근무 년 수"
FROM employee;

/*
	ADDDATE(날짜, INTERVAR 숫자 날짜단위)
	ADDTIME(날짜, 시간정보)
    - 특정 날자에 입력받은 정보만큼 더한 날짜를 반환
    
    SUBDATE(날짜, INTERVAR 숫자 날짜단위)
    SUBTIME(날짜, 시간정보)
    - 특정 날짜에 입력받은 정보만큼 뺀 날짜를 반환
*/
SELECT 
	now(), 
    adddate(now(), interval 10 day),
    subdate(now(), interval 15 day),
    addtime(now(), "20:00:00"),
    subtime(now(), "01:00:00");
    
-- 직원명(emp_name), 입사일(hire_date), 입사 후 6개월이 된 날짜를 조회
SELECT emp_name, hire_date , adddate(hire_date , interval 6 month)
FROM employee;

/*
	LAST_DAY : 해당 월의 마지막 날짜를 반환
*/
SELECT last_day(now());

/*
	YEAR, MONTH, DAY, HOUR, MINUTE, SECOND
    - 특정 날짜에 연도, 월, 일, 시간, 분, 초 정보를 각각 추출해서 반환
*/
SELECT 
	year(now()), month(now()), day(now()),
    hour(now()), minute(now()), second(now());
-- 연도별 오래된 순으로 직원명, 입사연도, 입사월, 입사일 조회
SELECT emp_name, hire_date, year(hire_date)입사년도, month(hire_date)입사월 ,day(hire_date)입사일
FROM employee
ORDER By 입사년도,입사월,입사일;

/*
	포멧 함수
    FORMAT(숫자,위치) : 숫자에 3단위씩 콤마 추가해서 반환
    DATE_FORMAT(날짜, 포멧형식) : 날짜 형식을 변경해서 반환
*/
SELECT salary, format(salary,0) -- 가격표시
FROM employee;

SELECT 
	now(), 
    date_format(now(),'%Y.%m.%d'),		-- %Y : 년도, %m : 월, %d : 일
	date_format(now(),'%Y.%m.%d.%T');	-- %T : 시간 전체, %H : 시, %i : 분, %s : 초
    
-- 직원명 , 입사일(2024년 6월 19일 14시 05분 30초)조회
SELECT emp_name, date_format(hire_date, '%Y년 %m월 %d일 %H시 %i분 %s초')
FROM employee;
    
/*
	null 처리 함수
    
    COALESCE|IFNULL (값, 값이 NULL일 경우 반환할 값)
*/    
SELECT emp_name, bonus, IFNULL(bonus, 0)
FROM employee;

-- 전 사원의 직원명, 보나서, 보너스 포함 연봉(급여 + 급여 * 보너서) *12
SELECT emp_name, bonus ,(salary + salary * ifnull(bonus,0)) *12
FROM employee;

-- 직원명, 부서코드(dept_code) 조회 (부서코드가없으면 '부서없음')
SELECT emp_name,dept_code, ifnull(dept_code,"부서없음")"부서"
FROM employee;

/*
	NULLIF(값1, 값2)
    - 두 개의 값이 동일하면 null 반환, 두 개의 값이 동일하지 않으면 값1 반환
*/
SELECT nullif('123','123'), nullif('123','456'); -- null, 123

/*
	IF(값1 ,값2, 값3) | IF(조간, 조건이 True인 경우, 조건이 False인 경우)
    - 값1이 null이 아니면 값2 반환, null이면 값3 반환
    - 조건에 해당하면 두번째 값 반환, 해당하지 않으면 마지막 값 반환
*/
SELECT emp_name, bonus, if(bonus, 0.7,0.1)
FROM employee;

-- 직원명 ,부서 코드가 있으면 '부서있음, 없으면 '부서없음'
SELECT emp_name,dept_code, if(dept_code,'부서있음','부서없음')
FROM employee;

-- 사번, 사원명 주민번호(emp_no), 성별( 남 여 ) - emp_no 활용해서 조회
SELECT emp_id, emp_name, emp_no, if(substr(emp_no,8,1)=1,'남','여') 성별
FROM employee;

-- 사원명, 직급코드(job_code), 기존급여(salary), 인상된 급여 조회
-- 정렬 : 직급코드 j1부터, 인상된 급여 높은 순서대로
-- 직급코드가 j7인 사원은 급여룰 10%인상
-- 직급코드가 j6인 사원은 급여룰 15%인상
-- 직급코드가 j5인 사원은 급여룰 20%인상
-- 그 외의 직급의 사원은 급여률 5%만 인상
SELECT 
	emp_name, 
    job_code, 
    salary,
    -- if(substr(job_code,2,1)=7,salary*1.2,if(substr(job_code,2,1)=6,salary*1.15,if(substr(job_code,2,1)=5,salary*1.1,salary*1.05)))
    format(if(job_code = 'J7', salary *1.1, 
		if(job_code='J6', salary*1.15, 
			if(job_code='J5', salary*1.2,salary*1.05))),0)"인상된 급여"
FROM employee
ORDER BY 2,4 DESC;

/*
	CASE WHEN 조건식 1 THEN 결과값 1
		 WHEN 조건식 2 THEN 결과값 2
         ....
         ELSE 결과값 N
	END
	-> if~else if~else if~else
*/
SELECT 
	emp_name, job_code, salary,
    format(case when job_code = 'J7' then salary *1.1
		 when job_code = 'J6' then salary*1.15
		 when job_code = 'J5' then salary*1.2
         else salary*1.05
	end ,0) "인상된급여"
FROM employee
ORDER BY 2,4 DESC;

-- 사원명, 급여, 급여 등급 (1~4등급) 조회
-- salary 값이 500만원 초과일 경우 1등급
-- salary 값이 500만원 이하 350만원 초과일 경우 2등급
-- salary 값이 350만원 이하 200만원 초과일 경우 3등급
-- 그 외의 경우 4등급
SELECT emp_name, salary,
case when salary > 5000000 then "1등급"
	 when salary > 3500000  then "2등급"
     when salary > 2000000  then "3등급"
	 else "4등급"
end 등급
FROM employee;

-- 그룹함수(집계함수) --
/*
	그룹함수 --> 결과값 1개!
    - 대량의 데이트들로 집계나 통계 같은 작업을 처리해야 하는 경우 사용되는 함수들
    - 모든 그룹 함수는 NULL 값을 자동으로 제외하고 값이 있는 것들만 계산
    
    SUM : 헤당 컬럼 값들의 총 합계 반환
*/
-- 전체 사원의 총 급여 합 조회
SELECT sum(salary)*12
FROM employee;

-- 부서코드가 D5인 사원들의 총 연봉( 연봉 * 12 )
SELECT sum(if(dept_code='D5',salary*12,0))
FROM employee;

/*
	AVG
    - 해당 컬럼 값들의 평균값을 반환
    - 모든 그룹 함수는 NULL 값을 자동으로 제외하기 때문에
	  AVG 함수를 사용할 때는 COALESCE 또는 IFNULL 함수와 함께 사용하는 걸 권장
*/
-- 전체 사원의 평균, 급여, 평균 보너스율 조회
SELECT 
	avg(salary), avg(bonus),
    avg(ifnull(salary,0)),avg(ifnull(bonus,0))
FROM employee;

/*
	MIN : 해당 컬럼 값들중에 가장 작은 값 반환
    MAX : 해당 컬럼 값들중에 가장 큰 값 반환
*/
SELECT
	min(emp_name), min(salary), min(hire_date),
    max(emp_name), max(salary), max(hire_date)
FROM employee;

/*
	COUNT
    - 컬럼 또는 행의 개수를 세서 반환
    
    *: 조회 결과에 해당하는 모든 행 개수 반환
    컬럼 : 해당 컬럼값이 NULL이 아닌 행 개수 반환
    distinct 컬럼 : 해당컬럼값의 중복을 제거한 행 개수 반환
*/
-- 전체 사원 수 조회
SELECT count(*)
FROM employee;

-- 보너스를 받은 사원 수 조회
SELECT count(bonus)
FROM employee;

SELECT count(*)
FROM employee
WHERE bonus is not null;	

-- 중복제거
SELECT distinct dept_code
FROM employee;

-- 현재 사원들이 속해있는 부서 수 조회
SELECT count(distinct dept_code)
FROM employee;

-- 퇴사한 직원의 수 조회
SELECT count(distinct ent_date)
FROM employee