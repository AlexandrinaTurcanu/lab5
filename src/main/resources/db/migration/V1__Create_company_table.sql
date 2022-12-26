create table company (
    id bigint primary key,
    denumire varchar(30) NOT NULL UNIQUE ,
    licenta varchar(30) NOT NULL ,
    nr_filiale int not null,
    email varchar(50) NOT NULL
);