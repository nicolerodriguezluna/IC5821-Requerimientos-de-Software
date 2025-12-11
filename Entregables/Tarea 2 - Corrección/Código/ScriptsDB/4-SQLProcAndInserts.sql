DELIMITER //
CREATE PROCEDURE get_users()
BEGIN
	select id_user,password_user,id_college
	from userdb;
END; //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE getUserByMail(in pEmail Varchar(1000))
BEGIN 
	select userdb.id_user,userdb.password_user,userdb.id_college
	from userdb
    inner join email
    on userdb.id_user = email.id_user
    where email.address_email = pEmail;
END; //

DELIMITER //
CREATE PROCEDURE getUserByPhone(in pPhone INT)
BEGIN 
	select userdb.id_user,userdb.password_user,userdb.id_college
	from userdb
    inner join phone
    on userdb.id_user = phone.id_user
    where number_phone = pPhone;
END; //

CREATE PROCEDURE insertEmail

DELIMITER //
CREATE PROCEDURE getPersonEmail(in pIduser int)
BEGIN 
	select id_email,address_email,id_person_mail
    from email
    where id_person_mail = pIduser;
END; //

DELIMITER //
Create procedure getPersonPhone(in pIdUser int)
BEGIN 
	select id_phone,number_phone,id_person,id_phone_category
    from phone
    where id_person = pIdUser;
END; //

DELIMITER //
CREATE PROCEDURE updatePassword(in pIdUser INT, in newPassword VARCHAR(100))
BEGIN
	update userdb
    set password_user = newPassword
    where id_user = pIdUser;
    COMMIT;
END; //

DELIMITER //
Create procedure insertUser(in pPassword VARCHAR(100))
BEGIN
	insert into userdb
	(password_user,id_college,creationDate,userId,lastModifyDate,lastModifyBy)
	VALUES(pPassword,1,SYSDATE(), 'reque',SYSDATE(), 'reque');
	COMMIT;
END; //

DELIMITER //
CREATE PROCEDURE insertEmail(in Pemail Varchar(100),in pIdUser int)
BEGIN
	insert into email
	(address_email,id_user,creationDate,userId,lastModifyDate,lastModifyBy)
	VALUES (Pemail,pIdUser,SYSDATE(), 'reque',SYSDATE(), 'reque');
    COMMIT;
END;//

DELIMITER //
CREATE PROCEDURE insertPhone(in Pphone int,in pIdUser int)
BEGIN
	insert into phone
	(number_phone,id_user,id_phone_category,creationDate,userId,lastModifyDate,lastModifyBy)
	VALUES (pPhone,pIdUser,1,SYSDATE(), 'reque',SYSDATE(), 'reque');
    COMMIT;
END;//

DELIMITER //
CREATE PROCEDURE getLastInsertedUser()
BEGIN
	select id_user,password_user,id_college
    from userdb
    where id_user=(SELECT LAST_INSERT_ID());
END; //

DELIMITER //
CREATE PROCEDURE insertCFO(in PidUser int)
BEGIN
	insert into chieffinancialofficer(id_user,creationDate,userId,lastModifyDate,lastModifyBy)
	VALUES (PidUser,SYSDATE(), 'reque',SYSDATE(), 'reque');
    commit;
END; //

DELIMITER //
CREATE PROCEDURE insertAdministrative(in PidUser int,in PidDedication int)
BEGIN
	insert into administrative(id_user,id_dedication,creationDate,userId,lastModifyDate,lastModifyBy)
	VALUES (PidUser,PidDedication,SYSDATE(), 'reque',SYSDATE(), 'reque');
    commit;
END; //

DELIMITER //
CREATE PROCEDURE InsertPrincipal(in PidUser int)
BEGIN
	insert into principal(id_user,creationDate,userId,lastModifyDate,lastModifyBy)
	VALUES (PidUser,SYSDATE(), 'reque',SYSDATE(), 'reque');
    commit;
END; //

DELIMITER //
CREATE PROCEDURE insertProductsservice(in pName varchar(1000),in pPrice int,in PidProv int)
BEGIN
	insert into productsservice (name_productservice,price,id_provider,creationDate,userId,lastModifyDate,lastModifyBy)
	values(pName,pPrice,PidProv,SYSDATE(), 'reque',SYSDATE(), 'reque');
    COMMIT;
END;

DELIMITER //
CREATE PROCEDURE insertProfessor(in PidUser int,in PidDedication int)
BEGIN
	insert into professor(id_user,id_dedication,creationDate,userId,lastModifyDate,lastModifyBy)
    VALUES (PidUser,PidDedication,SYSDATE(), 'reque',SYSDATE(), 'reque');
    commit;
END; //

DELIMITER //
CREATE PROCEDURE insertProvider(in PidUser int, in Pname varchar(100))
BEGIN
	INSERT INTO provider(id_user,name_provider,creationDate,userId,lastModifyDate,lastModifyBy)
    VALUES (PidUser, Pname,SYSDATE(), 'reque',SYSDATE(), 'reque');
    COMMIT;
END;
//

DELIMITER //
CREATE PROCEDURE insertStudent(in PidUser int)
BEGIN
	INSERT INTO student(id_user,creationDate,userId,lastModifyDate,lastModifyBy)
    VALUES(PidUser,SYSDATE(), 'reque',SYSDATE(), 'reque');
    COMMIT;
END;
//





	