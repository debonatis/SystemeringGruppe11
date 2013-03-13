DROP TABLE administrator;
DROP TABLE annet;
DROP TABLE UTKJØRING;
DROP TABLE UTKJØRINGSBIL;
DROP TABLE ordretabell;
DROP TABLE sjåfører;
DROP TABLE ordre;
DROP TABLE selgere;
DROP TABLE salg;
DROP TABLE rolle;
DROP TABLE SELSKAPKUNDE;
DROP TABLE kunde;
DROP TABLE bruker;
DROP TABLE bosted;
DROP TABLE retter;
DROP TABLE selskaper;

CREATE TABLE bruker (
brukernavn CHAR(10)  NOT NULL,
passord CHAR(10) NOT NULL,
fornavn CHAR(10)  NOT NULL, 
etternavn CHAR(10)  NOT NULL,
adresse CHAR(20) NOT NULL,
email CHAR(30) NOT NULL,
telefon INTEGER NOT NULL,
postnummer INTEGER, --(FK1 - BOSTED)
CONSTRAINT bruker_PK PRIMARY KEY(brukernavn) 
);

CREATE TABLE bosted (
postnummer INTEGER, 
poststed CHAR(10)  NOT NULL, 
CONSTRAINT Bosted_PK PRIMARY KEY(postnummer)
);

CREATE TABLE rolle (
brukernavn CHAR(10), --(FK1 - BRUKER)
rollen CHAR(10)  NOT NULL, 
CONSTRAINT rolle_PK PRIMARY KEY(brukernavn, rollen)
);

CREATE TABLE selskaper (
selskapnr INTEGER GENERATED ALWAYS AS IDENTITY, 
avslag INTEGER, 
akkumulertSalg INTEGER,
CONSTRAINT selskaper_PK PRIMARY KEY(selskapnr)
);

CREATE TABLE utkjøringsBil (
bilnr INTEGER GENERATED ALWAYS AS IDENTITY, 
regnummer CHAR(10)  NOT NULL, 
status CHAR(10)  NOT NULL, 
CONSTRAINT utkjøringsBil_PK PRIMARY KEY(bilnr)
);

CREATE TABLE selskapKunde (
brukernavn CHAR(10)  NOT NULL, --(FK1 - KUNDE)
selskapnr INTEGER NOT NULL, --(FK2 - SELSKAPER)
CONSTRAINT selskapKunde_PK PRIMARY KEY(brukernavn, selskapnr)
);

CREATE TABLE utkjøring (
brukernavn CHAR(10)  NOT NULL, --(FK1 - ORDRE)
salgsnummer CHAR(10)  NOT NULL, --(FK2 - ORDRE)
bilnr INTEGER NOT NULL, --(FK3 - UTKJØRINGSBIL)
sjåførBrukernavn CHAR(10)  NOT NULL, --(FK4 - SJÅFØRER)
utkørinKogstatus VARCHAR(10),  
CONSTRAINT utkjøring_PK PRIMARY KEY(brukernavn, salgsnummer, bilnr, sjåførBrukernavn)
);

CREATE TABLE salg (
salgsnummer CHAR(10)  NOT NULL, --(FK1 - ORDRE)
sumSalg CHAR(10), 
CONSTRAINT salg_PK PRIMARY KEY(salgsnummer)
);


