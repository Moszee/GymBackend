create table training_excercise (id serial primary key,
                                 training_id int references training (id),
                                 excercise_id int references excercise (id),
                                 number_of_repeats int
                                );