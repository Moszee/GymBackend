CREATE TABLE client(
  id SERIAL PRIMARY KEY ,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  birth_date DATE
);

insert into client(first_name, last_name, birth_date) values ('Marcin', 'Szpak', to_date('07-04-1989', 'DD-MM-YYYY'));
insert into client(first_name, last_name, birth_date) values ('Marcin', 'Szpak', to_date('25-02-1987', 'DD-MM-YYYY'));
insert into client(first_name, last_name, birth_date) values ('Kazimierz', 'Mocny', to_date('22-10-1945', 'DD-MM-YYYY'));
insert into client(first_name, last_name, birth_date) values ('Władysław', 'Potężny', to_date('22-10-1945', 'DD-MM-YYYY'));