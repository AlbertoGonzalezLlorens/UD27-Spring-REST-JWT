drop database if exists ejercicio1;
create database ejercicio1;
use ejercicio1;

drop table if exists usuario;
create table usuario(
id int auto_increment primary key,
username varchar(100),
password varchar(100),
role varchar(30)
);

insert into usuario(username,password,role) value ('alberto','$2a$10$0w51gUIIDNLQAfkGUPNjp.tZJYnydEsxxknlWvYxd6y54ZvuE6ktS','admin');

drop table if exists piezas;
create table piezas(
codigo int auto_increment primary key,
nombre nvarchar(100)
);

insert into piezas(nombre) value ('pieza1');
insert into piezas(nombre) value ('pieza2');
insert into piezas(nombre) value ('pieza3');

drop table if exists proveedores;
create table proveedores(
id char(4) primary key,
nombre nvarchar(100)
);

insert into proveedores(id,nombre) value ('AAA1','proveedor1');
insert into proveedores(id,nombre) value ('AAA2','proveedor2');
insert into proveedores(id,nombre) value ('AAA3','proveedor3');

drop table if exists suministra;
create table suministra(
id int auto_increment primary key,
codigopieza int,
idproveedor char(4),
precio int,
foreign key (codigopieza) references piezas(codigo) on delete cascade on update cascade,
foreign key (idproveedor) references proveedores(id) on delete cascade on update cascade
);

insert into suministra(codigopieza,idproveedor,precio) value (1,'AAA1',23);
insert into suministra(codigopieza,idproveedor,precio) value (2,'AAA2',23);
insert into suministra(codigopieza,idproveedor,precio) value (3,'AAA3',23);
