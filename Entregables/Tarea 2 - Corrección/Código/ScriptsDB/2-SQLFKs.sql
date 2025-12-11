use reque;

ALTER TABLE student 
ADD CONSTRAINT fk_student_iduser FOREIGN KEY (id_user) references userdb(id_user);

ALTER TABLE professor 
ADD CONSTRAINT fk_professor_iduser FOREIGN KEY (id_user) REFERENCES userdb(id_user),
ADD CONSTRAINT fk_professor_iddedication FOREIGN KEY (id_dedication) references dedication(id_dedication);

ALTER TABLE administrative
ADD CONSTRAINT fk_administrative_iduser FOREIGN KEY (id_user) REFERENCES userdb(id_user),
ADD CONSTRAINT fk_administrative_iddedication FOREIGN KEY (id_dedication) REFERENCES dedication(id_dedication);

ALTER TABLE userDB
ADD CONSTRAINT fk_user_idcollege FOREIGN KEY (id_college) REFERENCES college(id_college);

ALTER TABLE email
ADD CONSTRAINT fk_email_userid FOREIGN KEY(id_user) references userdb(id_user);

ALTER TABLE phone
add constraint fk_phone_category foreign key (id_phone_category) references phonecategory(id_category),
add constraint fk_phone_useid foreign key(id_user) references usedb(id_user);

ALTER TABLE chieffinancialofficer
add constraint fk_cfo_user foreign key (id_user) references userdb(id_user);

alter table principal 
add constraint fk_principal_user foreign key (id_user) references userdb(id_user);

alter table productsservice
add constraint fk_prodserv_provider foreign key (id_provider) references provider (id_provider);

alter table provider
add constraint fk_provider_user foreign key (id_user) references userdb(id_user);