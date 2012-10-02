CREATE TABLE D (IDD INTEGER NOT NULL, PRIMARY KEY (IDD))
CREATE TABLE E (IDE INTEGER NOT NULL, PRIMARY KEY (IDE))
CREATE TABLE F (IDF INTEGER NOT NULL, E_IDE INTEGER, PRIMARY KEY (IDF))
CREATE TABLE G (IDG INTEGER NOT NULL, PRIMARY KEY (IDG))
CREATE TABLE A (IDA INTEGER NOT NULL, PRIMARY KEY (IDA))
CREATE TABLE IMMO_JARDIN (jardins_IDJARDIN INTEGER NOT NULL, immos_IDIMMO INTEGER NOT NULL, PRIMARY KEY (jardins_IDJARDIN, immos_IDIMMO))
CREATE TABLE B (IDB INTEGER NOT NULL, A_IDA INTEGER, PRIMARY KEY (IDB))
CREATE TABLE C (IDC INTEGER NOT NULL, D_IDD INTEGER, PRIMARY KEY (IDC))
CREATE TABLE IMMO (IDIMMO INTEGER NOT NULL, PRIMARY KEY (IDIMMO))
CREATE TABLE G_H (G_IDG INTEGER NOT NULL, hs_IDH INTEGER NOT NULL, PRIMARY KEY (G_IDG, hs_IDH))
CREATE TABLE H (IDH INTEGER NOT NULL, PRIMARY KEY (IDH))
CREATE TABLE JARDIN (IDJARDIN INTEGER NOT NULL, PRIMARY KEY (IDJARDIN))
CREATE TABLE CAR (IDCAR INTEGER AUTO_INCREMENT NOT NULL, TEAMCAR VARCHAR(255), DRIVERCAR VARCHAR(255), PRIMARY KEY (IDCAR))
CREATE TABLE RACE (IDRACE INTEGER NOT NULL, LOCATION VARCHAR(255), PRIMARY KEY (IDRACE))
ALTER TABLE F ADD CONSTRAINT FK_F_E_IDE FOREIGN KEY (E_IDE) REFERENCES E (IDE)
ALTER TABLE IMMO_JARDIN ADD CONSTRAINT FK_IMMO_JARDIN_immos_IDIMMO FOREIGN KEY (immos_IDIMMO) REFERENCES IMMO (IDIMMO)
ALTER TABLE IMMO_JARDIN ADD CONSTRAINT FK_IMMO_JARDIN_jardins_IDJARDIN FOREIGN KEY (jardins_IDJARDIN) REFERENCES JARDIN (IDJARDIN)
ALTER TABLE B ADD CONSTRAINT FK_B_A_IDA FOREIGN KEY (A_IDA) REFERENCES A (IDA)
ALTER TABLE C ADD CONSTRAINT FK_C_D_IDD FOREIGN KEY (D_IDD) REFERENCES D (IDD)
ALTER TABLE G_H ADD CONSTRAINT FK_G_H_hs_IDH FOREIGN KEY (hs_IDH) REFERENCES H (IDH)
ALTER TABLE G_H ADD CONSTRAINT FK_G_H_G_IDG FOREIGN KEY (G_IDG) REFERENCES G (IDG)