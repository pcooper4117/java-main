drop table if exists employee cascade;
drop table if exists department cascade;
drop table if exists project cascade;
drop table if exists employee_project_mapping cascade;
-------------------------------------------------------------------------------------
create table employee
(
employee_number serial not null
, job_title character varying(55) not null
, last_name     character varying(40) not null
, first_name    character varying (10) not null
,gender         character varying (10) not null
,date_of_birth   date 
,date_of_hire     date 
, department_number  integer not null

,constraint pk_employee_employee_number primary key(employee_number)

);
-------------------------------------------------------------------------------
create table department
(
department_number serial not null
,name character varying (20) not null
--, number_of_employees int 
, constraint pk_department_department_number primary key (department_number)
);

------------------------------------------------------------------------------------
create table project 
(
project_number serial not null
,name character varying(50) not null
,start_date date not null
--,number_of_employees int 
,constraint pk_project_projectNumber primary key(project_number)
);

---------------------------------------------------------------------------
create table employee_project_mapping
(
employee_number int not null
,project_number int not null
)
;


 
 alter table employee 
 add foreign key (department_number)
 references department(department_number)
 ;
 
 alter table employee_project_mapping
 add foreign key (employee_number)
 references employee(employee_number)
 ;
 alter table employee_project_mapping
 add foreign key (project_number)
 references project(project_number)
 ;
 insert into department
 (name)
 values ('Dev Team')
 ;
 insert into department 
 (name)
 values ('Dream Team');
 
 insert into department 
 (name) 
 values ('B squad');
 
 insert into project 
 (name, start_date)
 values ('Hoagie','02-15-1998' )
 ;
 insert into project
 (name, start_date)
 values ('Stonk Market', '12-15-2001')
 ;
 insert into project 
 (name, start_date) 
 values ('Module 3', '12-05-2005')
 ;
 insert into project 
 (name, start_date) 
 values ('Module 4', '11-05-2005')
 ;
 insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Instructor', 'MtnDew', 'Frank', 'Male','08-14-21', '02-15-21',1) 
 ;
 insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Franks sidekick', 'HowWings', 'Jason', 'Male','05-05-1991', '02-15-21',1) 
 ;
 insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('coder', 'Smith', 'Dave', 'Male','05-05-1981', '02-14-21',2) 
 ;
  insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Banker', 'Doogie', 'Markie', 'Male','05-07-1991', '03-18-21',2) 
 ;
  insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Writer', 'Goshling', 'Janie', 'Female','04-07-1981', '02-12-21',3) 
 ;
   insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Sales', 'Burns', 'Billy', 'Male','04-04-1991', '02-07-21',3) 
 ;
    insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Writer', 'Boier', 'Joan', 'Female','04-04-1997', '02-10-21',3) 
 ;
    insert into employee
 (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_number)
 values('Sales', 'Reacher', 'Jake', 'Male','04-04-1984', '03-04-21',2) 
 ;
 
 insert into employee_project_mapping
 (employee_number, project_number)
 values ((select employee_number from employee where first_name = 'Billy'), (select project_number from project where name = 'Stonk Market'))
 ;
  insert into employee_project_mapping
 (employee_number, project_number)
 values ((select employee_number from employee where first_name = 'Joan'), (select project_number from project where name = 'Module 4'))
 ;
  insert into employee_project_mapping
 (employee_number, project_number)
 values ((select employee_number from employee where first_name = 'Jake'), (select project_number from project where name = 'Module 3'))
 ;
  insert into employee_project_mapping
 (employee_number, project_number)
 values ((select employee_number from employee where first_name = 'Markie'), (select project_number from project where name = 'Hoagie'))
 ;
 select * from employee;
 select * from project;
 select * from department;
 select * from employee_project_mapping;