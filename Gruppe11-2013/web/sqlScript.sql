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
fornavn CHAR(10)  NOT NULL, 
etternavn CHAR(10)  NOT NULL, 
brukernavn CHAR(10)  NOT NULL, 
postnummer CHAR(10), 
CONSTRAINT bruker_PK PRIMARY KEY(brukernavn) 
);

CREATE TABLE rolle (
rolle CHAR(10)  NOT NULL, 
brukernavn CHAR(10)  NOT NULL,
CONSTRAINT rolle_PK PRIMARY KEY(rolle, brukernavn)
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
brukernavn CHAR(10)  NOT NULL, 
selskapnr INTEGER  NOT NULL, 
CONSTRAINT selskapKunde_PK PRIMARY KEY(brukernavn, selskapnr)
);

CREATE TABLE utkjøring (
brukernavn CHAR(10)  NOT NULL, 
salgsnummer CHAR(10)  NOT NULL, 
bilnr INTEGER NOT NULL, 
utkørinKogstatus VARCHAR(10), 
sjåførBrukernavn CHAR(10)  NOT NULL, 
CONSTRAINT utkjøring_PK PRIMARY KEY(brukernavn, salgsnummer, bilnr, sjåførBrukernavn)
);

CREATE TABLE salg (
salgsnummer CHAR(10)  NOT NULL, 
sumSalg CHAR(10), 
CONSTRAINT salg_PK PRIMARY KEY(salgsnummer)
);


CREATE TABLE sjåfører (
brukernavn CHAR(10)  NOT NULL, 
Førekortklasse CHAR(10)  NOT NULL, 
CONSTRAINT sjåfører_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE Bosted (
postnummer CHAR(10)  NOT NULL, 
poststed CHAR(10)  NOT NULL, 
CONSTRAINT Bosted_PK PRIMARY KEY(postnummer)
);

CREATE TABLE ordre (
brukernavn CHAR(10)  NOT NULL ,
salgsnummer CHAR(10)  NOT NULL  ,
datoEndret DATE,  
datoLevert DATE,  
bekreftet DATE,  
selskapnr INTEGER,
betaltstatus CHAR(10),
CONSTRAINT ordre_PK PRIMARY KEY(brukernavn, salgsnummer)
);


CREATE TABLE retter (
navn CHAR(10)  NOT NULL, 
rettnummer CHAR(10)  NOT NULL,
CONSTRAINT retter_PK PRIMARY KEY(rettnummer)
);


CREATE TABLE Kunde (
brukernavn CHAR(10) NOT NULL, 
avslag VARCHAR(10), 
CONSTRAINT Kunde_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE ordretabell (
rettnummer CHAR(10)  NOT NULL,
selgerbrukernavn CHAR(10)  NOT NULL,
salgsnummer CHAR(10)  NOT NULL,
kundebrukernavn CHAR(10)  NOT NULL, 
CONSTRAINT ordretabell_PK PRIMARY KEY(salgsnummer, selgerbrukernavn, kundebrukernavn)
);

CREATE TABLE selgere(
brukernavn CHAR(10)  NOT NULL,
salgPerManed CHAR(10), 
opparbeidetProvisjon CHAR(10), 
antSalg CHAR(10),
timer CHAR(10),
CONSTRAINT selgere_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE annet (
brukernavn CHAR(10)  NOT NULL, 
fastlønn CHAR(10), 
CONSTRAINT annet_PK PRIMARY KEY(brukernavn)
);

CREATE TABLE administrator (
brukernavn CHAR(10)  NOT NULL,
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

