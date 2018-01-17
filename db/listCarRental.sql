-- To list the CarRental database, cd into project home 'java-xml-tool' and run from commandline:
-- psql -f db/listCarRental.sql CarRental

select *
  from vermietstation V
  join stadt S on (V.stadtcode = S.stadtcode)
;
