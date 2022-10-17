CREATE DATABASE registro_de_mutantes;
\c registro_de_mutantes

DROP DATABASE registro_de_mutantes;


CREATE TABLE IF NOT EXISTS admin(
	idadmin SERIAL  PRIMARY KEY,
	nome VARCHAR(100),
	email VARCHAR(100) UNIQUE,
	senha VARCHAR(100)
);

DROP TABLE admin;


INSERT INTO admin VALUES(1, 'William Stryker', 'stryker@gmail.com',1234);
INSERT INTO admin VALUES(2, 'Greydon Creed', 'tolerancia0@gmail.com',1234);


CREATE TABLE IF NOT EXISTS mutantes(
	id_mutante SERIAL,
	pais VARCHAR(100),
	uf VARCHAR(100),
	cidade VARCHAR(100),
	nome VARCHAR(100),
	habilidade VARCHAR(100),
	id_admin int,
	FOREIGN KEY(id_admin) REFERENCES admin(idadmin)
);

DROP TABLE mutantes;

INSERT INTO mutantes VALUES(1, 'Eua', 'NY', 'Manhattan', 'Charles Francis Xavier','telepatia e psicosinese.',1);
INSERT INTO mutantes VALUES(2, 'Eua', 'NY', 'Manhattan', 'Peter Parker','sentido de aranha, força aprimorada, velocidade aprimorada',1);
INSERT INTO mutantes VALUES(3, 'Eua', 'Mississipi', 'Caldecott County', 'Ana Marie','absorção orgânica por contato fisíco.',2);

SELECT * FROM mutantes;


SELECT * FROM admin;

SELECT  a.nome, 
	a.email,
	m.nome,
	m.pais, 
	m.uf,
	m.cidade,
	m.habilidade
FROM admin a
INNER JOIN mutantes m
ON a.idadmin=m.id_admin;





