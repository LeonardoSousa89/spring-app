CREATE DATABASE registro_de_mutantes;
\c registro_de_mutantes

DROP DATABASE registro_de_mutantes;

CREATE TABLE IF NOT EXISTS mutantes(
	id SERIAL,
	pais VARCHAR(100),
	uf VARCHAR(100),
	cidade VARCHAR(100),
	nome VARCHAR(100),
	habilidade VARCHAR(100)
);

DROP TABLE mutantes;

SELECT * FROM mutantes;