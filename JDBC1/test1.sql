create table test(
name varchar2(3),
age number(3)
)

insert into test values('kim','20')
insert into test values('lee','40')
insert into test values('cho','23')
select * from test
commit

test 테이블의
모든 레코드의
모드 컬럼값을
조회하시오

select * from test
select name from test
select age from test

alias
컬럼에 별명 넣기

select name as 이름, age as 나이 from test

select name 이름, age 나이 from test

select name as 이름,age 나이 from test
insert into test values('kim',33)
commit

test 테이블에 등록된 성 씨를 모두 출력하시오. (distinct 중복을 없앰)
select distinct name from test
update test set name = 'roh' where name = 'cho'
select * from test
update test set age = 15 where name = 'roh'

select * from test order by age asc 오름차순
SELECT * From test order by age desc 내림차순

test 테이블의
모든 레코드를
모든 컬럼이 포함되게
조회하되
이름을 기준으로 내림차순으로 정렬 하시오.
select * from test order by name desc
create table team(
name varchar2(15),
age number(3),
position varchar2(10)
)
insert into team values('김철수',20,'공격수')
insert into team values('김영희',20,'수비수')
insert into team values('지학호',25,'골키퍼')
select * from team
select name as 이름, age 나이 from team
select * from team order by age asc
update team set name = '이지안' where name = '지학호'
select * from team
delete from team where name = '이지안' 
select * from team
insert into team values('손흥민',28,'공격수')
drop table team
select * from test order by age asc
insert into test values('hyo',15)
insert into test values('hae',22)
update test set name = 'han' where name ='hae'
select * from test
select * from test
select * from test
select * from test
select * from test order by name asc
update test set name = 'kyo' where age = 33
select * from test order by name desc,age asc
select * from test where name = 'kim'
select * from test where name != 'kim'
insert into test (age)values(55)
insert into test(name)values('pyo')
commit

name이 null인 레코드 정보를 조회
select name 이름 ,age 나이 from test where name is NULL

name이 null이 아닌 레코드 정보를 조회하시오.
단, 레코드에 대한 정렬은 age가 증가되게 정렬 하고
만약 age가 같으면 name을 내림 차순으로 정려하시오.

select age,name from test where name is not null order by age asc, name desc

test 테이블에서
age가 55인 레코드를 조회하시오.
select * from test where age != 55
select * from test where age is null
select * from test where age is not null
select * from test where age >= 33
select * from test where age = 23 or age = 40 or age =20

select * from test where age not in(20,23,40,43,61,77)
select * from test where name = 'kim' and age = 33
select * from test
update test set name = 'kim' where name = 'kyo'
select * from test where name = 'kim' and age = 33
select * from test where age > 25 and age < 47

select * from test where age >= 25 and age <= 47
모르는 정해진 글자를 표현할때 _
select * from test where age between 25 and 47          between a and b
select * from test where name like 'k__'
select * from test where name like '_e___'
select * from test where name like '_e_'
모르는 여러 글자를 표현할 때%
select * from test where name like '%o'                         o로끝남
select * from test where name like '%초%'
select * from test where name like '%l%'
select * from test where name like '%'

table : 테이블명 대신에 select문 넣기
select * from (select * from test where age > 20) where name like '%k%'
select * from test where age > 20
rownum이 2~4
select * from 
(select rownum rnum, name, age from test)
where rnum between 2 and 4

원 select에서 order by (정렬)조건이 들어가면,
별도의 select문을 이용하여 rownum 컬럼을 넣어줘야함
select * from(
select rownum rnum, name,age from 
(select rownum rnum ,name,age from test order by age asc)
) where rnum between 2 and 4




select * from test where name = 'kim' and age = 20


DB에 데이터를 저장한 상태에서
컬럼 하나만을 이용해서
특정 레코드 하나만을 조회하고 싶어.
가능할까요?
--> 기본키 = 주키 = primary key = pk

create table member2(
id varchar2(6),
name varchar2(6),
age number(3)
)

insert into member2 values('m001','kim',30)
insert into member2 values('m001','kim',30)
insert into member2 values('m001','kim',30)
insert into member2 values('m001','kim',30)
insert into member2 values('m001','kim',30)
insert into member2 values('m001','kim',30)
insert into member2 values('m001','kim',30)
commit

select * from member2 where id = 'm001' and name = 'kim'

delete from member2

commit

alter table member2 add constraint pk_member2_id primary key(id)

기본키를 설정하면,
기본키에 대한 중복을 허용하지 않는다
unique constraint

기본키를 설정하면
기본키에 대해 NOT NULL(NULL을 허용하지 않음) 제약조건이 추가된다.

insert into member2 values('m001','kim',30)
insert into member2 values('m002','kim',30)
insert into member2 values('m003','kim',30)
insert into member2 values('m004','kim',30)
insert into member2 values('m005','kim',30)
insert into member2 values('m006','kim',30)
insert into member2 values('m007','kim',30)
commit
insert into member2 (id,name,age)values('m008','lee',44)
commit
select * from member2 where id = 'm004'

--alter table member add constraint pk_member_id primary key(mid)
--
--create table test2 (
--id varchar2(6) primary key,
--age number(3))
--
--create table test3(
--id varchar2(6),
--age number(3),
--constraint pk_test3_id primary key(id)
--)



alter table test add constraint pk_test_id primary key(id)
===============================================================
외래키 = foreign key = fk

당신이 좋아하는 음식을 다음 중에서만 고르시오
1.갈비
2.떡볶이
3.된장찌개
4.김치찌개

나는 피자
1~4 중에서만 선택하라고 했는데, 피자를 선택하다니...
이런 일 없게 하자.

외래키가(foreign key = fk)가 되려면 , 반드시 부모 테이블의 기본키
1.
create table employee(
eid varchar2(6),
ename varchar2(6),
edep varchar2(9) 
)

2.
alter table employee add constraint pk_employee_eid primary key(eid)

3.
create table depart(
edep varchar2(9) 
)

4.
alter table depart add constraint pk_DEP_edep primary key(edep)

5.
alter table employee add constraint fk_employee_edep foreign key(edep)
references depart(edep)

6.
insert into depart values('인사부')
insert into depart values('홍보부')
insert into depart values('연구실')
insert into depart values('영업부')

insert into employee (eid,ename,edep) values('e001','kim','인사부')
insert into employee (eid,ename,edep) values('e002','lee','홍보부')
insert into employee (eid,ename,edep) values('e003','park','연구실')
insert into employee (eid,ename,edep) values('e004','choi','영업부')
insert into employee (eid,ename,edep) values('e005','jung','비서실') -- 입력안됌

--edep에는 인사부/홍보부/연구실/영업부만 들어갈 수 있음



select * from employee


 



insert into employee(eid, ename) values ('e006','kim')
select * from employee

--외래키는 null값 허용



update member set name = 'z', job = 'l' where mid = 'm002'




create table china(
menu varchar2(9) primary key,
price number(5))

create table menu(
menu varchar2(9) primary key)

alter table china add constraint fk_china_menu foreign key(menu)
references menu

insert into menu values('짜장면')
insert into menu values('짬뽕')
insert into menu values('탕수육')
insert into menu values('간짜장')

insert into china values ('짜장면',5000)
insert into china values ('짬뽕',6000)
insert into china values ('탕수육',15000)
insert into china values ('간짜장',7000)
insert into china values('국밥',6000)
select * from china
select * from member







