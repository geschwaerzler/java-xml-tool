-- To list the addresses database, cd into project home 'java-xml-tool' and run from commandline:
-- java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/addresses' db/listAddresses.sql

select p.firstname || ' ' || p.lastname || ', ' || a.street || ', ' || a.city
  from addresses a
  join persons p on (a.person_id = p.id);