create table member(
id varchar2(6) primary key,
name varchar2(15) not null,
age number(3) check(age<200)
)
select * from member