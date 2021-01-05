create table test(
name varchar2(3),
age number(3)
)

insert into test values('kim','20')
insert into test values('lee','40')
insert into test values('cho','23')
select * from test
commit

test ���̺���
��� ���ڵ���
��� �÷�����
��ȸ�Ͻÿ�

select * from test
select name from test
select age from test

alias
�÷��� ���� �ֱ�

select name as �̸�, age as ���� from test

select name �̸�, age ���� from test

select name as �̸�,age ���� from test
insert into test values('kim',33)
commit

test ���̺� ��ϵ� �� ���� ��� ����Ͻÿ�. (distinct �ߺ��� ����)
select distinct name from test
update test set name = 'roh' where name = 'cho'
select * from test
update test set age = 15 where name = 'roh'

select * from test order by age asc ��������
SELECT * From test order by age desc ��������

test ���̺���
��� ���ڵ带
��� �÷��� ���Եǰ�
��ȸ�ϵ�
�̸��� �������� ������������ ���� �Ͻÿ�.
select * from test order by name desc
create table team(
name varchar2(15),
age number(3),
position varchar2(10)
)
insert into team values('��ö��',20,'���ݼ�')
insert into team values('�迵��',20,'�����')
insert into team values('����ȣ',25,'��Ű��')
select * from team
select name as �̸�, age ���� from team
select * from team order by age asc
update team set name = '������' where name = '����ȣ'
select * from team
delete from team where name = '������' 
select * from team
insert into team values('�����',28,'���ݼ�')
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

name�� null�� ���ڵ� ������ ��ȸ
select name �̸� ,age ���� from test where name is NULL

name�� null�� �ƴ� ���ڵ� ������ ��ȸ�Ͻÿ�.
��, ���ڵ忡 ���� ������ age�� �����ǰ� ���� �ϰ�
���� age�� ������ name�� ���� �������� �����Ͻÿ�.

select age,name from test where name is not null order by age asc, name desc

test ���̺���
age�� 55�� ���ڵ带 ��ȸ�Ͻÿ�.
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
�𸣴� ������ ���ڸ� ǥ���Ҷ� _
select * from test where age between 25 and 47          between a and b
select * from test where name like 'k__'
select * from test where name like '_e___'
select * from test where name like '_e_'
�𸣴� ���� ���ڸ� ǥ���� ��%
select * from test where name like '%o'                         o�γ���
select * from test where name like '%��%'
select * from test where name like '%l%'
select * from test where name like '%'

table : ���̺�� ��ſ� select�� �ֱ�
select * from (select * from test where age > 20) where name like '%k%'
select * from test where age > 20
rownum�� 2~4
select * from 
(select rownum rnum, name, age from test)
where rnum between 2 and 4

�� select���� order by (����)������ ����,
������ select���� �̿��Ͽ� rownum �÷��� �־������
select * from(
select rownum rnum, name,age from 
(select rownum rnum ,name,age from test order by age asc)
) where rnum between 2 and 4




select * from test where name = 'kim' and age = 20


DB�� �����͸� ������ ���¿���
�÷� �ϳ����� �̿��ؼ�
Ư�� ���ڵ� �ϳ����� ��ȸ�ϰ� �;�.
�����ұ��?
--> �⺻Ű = ��Ű = primary key = pk

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

�⺻Ű�� �����ϸ�,
�⺻Ű�� ���� �ߺ��� ������� �ʴ´�
unique constraint

�⺻Ű�� �����ϸ�
�⺻Ű�� ���� NOT NULL(NULL�� ������� ����) ���������� �߰��ȴ�.

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
�ܷ�Ű = foreign key = fk

����� �����ϴ� ������ ���� �߿����� ���ÿ�
1.����
2.������
3.�����
4.��ġ�

���� ����
1~4 �߿����� �����϶�� �ߴµ�, ���ڸ� �����ϴٴ�...
�̷� �� ���� ����.

�ܷ�Ű��(foreign key = fk)�� �Ƿ��� , �ݵ�� �θ� ���̺��� �⺻Ű
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
insert into depart values('�λ��')
insert into depart values('ȫ����')
insert into depart values('������')
insert into depart values('������')

insert into employee (eid,ename,edep) values('e001','kim','�λ��')
insert into employee (eid,ename,edep) values('e002','lee','ȫ����')
insert into employee (eid,ename,edep) values('e003','park','������')
insert into employee (eid,ename,edep) values('e004','choi','������')
insert into employee (eid,ename,edep) values('e005','jung','�񼭽�') -- �Է¾ȉ�

--edep���� �λ��/ȫ����/������/�����θ� �� �� ����



select * from employee


 



insert into employee(eid, ename) values ('e006','kim')
select * from employee

--�ܷ�Ű�� null�� ���



update member set name = 'z', job = 'l' where mid = 'm002'




create table china(
menu varchar2(9) primary key,
price number(5))

create table menu(
menu varchar2(9) primary key)

alter table china add constraint fk_china_menu foreign key(menu)
references menu

insert into menu values('¥���')
insert into menu values('«��')
insert into menu values('������')
insert into menu values('��¥��')

insert into china values ('¥���',5000)
insert into china values ('«��',6000)
insert into china values ('������',15000)
insert into china values ('��¥��',7000)
insert into china values('����',6000)
select * from china
select * from member







