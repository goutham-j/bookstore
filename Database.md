### Copy and Paste the following SQL commands to create the requried database/tables for this Project :

create database if not exists bookstore;

use bookstore;

create table if not exists books(id int primary key, name varchar(100), author varchar(100), price int, quantity int);

insert into  books values(1, 'Data Structures Through C', 'G.S. Baluja', 525, 20);

insert into  books values(2, 'The Go Programming Language','Alan A. A. Donovan and Brian W. Kernighan',400,8);

insert into  books values(3, 'C++ Primer','Stanley Lippman and Josée Lajoie and Barbara Moo',976,13);

insert into  books values(4, 'The Rust Programming Language','Steve Klabnik and Carol Nichols',560,12);

insert into  books values(5, 'Head First Java','Kathy Sierra and Bert Bates and Trisha Gee',754,23);

insert into  books values(6, 'Fluent Python','Luciano Ramalho',1014,5);

insert into  books values(7, 'The Road to Learn React','Robin Wieruch',239,18);

insert into  books values(8, 'Clean Code: A Handbook of Agile Software Craftsmanship','Robert C Martin',288,3);

insert into  books values(9, 'Domain-Driven Design','Eric Evans',560,28);

insert into  books values(10, 'Let us C', 'Yashavant Kanetkar', 329, 15);

insert into  books values(11, 'A Programmers Guide to Computer Science','William Springer',188,4);

insert into  books values(12, 'The Soul of a New Machine','Tracy Kidder',293,30);

insert into  books values(13, 'Effective Java','Joshua Bloch',368,21);

insert into  books values(14, 'Practical Rust Projects','Shing Lyu',257,15);

insert into  books values(15,' Agni Veena','Kazi Nasrul Islam',259,25);

create table if not exists users(username varchar(100) primary key,password varchar(100), firstname varchar(100),lastname varchar(100),address text, phone varchar(100),mailid varchar(100),usertype int);

insert into users values('demo','demo','Demo','User','Demo Home','42502216225','demo@gmail.com',2);

insert into users values('admin','admin','Mr.','Admin','Haldia WB','9584552224521','admin@gmail.com',1);

commit;

