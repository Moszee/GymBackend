create table training (
 ID serial not null primary key,
 client_id int,
 birth_date date,
 time_of_day_code varchar(3)
    );