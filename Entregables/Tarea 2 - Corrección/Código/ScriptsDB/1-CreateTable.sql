USE reque;


CREATE TABLE Dedication(
    id_dedication INT NOT NULL auto_increment,
    description_dedication VARCHAR(30) NOT NULL,
    creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_dedication)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE Administrative(
    id_user INT NOT NULL auto_increment,
    id_dedication INT NOT NULL,
    creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_user)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE College(
    id_college INT NOT NULL auto_increment,
    name_college VARCHAR(100)  NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    Primary key(id_college)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE Email(
	id_email INT NOT NULL auto_increment,
	address_email VARCHAR(100) NOT NULL,
    id_user INT NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_email)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
-- SQLINES LICENSE FOR EVALUATION USE ONLY
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE LogDB(
    id_log INT NOT NULL auto_increment,
	systemdate DATETIME NOT NULL,
    time_log TIMESTAMP(6) NOT NULL,
	change_descrp VARCHAR(100) NOT NULL,
    previous_text VARCHAR(4000),
    current_text VARCHAR(4000) NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    primary KEY (id_log)
)auto_increment = 1;


-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE table ParameterDb(
    id_parameter INT NOT NULL auto_increment,
    name_parameter VARCHAR(30) NOT NULL,
    description_parameter VARCHAR(100) NOT NULL,
	value_parameter INT NOT NULL,
    route VARCHAR(200) NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_parameter)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE Phone(
    id_phone INT NOT NULL auto_increment,
    number_phone INT NOT NULL,
    id_user INT NOT NULL,
    id_phone_category INT  NOT NULL,
    creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_phone)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE PhoneCategory(
    id_category INT NOT NULL auto_increment,
    description_category VARCHAR(100) NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_category)
)auto_increment = 1;


-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE Professor(
    id_user INT NOT NULL auto_increment,
    id_dedication INT NOT NULL,
    creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_user)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE Student(
    id_user INT NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_user)
)auto_increment = 1;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE userDB(
    id_user INT NOT NULL auto_increment,
    password_user VARCHAR(100)  NOT NULL,
    id_college INT NOT NULL,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_user)
)auto_increment = 1;

create table provider(
	id_provider int not null auto_increment,
    id_user int not null,
    name_provider VARCHAR(100) NOT NULL,
    creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_provider)
) auto_increment = 1;

CREATE TABLE ProductsService (
   id_productservice int not null auto_increment,
   name_productservice VARCHAR (100),
   price int not null,
   id_provider int not null,
    creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
   Primary key(id_productservice)
)auto_increment = 1;

CREATE TABLE Principal(
    id_user int not null auto_increment,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_user)
) auto_increment = 1;

CREATE TABLE ChiefFinancialOfficer(
	id_user int not null auto_increment,
	creationDate DATETIME,
    userId VARCHAR(1000),
    lastModifyDate DATETIME,
    lastModifyBy VARCHAR(1000),
    PRIMARY KEY (id_user)
) auto_increment = 1;

