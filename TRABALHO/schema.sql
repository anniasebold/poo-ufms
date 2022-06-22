CREATE TABLE modalidades (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT NOT NULL,
  valor REAL NOT NULL
);

SELECT nome FROM modalidades
ORDER BY nome;

INSERT INTO modalidades VALUES ("Musculação","200.00");
