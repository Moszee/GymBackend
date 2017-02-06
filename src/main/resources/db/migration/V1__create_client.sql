create table client (
  id serial primary key,
  first_name varchar(255) not null,
  last_name varchar(255) not null,
  birth_date date
);

insert into client(first_name, last_name, birth_date) values ('Marcin', 'Szpak', to_date('07-04-1989', 'DD-MM-YYYY'));
insert into client(first_name, last_name, birth_date) values ('Marcin', 'Szpak', to_date('25-02-1987', 'DD-MM-YYYY'));
insert into client(first_name, last_name, birth_date) values ('Kazimierz', 'Mocny', to_date('22-10-1945', 'DD-MM-YYYY'));
insert into client(first_name, last_name, birth_date) values ('Władysław', 'Potężny', to_date('22-10-1945', 'DD-MM-YYYY'));