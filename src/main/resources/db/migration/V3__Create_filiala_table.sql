create table filiala(
    id bigint primary key ,
    nr_filialei varchar(10) NOT NULL UNIQUE ,
    nr_produse int NOT NULL ,
    adresa varchar(40) NOT NULL,
    compania_id bigint UNIQUE
);