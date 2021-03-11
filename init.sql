# Postgres
# CREATE USER fguser WITH PASSWORD '1qaz5tgB';
# CREATE DATABASE fenceapi;
# GRANT ALL PRIVILEGES ON DATABASE fenceapi TO fguser;

#SELECT user,authentication_string,plugin,host FROM mysql.user;

create user competencemapuser identified by 'Mrsalwaysright201096';
create database competencemap;
grant all on competencemap.* to competencemapuser;
flush privileges;
