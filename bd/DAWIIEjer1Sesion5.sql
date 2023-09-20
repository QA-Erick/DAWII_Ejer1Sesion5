DROP DATABASE IF EXISTS DAWIIEjer1Sesion5;
CREATE DATABASE DAWIIEjer1Sesion5;
USE DAWIIEjer1Sesion5;

create table Cliente(
cli_id int primary key auto_increment,
cli_nom varchar(50) not null,
cli_ema varchar(50) unique not null
);
create table Factura(
fac_id int primary key auto_increment,
fac_num int unique not null,
fac_fch date not null,
cli_id int not null,
foreign key(cli_id) references Cliente(cli_id)
);
create table DetalleFactura(
det_fac_id int primary key auto_increment,
det_fac_pro varchar(50) not null,
det_fac_can int not null,
det_fac_prc decimal not null,
fac_id int not null,
foreign key(fac_id) references Factura(fac_id)
);

select * from Cliente;
select * from Factura;
select * from DetalleFactura;