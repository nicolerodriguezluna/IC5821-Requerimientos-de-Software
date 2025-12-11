INSERT INTO college
(name_college, creationDate, userId, lastModifyDate, lastModifyBy)
VALUES ('Instituto Tecnológico de Costa Rica', SYSDATE(), 'reque',SYSDATE(), 'reque');

insert into userdb
(password_user,id_college,creationDate,userId,lastModifyDate,lastModifyBy)
VALUES("camaron123",1,SYSDATE(), 'reque',SYSDATE(), 'reque');

insert into email
(address_email,id_user,creationDate,userId,lastModifyDate,lastModifyBy)
VALUES ("camarones@gmail.com",1,SYSDATE(), 'reque',SYSDATE(), 'reque');

insert into phoneCategory
(description_category,creationDate,userId,lastModifyDate,lastModifyBy)
VALUES ("Celular",SYSDATE(), 'reque',SYSDATE(), 'reque');

insert into phone
(number_phone,id_user,id_phone_category,creationDate,userId,lastModifyDate,lastModifyBy)
VALUES (67872661,1,1,SYSDATE(), 'reque',SYSDATE(), 'reque');

insert into principal
(id_user,creationDate,userId,lastModifyDate,lastModifyBy)
VALUES (1,SYSDATE(), 'reque',SYSDATE(), 'reque');

