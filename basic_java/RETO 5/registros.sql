CREATE TABLE registros(
	alias 		varchar(10)	 NOT NULL, 
    producto	varchar(20)	 NOT NULL,
    fecha 		DATETIME	 NOT NULL,
    FOREIGN KEY (alias) REFERENCES clientes(alias),
    PRIMARY KEY (alias, producto)
 );

 INSERT INTO  registros VALUES ('lucky'		, 'Cannondale'		, '2017-10-25 20:00:00');
 INSERT INTO  registros VALUES ("lucky"		, "Trek" 			, '2019-03-15 18:30:00');
 INSERT INTO  registros VALUES ("lucky"		, "Starker" 		, '2019-05-20 20:30:00');
 INSERT INTO  registros VALUES ("malopez" 	, "Cannondale" 		, '2018-05-20 20:30:00');
 INSERT INTO  registros VALUES ("malopez" 	, "Starker" 		, '2020-01-20 20:30:00');
 INSERT INTO  registros VALUES ("diva" 		, "Yeti" 			, '2019-05-20 20:30:00');
 INSERT INTO  registros VALUES ("diva" 		, "Fuji" 			, '2018-06-22 21:30:00');
 INSERT INTO  registros VALUES ("diva" 		, "Lucky Lion" 		, '2020-03-17 15:30:20');
 INSERT INTO  registros VALUES ("dreamer" 	, "Lucky Lion" 		, '2020-03-17 15:30:20');
 INSERT INTO  registros VALUES ("dreamer"	, "Be ,ectric" 		, '2020-04-10 18:30:20');
 INSERT INTO  registros VALUES ("ninja"		, "Aima" 			, '2020-02-17 20:30:20');
 INSERT INTO  registros VALUES ("ninja"		, "Starker" 		, '2020-02-20 16:30:20');
 INSERT INTO  registros VALUES ("ninja"		, "Mec de Colombia" , '2020-03-27 18:30:20');
 INSERT INTO  registros VALUES ("rose" 		, "Atom ,ectric" 	, '2020-03-20 21:30:20');
 INSERT INTO  registros VALUES ("green" 	, "Yeti" 			, '2020-01-10 17:30:20');
 INSERT INTO  registros VALUES ("green" 	, "Trek" 			, '2020-02-15 20:30:20');
 INSERT INTO  registros VALUES ("green" 	, "Bmc" 			, '2020-03-17 18:30:20');