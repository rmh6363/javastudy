CREATE TABLE myboard(
num NUMBER(4) PRIMARY KEY,
author VARCHAR2(15) NOT NULL,
title VARCHAR2(100) NOT NULL,
content VARCHAR2(2000) NOT NULL,
writeday DATE DEFAULT SYSDATE,
readcnt NUMBER(6) DEFAULT 0,
repRoot NUMBER(4),
repStep NUMBER(4),
repIndent number(2)
)


delete from myboard where num=1

select * from MYBOARD






SELECT * FROM myboard order by repRoot desc, repStep asc


SELECT ROWNUM rnum, num, title, author, writeday, readcnt, repIndent 
from(SELECT * FROM myboard order by repRoot desc, repStep asc)

SELECT * FROM (SELECT ROWNUM rnum, num, title, author, writeday, readcnt, repIndent from(SELECT * FROM myboard order by repRoot desc, repStep asc)) WHERE rnum >= ? AND rnum <= ?






SELECT COUNT(num) FROM myboard









