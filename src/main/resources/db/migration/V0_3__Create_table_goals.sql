create table if not exists goals(
    id serial primary key,
    score_time int,
    scorer_id int references player(id),
    is_own_goal boolean,
    id_match int references game(id)
);