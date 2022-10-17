CREATE DATABASE registro_de_mutantes;
\c registro_de_mutantes

DROP DATABASE registro_de_mutantes;

CREATE TABLE IF NOT EXISTS mutantes(
	id SERIAL,
	pais VARCHAR(100),
	uf VARCHAR(100),
	cidade VARCHAR(100),
	nome VARCHAR(100),
	habilidade VARCHAR(100),
	id_mutantes int,
	PRIMARY KEY(id_mutantes),
	FOREIGN KEY(id) REFERENCES admin(id)
);

DROP TABLE mutantes;

SELECT * FROM mutantes;


CREATE TABLE IF NOT EXISTS admin(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(100),
	email VARCHAR(100) UNIQUE,
	senha VARCHAR(100)
);

DROP TABLE admin;

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
ON a.id=m.id_mutantes;



