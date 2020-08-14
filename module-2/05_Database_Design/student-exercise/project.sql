
DROP TABLE IF EXISTS employee                   CASCADE;
DROP TABLE IF EXISTS department                 CASCADE;
DROP TABLE IF EXISTS employee_project           CASCADE;
DROP TABLE IF EXISTS project                    CASCADE;
DROP TABLE IF EXISTS job_title                  CASCADE;


CREATE TABLE employee(
employee_id serial NOT NULL,
job_id serial NOT NULL,             
last_name varchar(45),
first_name varchar(45),
gender varchar (6),  
birthday date NOT NULL,
hire_date date NOT NULL, 
department_id serial,               
CONSTRAINT chk_gender CHECK(gender IN ('Male','Female')),     
CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id)

);

CREATE TABLE department(
department_id serial NOT NULL,
name varchar(45),
CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)  
);

CREATE TABLE employee_project (
employee_id serial NOT NULL,
project_id serial NOT NULL,
CONSTRAINT pk_employee_project_employee_id_project_id PRIMARY KEY (employee_id, project_id)
);

CREATE TABLE project (
project_id serial NOT NULL,
name varchar(45),
start_date DATE NOT NULL,
CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE job_title (
job_id serial NOT NULL,
title varchar(45),
CONSTRAINT pk_job_title_job_id PRIMARY KEY (job_id)
);

INSERT INTO job_title (job_id, title) VALUES (1, 'Magician');
INSERT INTO job_title (job_id, title) VALUES (2, 'Therapist');
INSERT INTO job_title (job_id, title) VALUES (3, 'CEO');
INSERT INTO job_title (job_id, title) VALUES (4, 'Blue-man group Stand-in');
INSERT INTO job_title (job_id, title) VALUES (5, 'Detective');
INSERT INTO job_title (job_id, title) VALUES (6, 'Superhero');

INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Funke', 'Tobias', 'Male', 4, 3,'1954-01-06','1981-10-14');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Bluth', 'Tobias', 'Male', 2, 3, '1952-07-07','1981-10-14');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Bluth', 'Lindsay', 'Female', 3, 1, '1958-12-21', '1982-06-12');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Holmes', 'Sherlock', 'Male', 5, 3, '1955-9-14','1993-06-03');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Bluth', 'Gob', 'Male', 1, 2, '1948-5-21', '1981-10-14');
INSERT INTO employee (last_name, first_name, gender, job_id,                birthday, hire_date) VALUES('Bluth', 'George', 'Male', 3, '1933-08-27','1982-11-13');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Stark', 'Tony', 'Male', 6, 4,'1952-03-13','1981-02-07');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Grey', 'Jean', 'Female', 6, 1,'1956-03-13','1986-06-18');

INSERT INTO department (department_id, name) VALUES(1, 'Austero-Bluth');
INSERT INTO department (department_id, name) VALUES(2, 'Entertainment');
INSERT INTO department (department_id, name) VALUES(3, 'Imaginary');
INSERT INTO department (department_id, name) VALUES(4, 'STARK industries');

INSERT INTO project (project_id, name, start_date) VALUES (1, 'Making a huge mistake', '1991-08-18' );
INSERT INTO project (project_id, name, start_date) VALUES (2, 'defeating THANOS', '1987-11-01');
INSERT INTO project (project_id, name, start_date) VALUES (3, 'Time Travel', '1990-02-11');
INSERT INTO project (project_id, name, start_date) VALUES (4, 'blue-man group preparedness', '1991-06-23');



ALTER TABLE employee
ADD FOREIGN KEY (job_id)
REFERENCES job_title(job_id);

ALTER TABLE employee
ADD FOREIGN KEY (department_id)
REFERENCES department(department_id);

ALTER TABLE employee_project
ADD FOREIGN KEY (employee_id)
REFERENCES employee (employee_id);

ALTER TABLE employee_project
ADD FOREIGN KEY (project_id)
REFERENCES project (project_id);