CREATE TABLE sjåfører (
brukernavn CHAR(10)  NOT NULL, --(FK1 - BRUKER)
Førekortklasse CHAR(10)  NOT NULL, 
CONSTRAINT sjåfører_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE ordre (
brukernavn CHAR(10)  NOT NULL , --(FK1 - SELGERE)
salgsnummer CHAR(10)  NOT NULL  , --(FK2 - SALG)
datoEndret DATE,  
datoLevert DATE,  
bekreftet DATE,  
betaltstatus CHAR(10),
selskapnr INTEGER, --(FK3 - SELSKAPER)
CONSTRAINT ordre_PK PRIMARY KEY(brukernavn, salgsnummer)
);


CREATE TABLE retter (
rettnummer CHAR(10)  NOT NULL,
navn CHAR(10)  NOT NULL, 
beskrivelse CHAR(30),
ingredienser CHAR(30),
kalorier INTEGER,
vekt INTEGER,
pris INTEGER,
CONSTRAINT retter_PK PRIMARY KEY(rettnummer)
);


CREATE TABLE Kunde (
brukernavn CHAR(10) NOT NULL, --(FK1 - BRUKER)
avslag INTEGER, 
CONSTRAINT Kunde_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE ordretabell (
selgerbrukernavn CHAR(10)  NOT NULL, --(FK1 - ORDRE)
salgsnummer CHAR(10)  NOT NULL, --(FK2 - ORDRE)
kundebrukernavn CHAR(10)  NOT NULL, --(FK3 - KUNDE)
rettnummer CHAR(10)  NOT NULL,--(FK4 - RETTER)
CONSTRAINT ordretabell_PK PRIMARY KEY(salgsnummer, selgerbrukernavn, kundebrukernavn)
);

CREATE TABLE selgere(
brukernavn CHAR(10)  NOT NULL, --(FK1 - BRUKER)
salgPerManed CHAR(10), 
opparbeidetProvisjon CHAR(10), 
antSalg CHAR(10),
timer CHAR(10),
CONSTRAINT selgere_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE annet (
brukernavn CHAR(10)  NOT NULL, --(FK1 - BRUKER)
fastlønn CHAR(10), 
CONSTRAINT annet_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE administrator (
brukernavn CHAR(10)  NOT NULL, --(FK1 - BRUKER)
CONSTRAINT administrator_PK PRIMARY KEY(brukernavn)
);

ALTER TABLE bruker  
ADD CONSTRAINT Bosted_bruker_FK1 FOREIGN KEY (postnummer)
REFERENCES Bosted (postnummer);

ALTER TABLE rolle  
ADD CONSTRAINT bruker_rolle_FK1 FOREIGN KEY (brukernavn)
REFERENCES bruker (brukernavn);

ALTER TABLE selskapKunde  
ADD CONSTRAINT Kunde__FK1 FOREIGN KEY (brukernavn)
REFERENCES Kunde (brukernavn);

ALTER TABLE selskapKunde  
ADD CONSTRAINT selskaper__FK1 FOREIGN KEY (selskapnr)
REFERENCES selskaper (selskapnr);

ALTER TABLE utkjøring  
ADD CONSTRAINT ordre_utkjøring_FK1 FOREIGN KEY (brukernavn, salgsnummer)
REFERENCES ordre (brukernavn, salgsnummer);

ALTER TABLE utkjøring  
ADD CONSTRAINT utkjøringsBil_utkjøring_FK1 FOREIGN KEY (bilnr)
REFERENCES utkjøringsBil (bilnr);

ALTER TABLE utkjøring  
ADD CONSTRAINT sjåfører_utkjøring_FK1 FOREIGN KEY (sjåførBrukernavn)
REFERENCES sjåfører (brukernavn);

ALTER TABLE sjåfører  
ADD CONSTRAINT bruker_sjåfører_FK1 FOREIGN KEY (brukernavn)
REFERENCES bruker (brukernavn);

ALTER TABLE ordre  
ADD CONSTRAINT selskaper_ordre_FK1 FOREIGN KEY (selskapnr)
REFERENCES selskaper (selskapnr);

ALTER TABLE ordre  
ADD CONSTRAINT selgere_ordre_FK1 FOREIGN KEY (brukernavn)
REFERENCES selgere (brukernavn);

ALTER TABLE ordre  
ADD CONSTRAINT salg_ordre_FK1 FOREIGN KEY (salgsnummer)
REFERENCES salg (salgsnummer);

ALTER TABLE Kunde  
ADD CONSTRAINT bruker_Kunde_FK1 FOREIGN KEY (brukernavn)
REFERENCES bruker (brukernavn);

ALTER TABLE ordretabell  
ADD CONSTRAINT Kunde_ordretabell_FK1 FOREIGN KEY (kundebrukernavn)
REFERENCES Kunde (brukernavn);

ALTER TABLE ordretabell  
ADD CONSTRAINT retter_ordretabell_FK1 FOREIGN KEY (rettnummer)
REFERENCES retter (rettnummer);

ALTER TABLE ordretabell  
ADD CONSTRAINT ordre_ordretabell_FK1 FOREIGN KEY (selgerbrukernavn, salgsnummer)
REFERENCES ordre (brukernavn, salgsnummer);

ALTER TABLE selgere  
ADD CONSTRAINT bruker_selgere_FK1 FOREIGN KEY (brukernavn)
REFERENCES bruker (brukernavn);

ALTER TABLE annet  
ADD CONSTRAINT bruker_annet_FK1 FOREIGN KEY (brukernavn)
REFERENCES bruker (brukernavn);

ALTER TABLE administrator  
ADD CONSTRAINT bruker_administrator_FK1 FOREIGN KEY (brukernavn)
REFERENCES bruker (brukernavn);

INSERT INTO bosted VALUES (7018,'Trondheim');
INSERT INTO bosted VALUES (7050,'Trondheim');
INSERT INTO bosted VALUES (7052,'Trondheim');
INSERT INTO bosted VALUES (7036,'Trondheim');

INSERT INTO bruker VALUES ('martinB','asdf1234','Martin','Bakkmyr','Blåklokkeveien 18B','lol@lol.com'
,13377331,7050);
INSERT INTO bruker VALUES ('simonD','asdf1234','Simon','Dehli','Solsiden 1A','lol@lol.com'
,13377331,7018);
INSERT INTO bruker VALUES ('jørgenO','asdf1234','Jørgen','Olsen','Blåklokkeveien 18B','lol@lol.com'
,13377331,7050);
INSERT INTO bruker VALUES ('martinA','asdf1234','Martin','Almvik','Lolz 1','lol@lol.com'
,13377331,7052);
INSERT INTO bruker VALUES ('mikaelS','asdf1234','Mikael','Solstad','Lolz 2','lol@lol.com'
,13377331,7052);

INSERT INTO rolle VALUES ('simonD', 'admin');
INSERT INTO rolle VALUES ('jørgenO', 'Sjåfør');
INSERT INTO rolle VALUES ('martinB', 'Sjef');
INSERT INTO rolle VALUES ('martinA', 'Kunde');
INSERT INTO rolle VALUES ('mikaelS', 'Bedrift');

INSERT INTO SELSKAPER(avslag, akkumulertSalg) VALUES (20, 200000);
INSERT INTO SELSKAPER(avslag, akkumulertSalg) VALUES (15, 150000);
INSERT INTO SELSKAPER(avslag, akkumulertSalg) VALUES (10, 100000);

INSERT INTO KUNDE VALUES ('martinA', 5);
INSERT INTO KUNDE VALUES ('mikaelS', 15);