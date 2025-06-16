# Média

Programa para calcular a média de alunos de um banco de dados.

## SQL

```sql
CREATE DATABASE escola;
use escola;

CREATE TABLE alunos (
    id INT auto_increment primary key,
    nome VARCHAR(100),
    idade int,
    curso VARCHAR(100)
);

insert into alunos (nome, idade, curso) VALUES ('Jonas', 20, 'ADS');
insert into alunos (nome, idade, curso) VALUES ('Christian', 18, 'ADS');
insert into alunos (nome, idade, curso) VALUES ('Anna', 18, 'ADS');
insert into alunos (nome, idade, curso) VALUES ('José', 38, 'ADS');
insert into alunos (nome, idade, curso) VALUES ('Pedro', 52, 'ADS');
insert into alunos (nome, idade, curso) VALUES ('Gabriel', 30, 'ADS');
```

