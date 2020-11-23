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














select * from
(select rownum rnum,name 이름, age 나이 from(
select name, age from test order by age asc))
where rnum between 1 and 4














































