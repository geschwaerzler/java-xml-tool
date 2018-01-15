-- To create the messages2 databse, cd into project home 'java-xml-tool' and run from commandline:
-- java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/messages2;create=true' db/createDbMessages2.sql

CREATE TABLE messages (
    id          int primary key not null,
    from_adr    varchar(255) not null,
    to_adr      varchar(255) not null,
    subject     varchar(255) not null,
    body        varchar(30000)
);

CREATE TABLE replied_messages (
    id          int primary key not null,
    message_id  int not null references messages(id),
    from_adr    varchar(255) not null,
    body        varchar(30000)
);