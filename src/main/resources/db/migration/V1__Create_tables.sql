create table competence
(
    id           bigint not null auto_increment,
    title        varchar(255),
    framework_id bigint,
    primary key (id)
) engine = InnoDB;
create table competence_e_competence
(
    competence_id     bigint       not null,
    e_competence_guid varchar(255) not null
) engine = InnoDB;
create table e_competence
(
    guid        varchar(255) not null,
    area        varchar(1),
    description text,
    title       varchar(255),
    primary key (guid)
) engine = InnoDB;
create table framework
(
    id    bigint not null auto_increment,
    title varchar(255),
    primary key (id)
) engine = InnoDB;
create table level
(
    guid              varchar(255) not null,
    description       text,
    level             integer,
    e_competence_guid varchar(255),
    primary key (guid)
) engine = InnoDB;
create table skills_n_knowledge
(
    guid              varchar(255) not null,
    title             varchar(255),
    type              varchar(1),
    e_competence_guid varchar(255),
    primary key (guid)
) engine = InnoDB;
alter table competence
    add constraint framework_fk foreign key (framework_id) references framework (id);
alter table competence_e_competence
    add constraint e_competence_fk foreign key (e_competence_guid) references e_competence (guid);
alter table competence_e_competence
    add constraint competence_fk foreign key (competence_id) references competence (id);
alter table level
    add constraint e_competence_fk_level foreign key (e_competence_guid) references e_competence (guid);
alter table skills_n_knowledge
    add constraint e_competence_fk_skills_n_knowledge foreign key (e_competence_guid) references e_competence (guid)
