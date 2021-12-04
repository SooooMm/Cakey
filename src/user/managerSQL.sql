create database Cakey default character set utf8 default collate utf8_general_ci;
use cakey; //alter table ¿Ã∏ß convert to charset utf8;
 
create table sheets(
    name varchar(20) primary key,
    price int,
    fileSrc varchar(100)
);

create table Cream(
    name varchar(20) primary key,
    price int,
    fileSrc varchar(100)
);

create table Ingre(
    name varchar(20) primary key,
    price int,
    fileSrc varchar(100)
);

create table Topping(
    name varchar(20) primary key,
    price int,
    fileSrc varchar(100)
);

create table Floor(
    name varchar(20) primary key,
    price int,
    fileSrc varchar(100)
);

create table Addp(
    name varchar(20) primary key,
    price int,
    fileSrc varchar(100)
);

