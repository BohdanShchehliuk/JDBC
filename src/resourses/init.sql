create database MyJoinsDB_one;
use MyJoinsDB_one;

create table Personal (
id INT AUTO_iNCREMENT NOT NULL,
name varchar(20),
numb_phone int NOT NULL,
primary key (id)
);

insert into  Personal
(id, name, numb_phone)
values
(1, "Bohdan", 0931111),
(2, "Liosha",0502222),
(3, "Olia", 0673333);

select * from Personal;

create table Salary (
id INT AUTO_iNCREMENT NOT NULL,
id_personal int,
position varchar (20),
salary int,
foreign key (id_personal) references Personal(id),
primary key (id)
);

insert into Salary
(id, id_personal, position, salary)
values
(1, 1,"boss", 30000),
(2, 2, "manager", 20000),
(3, 3, "manager", 15000);


create table personalInfo (
id INT AUTO_iNCREMENT NOT NULL,
id_personal int,
maryed  BOOLEAN,
Birhday  varchar (30),
city  varchar (30),
foreign key (id_personal) references Personal(id),
primary key (id)
);

insert into personalInfo
(id, id_personal, maryed, Birhday, city)
values
(1, 1,true, "28/12/1987", "Kyiv"),
(2, 2,true, "18/11/1993", "Lviv"),
(3, 3,false, "05/12/1957", "Odesa");

select * from personalInfo ;



