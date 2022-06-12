DROP TABLE formation;
DROP TABLE module;
DROP TABLE test;

CREATE TABLE formation (
	id INTEGER AUTO_INCREMENT,
	nom VARCHAR(60)         NOT NULL,
	module VARCHAR(60)      NOT NULL,
	dateDeDebut datetime    NOT NULL,                                 
    dateDeFin   datetime	NOT NULL,
   /*niveau varchar(20)     NOT NULL ,*/
   /*test boolean (10)      NOT NULL ,*/ 
    apprenant VARCHAR(60)   NOT NULL,
	salle VARCHAR (10)      NOT NULL,
	formateur varchar (60)  NOT NULL,
	theme varchar (60)      NOT NULL,
	soustheme varchar (50)  default not null,
	PRIMARY KEY (id),
	FOREIGN KEY (apprenant) REFERENCES apprenant (id),
	FOREIGN KEY (formateur) REFERENCES formateur (id),
	FOREIGN KEY (salle)     REFERENCES salle     (id),
	FOREIGN KEY (test)      REFERENCES test      (id),
	);
	
CREATE TABLE module  (
	id INTEGER AUTO_INCREMENT,
	nom VARCHAR(60)         NOT NULL,
	formateur varchar (60)  NOT NULL,
	/*note INTEGER          NOT NULL,*/
	listemodule             NOT NULL,
	
	PRIMARY KEY (id),
	FOREIGN KEY (formation) REFERENCES formation (id),
	FOREIGN KEY (formateur) REFERENCES formateur (id),
	FOREIGN KEY (module)    REFERENCES module (id),
);

CREATE TABLE test (
		id INTEGER AUTO_INCREMENT,
		cheminTest VARCHAR(60)   NOT NULL,
		reponseTest VARCHAR(60)   NOT NULL,
		
		PRIMARY KEY (id),
		FOREIGN KEY (formation) REFERENCES formation,
		);

	
	
	