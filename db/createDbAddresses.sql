-- To create the addresses databse, cd into project home 'java-xml-tool' and run from commandline:
-- java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/addresses;create=true' db/createDbAddresses.sql

CREATE TABLE persons (
    id          int primary key not null,
    firstname   varchar(255) not null,
    lastname    varchar(255) not null
);

CREATE TABLE addresses (
    id          int primary key not null,
    person_id   int not null references persons(id),
    street      varchar(255) not null,
    zip         varchar(16) not null,
    city        varchar(255) not null,
    country     varchar(255)
);