-- To list the messages2 database, cd into project home 'java-xml-tool' and run from commandline:
-- java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/messages2' db/listMessages2.sql

select m.from_adr || ', ' || m.subject || ', ' || r.from_adr || ', ' || r.body
  from replied_messages r
  join messages m on (r.message_id = m.id);