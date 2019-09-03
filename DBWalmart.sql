create database DBWalmart;

use DBWalmart;

create table Productos(
	codigo int not null auto_increment,
    nombre varchar(25) not null,
    descripcion varchar(50) not null,
    categoria varchar(20) not null,
    cantidad int not null,
    precioUnitario decimal(6,2) not null,
    precioDocena decimal(6,2) not null,
    primary key PK_Codigo (codigo)
);