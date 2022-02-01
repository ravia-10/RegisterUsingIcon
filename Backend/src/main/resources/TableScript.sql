drop database if exists user_db;
create database user_db;
use user_db;



create table user(
	user_id int auto_increment,
	name varchar(30),
	email varchar(50),
	password varchar(12),
	phone varchar(10),
	constraint pk_usr_id primary key (user_id)
);

commit;