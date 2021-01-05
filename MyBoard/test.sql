create table myboard(
num number(4) primary key,
author varchar2(15) not null,
title varchar2(100) not null,
content varchar2(2000) not null,
writeday date default sysdate,
readcnt number(6) default 0,
repRoot number(4),
repStep number(4),
repIndent number(2)
)

insert into myboard (num,author,title,content,repRoot) values(1,'김','1안녕','1안녕의 콘텐트',1)
insert into myboard (num,author,title,content,repRoot) values(2,'이','2하이','2하이의 콘텐트',2)
insert into myboard (num,author,title,content,repRoot) values(3,'박','3굿모','3굿모의 콘텐트',3)
insert into myboard (num,author,title,content,repRoot) values(4,'최','4구텐','4구텐의 콘텐트',4)
select * from myboard order by repRoot desc, repStep asc
insert into myboard (num,author,title,content,repRoot,repStep) values(5,'모','re:2하이1','2안녕의 콘텐트 답글',2,2)
insert into myboard (num,author,title,content,repRoot,repStep) values(6,'모','re:2하이2','2안녕2의 콘텐트 답글',2,1)
insert into myboard (num,author,title,content,repRoot) values(7,'모','re:re:2하이','2안녕의 콘텐트 답글',2)
update myboard set repStep = 
update myboard set repStep = 0+1 where num = 5 
update myboard set repStep = 0+1 where num = 6 
update myboard set repStep = 0+1+1 where num = 7
update myboard set repStep = repStep+1 where num = 5
update myboard set repStep = repStep+1 where num = 5
delete from myboard
select * from myboard
rollback
select NVL2(MAX(num),MAX(num)+1,1)from myboard
insert into myboard(num,author,title,content,repRoot,repStep,repIndent)
values(NVL2(num,1,num+1),'김', 'hello','hello world',num,0,0)
update myboard set readcnt = readcnt+1 where num=1