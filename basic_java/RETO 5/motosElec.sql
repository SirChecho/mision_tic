CREATE TABLE motosElec (
	fabricante 	varchar(20) NOT NULL, 
    precio 		INTEGER NOT NULL, 
    bateria 	INTEGER NOT NULL,
    proveedor 	varchar(20) NOT NULL,
    FOREIGN KEY (proveedor) REFERENCES proveedor(nombre)
);

INSERT INTO motosElec(fabricante, precio, bateria, proveedor) VALUES ('Starker'   		, 4200000, 18, 'Auteco' );
INSERT INTO motosElec(fabricante, precio, bateria, proveedor) VALUES ('Lucky Lion' 		, 5600000, 14, 'Hitachi');
INSERT INTO motosElec(fabricante, precio, bateria, proveedor) VALUES ('Be Electric'		, 4600000, 26, 'Auteco' );
INSERT INTO motosElec(fabricante, precio, bateria, proveedor) VALUES ('Aima'	   		, 8000000, 36, 'Bosch'  );
INSERT INTO motosElec(fabricante, precio, bateria, proveedor) VALUES ('Mec de Colombia' , 5900000, 20, 'Teco'	);
INSERT INTO motosElec(fabricante, precio, bateria, proveedor) VALUES ('Atom Electric'   , 4500000, 12, 'General Electric');