create table EXAM_RESULT (
   student_name VARCHAR(30) NOT NULL,
   dob DATE NOT NULL,
   percentage  double NOT NULL
);

insert into exam_result(student_name,dob,percentage)
values('Brian Burlet','1985-02-01',76);

insert into exam_result(student_name,dob,percentage)
values('Rita Paul','1993-02-01',92);

insert into exam_result(student_name,dob,percentage)
values('Han Yenn','1965-02-01',83);

insert into exam_result(student_name,dob,percentage)
values('Peter Pan','1987-02-03',62);

insert into exam_result(student_name,dob,percentage)
values('Sonya Blade','1988-12-03',99);



insert into exam_result(student_name,dob,percentage)
values('Brian Burlet1','1985-02-01',76);

insert into exam_result(student_name,dob,percentage)
values('Rita Paul1','1993-02-01',92);

insert into exam_result(student_name,dob,percentage)
values('Han Yenn1','1965-02-01',83);

insert into exam_result(student_name,dob,percentage)
values('Peter Pan1','1987-02-03',62);

insert into exam_result(student_name,dob,percentage)
values('Sonya Blade1','1988-12-03',99);


insert into exam_result(student_name,dob,percentage)
values('Brian Burlet2','1985-02-01',76);

insert into exam_result(student_name,dob,percentage)
values('Rita Paul2','1993-02-01',92);

insert into exam_result(student_name,dob,percentage)
values('Han Yenn2','1965-02-01',83);

insert into exam_result(student_name,dob,percentage)
values('Peter Pan2','1987-02-03',62);

insert into exam_result(student_name,dob,percentage)
values('Sonya Blade2','1988-12-03',99);

insert into exam_result(student_name,dob,percentage)
values('Javans','1987-03-05',100);

commit;


create table DUAL (
   dummy VARCHAR(30) NOT NULL
);

insert into DUAL(dummy)
values('X');

COMMIT;