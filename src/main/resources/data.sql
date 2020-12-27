DROP TABLE IF EXISTS livros;
CREATE TABLE livros (
   id INTEGER PRIMARY KEY AUTO_INCREMENT,
   titulo VARCHAR(50) NOT NULL,
   autor VARCHAR(1000),
   editora VARCHAR(1000) NOT NULL,
   quantidade INT NOT NULL,
   registro DATE NOT NULL
);

INSERT INTO livros (titulo, autor, editora, quantidade, registro) 
VALUES ('Desenvolvimento com SpringBoot','Leandro', 'Manguesal', 5, '2020-10-13'),
		('SpringBoot para iniciantes','Leandro frança', 'Manguesal', 4, CURRENT_DATE());
		
