CREATE TABLE proveedor(
	 nombre 	varchar(20) NOT NULL PRIMARY KEY, 
     direccion 	varchar(20) NOT NULL,
     telefono 	varchar(20) NOT NULL
);

INSERT INTO proveedor(nombre, direccion, telefono) VALUES ('Auteco' 		 ,'calle 7 No. 45-17'    , '05713224459');
INSERT INTO proveedor(nombre, direccion, telefono) VALUES ('Hitachi'		 ,'calle 19 No. 108-26'  , '05714223344');
INSERT INTO proveedor(nombre, direccion, telefono) VALUES ('Bosch'  		 ,'carrera 68 No. 26-45' , '05715678798');
INSERT INTO proveedor(nombre, direccion, telefono) VALUES ('Teco'   		 ,'calle 77 No. 68-33'   , '05712213243');
INSERT INTO proveedor(nombre, direccion, telefono) VALUES ('General Electric','calle 29 No. 26-12'	 , '05717239919');
