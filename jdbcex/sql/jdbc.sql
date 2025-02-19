create table tbl_todo (
    tno int auto_increment primary key ,
    title varchar(100) not null,
    dueDate date not null,
    finished tinyint default 0
);
--
insert into tbl_todo (title, dueDate, finished) values ('Test...','2022-12-31',1);
--
select * from tbl_todo where tno < 10;
--
update tbl_todo set finished=0, title='Not Yet...' where tno=3;
--
delete from tbl_todo where tno > 5;
