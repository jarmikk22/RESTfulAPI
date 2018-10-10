create table task(id int not null primary key, subject varchar(50),detail varchar(200), status varchar(20));
insert into task (id, subject, detail, status) values (1,'Reserach RESTful','Detail research RESTful','done');
insert into task (id, subject, detail, status) values (2,'Coding RESTful','Detail codind RESTful','pending');
insert into task (id, subject, detail, status) values (3,'Testing RESTful','Detail testing RESTful','pending');