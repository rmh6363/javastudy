create table account(
id varchar(3) primary key,
balance number)

kim: 0
lee: 10000
kim�� lee���� 10000���� ������
lee ������.
---->kim�� balance 10000��
lee balance 0��
-->
kim�� lee���� 10000�� �����ϴ�.
kim�� ���ڵ忡�� balance���� 0
-------------���꿡�� ���� ����-----------
leedml ���ڵ忡�� balance���� 10000
====>lee�� balance 0 ����

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














