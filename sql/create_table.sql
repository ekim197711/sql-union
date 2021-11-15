drop table if exists spaceship_captain;
create table spaceship_captain
(
    id serial,
    name text not null,
    planet_origin text not null,
    experience integer not null,
    no_crashes integer not null
);

create unique index spaceship_capatain_id_uindex
    on spaceship_captain (id);

alter table spaceship_captain
    add constraint spaceship_capatain_pk
        primary key (id);

