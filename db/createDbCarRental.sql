-- Installation:
-- From command line cd into the project directory "java-xml-tool". Then run: 
-- # createdb CarRental
-- # psql -f db/createDbCarRental.sql CarRental
--
-- If you run createDbCarRental.sql the first time, you will get
-- "table does not exist" errors which you may ignore. Running createDbCarRental.sql
-- from then on will delete all data but give you a virgin database without errors.

-- Level 3
drop table verfuegt_ueber;
drop table mietvertrag;

-- Level 2
drop table auto;
drop table extraausstattung;
drop table reservierung;

-- Level 1
drop table autotyp;
drop table vermietstation;


-- Level 1
drop table stadt;
drop table kunde;
drop table autokategorie;


-- Level 0
create table stadt (
    stadtcode char(3),
    name varchar(255),
    einwohner_anzahl int check(einwohner_anzahl >= 0),
    primary key (stadtcode)
);

create table kunde (
    fuehrerschein_nummer char(8),
    kunde_name varchar(255),
    anschrift varchar(255),
    primary key (fuehrerschein_nummer)
);

create table autokategorie (
    kategorie_bezeichnung char(3),
    grundtarif numeric(19, 4) check(grundtarif >= 0),
    km_preis numeric(19, 4) check(km_preis >= 0),
    primary key (kategorie_bezeichnung)
);




-- Level 1
create table vermietstation (
    stadtcode char(3),
    stations_name varchar(20),
    adresse varchar(255),
    mitarbeiter_anzahl int check(mitarbeiter_anzahl >= 0),
    primary key (stadtcode, stations_name),
    foreign key (stadtcode) references stadt(stadtcode) on delete cascade
);

create table autotyp (
    typ_bezeichnung varchar(8),
    benzinverbrauch numeric(4,2) check(benzinverbrauch >= 0),
    kategorie_bezeichnung char(3),
    primary key (typ_bezeichnung),
    foreign key (kategorie_bezeichnung) references autokategorie(kategorie_bezeichnung) on delete set null
);

-- CASCADE
-- RESTRICT: raises error; immediate
-- NO ACTION: raises error; deffered (DEFAULT)
-- SET NULL
-- SET DEFAULT


-- Level 2
create table reservierung (
    stadtcode char(3),
    stations_name varchar(20),
    reservierungs_nr char(8),
    anfangsdatum date,
    enddatum date,
    fuehrerschein_nummer char(8), 
    kategorie_bezeichnung varchar(20),
    primary key (stadtcode, stations_name, reservierungs_nr),
    foreign key (stadtcode, stations_name) references vermietstation(stadtcode, stations_name) on delete cascade,
    foreign key (fuehrerschein_nummer) references kunde(fuehrerschein_nummer),
    foreign key (kategorie_bezeichnung) references autokategorie(kategorie_bezeichnung),
    constraint datums_check check(anfangsdatum <= enddatum)
);

create table auto (
    kennzeichen varchar(8),
    km_stand numeric(6) check(km_stand >= 0),
    farbe varchar(8),
    stadtcode char(3),
    stations_name varchar(20),
    typ_bezeichnung varchar(8),
    primary key (kennzeichen), 
    foreign key (stadtcode, stations_name) references vermietstation(stadtcode, stations_name) on delete set null,
    foreign key (typ_bezeichnung) references autotyp(typ_bezeichnung)
);

create table extraausstattung (
    typ_bezeichnung varchar(8),
    extras_bezeichnung varchar(8),
    aufpreis numeric(19, 4) check(aufpreis >= 0),
    primary key (typ_bezeichnung, extras_bezeichnung),
    foreign key (typ_bezeichnung) references autotyp(typ_bezeichnung) on delete cascade
);


-- Level 3
create table mietvertrag (
    stadtcode char(3),
    stations_name varchar(20),
    reservierungs_nr char(8),
    km_stand_uebergabe numeric(6) check(km_stand_uebergabe >= 0),
    km_stand_rueckgabe numeric(6) check(km_stand_rueckgabe >= 0),
    primary key (stadtcode, stations_name, reservierungs_nr),
    foreign key (stadtcode, stations_name,reservierungs_nr) references reservierung(stadtcode, stations_name, reservierungs_nr) on delete cascade,
    constraint km_stand_check CHECK (km_stand_uebergabe <= km_stand_rueckgabe)
);

create table verfuegt_ueber (
    typ_bezeichnung varchar(8),
    extras_bezeichnung varchar(8),
    kennzeichen varchar(8),
    primary key (typ_bezeichnung, extras_bezeichnung, kennzeichen),
    foreign key (typ_bezeichnung, extras_bezeichnung) references extraausstattung(typ_bezeichnung, extras_bezeichnung),
    foreign key (kennzeichen) references auto(kennzeichen)
);
