CREATE TABLE bicicletas(
	fabricante varchar(20) NOT NULL PRIMARY KEY,
    Precio     INTEGER NOT NULL,
    año        INTEGER NOT NULL
);

INSERT INTO bicicletas(fabricante, precio, año) VALUES ('Cannondale', 1200000, 2020);
INSERT INTO bicicletas(fabricante, precio, año) VALUES ('Trek'		, 1450000, 2019);
INSERT INTO bicicletas(fabricante, precio, año) VALUES ('Yeti'		, 2000000, 2020);
INSERT INTO bicicletas(fabricante, precio, año) VALUES ('Fuji'		, 950000 , 2021);
INSERT INTO bicicletas(fabricante, precio, año) VALUES ('Bmc' 		, 1950000, 2018);