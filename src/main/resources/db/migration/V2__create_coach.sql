create table coach (
  id serial primary key,
  first_name varchar(255) not null,
  last_name varchar(255) not null,
  birth_date date,
  employment_date date,
  position varchar(255)
);

insert into coach(first_name, last_name, birth_date, employment_date, position)
  values ('Antoni', 'Pobłażliwy', to_date('07-04-1989', 'DD-MM-YYYY'), to_date('07-04-1989', 'DD-MM-YYYY'), 'SENIOR_ATHLETE');
insert into coach(first_name, last_name, birth_date, employment_date, position)
  values ('Mieczysław', 'Wyrozumiały', to_date('07-04-1989', 'DD-MM-YYYY'), to_date('07-04-1989', 'DD-MM-YYYY'), 'SENIOR_ATHLETE');
insert into coach(first_name, last_name, birth_date, employment_date, position)
  values ('Izabela', 'Niezłomna', to_date('07-04-1989', 'DD-MM-YYYY'), to_date('07-04-1989', 'DD-MM-YYYY'), 'JUNIOR_ATHLETE');