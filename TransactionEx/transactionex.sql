create table account(
id varchar(3) primary key,
balance number)

kim: 0
lee: 10000
kim이 lee한테 10000원만 빌려줘
lee 빌려줌.
---->kim으 balance 10000원
lee balance 0원
-->
kim이 lee한테 10000원 같습니다.
kim의 레코드에서 balance값이 0
-------------전산에서 전원 나감-----------
leedml 레코드에서 balance값이 10000
====>lee의 balance 0 복구

insert into account(id, balance) values ('kim',0)
insert into account(id, balance) values ('lee',10000)
COMMiT
select * from account
rollback

create table membership(
id varchar2(6),
point number
)	
alter table membership add constraint pk_membership_id primary key(id)














