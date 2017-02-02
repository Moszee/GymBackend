CREATE TABLE coach(
  id SERIAL PRIMARY KEY ,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  birth_date DATE,
  employment_date DATE,
  position VARCHAR(255)
);

insert into coach(first_name, last_name, birth_date, employment_date, position)
  values ('Antoni', 'Pobłażliwy', to_date('07-04-1989', 'DD-MM-YYYY'), to_date('07-04-1989', 'DD-MM-YYYY'), 'SENIOR_ATHLETE');
insert into coach(first_name, last_name, birth_date, employment_date, position)
  values ('Mieczysław', 'Wyrozumiały', to_date('07-04-1989', 'DD-MM-YYYY'), to_date('07-04-1989', 'DD-MM-YYYY'), 'SENIOR_ATHLETE');
insert into coach(first_name, last_name, birth_date, employment_date, position)
  values ('Izabela', 'Niezłomna', to_date('07-04-1989', 'DD-MM-YYYY'), to_date('07-04-1989', 'DD-MM-YYYY'), 'JUNIOR_ATHLETE');