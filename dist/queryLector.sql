drop database if exists huellas;
create database huellas;
use huellas;

create table huellas (
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_empleado INT,
    huella BLOB
);

select * from huellas;