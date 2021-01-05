create table tbl_member(
id varchar2(6) primary key,
name varchar2(15) not null,
age number(3) check(age <200)
)
insert into tbl_member values('m001','kim',15)
select * from tbl_member

create table menu(
sp varchar2(100) primary key,
fullname varchar2(100) not null)

insert into menu values ('/insertui.do','kr.co.command.InsertUICommand')
insert into menu values ('/insert.do','kr.co.command.InsertCommand')
insert into menu values ('/list.do','kr.co.command.ListCommand')
insert into menu values ('/read.do','kr.co.command.ReadCommand')
insert into menu values ('/updateui.do','kr.co.command.UpdateUICommand')
insert into menu values ('/update.do','kr.co.command.UpdateCommand')
insert into menu values ('/delete.do','kr.co.command.DeleteCommand')
insert into menu values ('/login.do','kr.co.command.LoginCommand')
INSERT INTO menu VALUES ('/loginui.do', 'kr.co.command.LoginUICommand')
INSERT INTO menu VALUES ('/logout.do', 'kr.co.command.LogoutCommand')


delete from menu
commit
select * from member
select * from menu
