# Postgres
# CREATE USER fguser WITH PASSWORD '1qaz5tgB';
# CREATE DATABASE fenceapi;
# GRANT ALL PRIVILEGES ON DATABASE fenceapi TO fguser;

#SELECT user,authentication_string,plugin,host FROM mysql.user;

create user competenceuser identified by 'competence12345';
create database competencemap;
grant all on competencemap.* to competenceuser;
flush privileges;
