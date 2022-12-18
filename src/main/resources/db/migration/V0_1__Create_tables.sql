create table if not exists team(
    id serial primary key,
    name varchar(50) not null
);

create table if not exists game(
    id serial primary key,
    id_team_a int references team(id),
    id_team_b int references team(id),
    datetime timestamp,
    stadium varchar(50)
);

create table if not exists player(
    id serial primary key,
    name varchar,
    number int ,
    id_team int references team(id)
);

create table if not exists sponsors(
    id serial primary key,
    name varchar(50)
);

create table if not exists have(
    id serial primary key,
    id_sponsor int references sponsors(id),
    id_team int references team(id)
);