CREATE TABLE clientes(
	alias 		varchar(20) NOT NULL PRIMARY KEY,
    nombre		varchar(20) NOT NULL, 
    apellido 	varchar(20) NOT NULL, 
    email 		varchar(30) NULL, 
    celular 	varchar(10) NULL, 
    contraseña 	varchar(20) NOT NULL,
    nacimiento 	DATE 		NULL
);

INSERT INTO clientes VALUES ('lucky'  , 'Pedro'	 , 'Perez'	  , 'saridder@live.com'		, '3013528596', 'kisj1', '1985-10-21');
INSERT INTO clientes VALUES ('malopez', 'Maria'	 , 'Lopez'	  , 'wenzlaff@outlook.com'	, '3102564685', 'ptrj9', '1990-03-30');
INSERT INTO clientes VALUES ('diva'	  , 'Ana'	 , 'Diaz'	  , 'delpino@gmail.com'		, '3145867945', 'ersj2', '1975-12-11');
INSERT INTO clientes VALUES ('dreamer', 'Luis'	 , 'Rojas'	  , 'bmorrow@outlook.com'	, '3118561526', 'ji4j6', '1989-02-02');
INSERT INTO clientes VALUES ('ninja'  , 'Andres' , 'Cruz'	  , 'andres.cruz@gmail.com' , '3018549513', 'hrsj3', '1988-06-08');
INSERT INTO clientes VALUES ('neon'   , 'Nelson' , 'Ruiz'	  , 'neon23cruz@hotmail.com', '3102564875', 'jk2o4', '1991-01-06');
INSERT INTO clientes VALUES ('rose'   , 'Claudia', 'Mendez'	  , 'roseclaudia2@gmail.com', '3137894514', 'os3i5', '1974-09-26');
INSERT INTO clientes VALUES ('green'  , 'Jorge'	 , 'Rodriguez', 'jorgegreen@hotmail.com', '3125198891', 'loiem', '1987-08-12');