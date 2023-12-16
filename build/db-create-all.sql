-- apply changes
create table contrato (
  id                            integer not null,
  fecha_pago                    timestamp not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_contrato primary key (id)
);

create table departamento (
  id                            integer not null,
  numero                        integer not null,
  piso                          integer not null,
  edificio_id                   integer,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_departamento primary key (id),
  foreign key (edificio_id) references edificio (id) on delete restrict on update restrict
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

create table pago (
  id                            integer not null,
  fecha_pago                    timestamp not null,
  monto                         integer not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_pago primary key (id)
);

create table persona (
  id                            integer not null,
  rut                           varchar(255) not null,
  nombre                        varchar(255) not null,
  apellidos                     varchar(255) not null,
  email                         varchar(255) not null,
  telefono                      varchar(255) not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_persona primary key (id)
);

