-- apply changes
create table departamento (
  id                            integer not null,
  numero                        integer not null,
  piso                          varchar(255) not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_departamento primary key (id)
);

create table edificio (
  id                            integer not null,
  nombre                        varchar(255) not null,
  dirección                     varchar(255) not null,
  numero_pisos                  integer not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_edificio primary key (id)
);

create table persona (
  id                            integer not null,
  rut                           integer not null,
  nombre                        varchar(255) not null,
  apellidos                     varchar(255) not null,
  email                         varchar(255) not null,
  telefono                      varchar(255) not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_persona primary key (id)
);

