Create database estacion;
use estacion;
create table usuario (
idUsuario int primary key ,
nombreUsuario varchar(50),
correoUsuario varchar(50),
telefono int,
usuario varchar(50),
password varchar(50),
estado boolean
);



create table estacionservicio (
idEstacion int  primary key,
nombreEstacion varchar(50),
direccionEstacion varchar(50),
estadoEstacion boolean
); 

create table Terpel(
idEstacion_Terpel int primary key  ,
precioGalon int,
cantGalones int,
FOREIGN KEY (idEstacion_Terpel)references estacionservicio(idEstacion)

);
