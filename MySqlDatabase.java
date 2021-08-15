UC-1:
 create database payroll_service;
 show databases;
 use payroll_service;
 
UC-2:
 create Table employee_payroll(id int, name varchar(255), salary int,start_date date);
 Describe employee_payroll;

UC-3:
 Insert into employee_payroll(id,name, salary, start_date) values(1,'meghna',5000,now());

 
UC-4:
 select * from employee_payroll;
 
UC-5:
 Select salary from employee_payroll WHERE name ='meghna';
 Select * from employee_payroll where start_date between cast('2020-08-01' AS DATE) AND DATE(now());
 
UC-6: 
 Alter Table employee_payroll add gender varchar(255);
 update employee_payroll set gender = 'M' where name = 'uma';
 select * from employee_payroll;
 
UC-7;
Select SUM(Salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender;
Select AVG(Salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender;
Select MIN(Salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender;
Select MAX(Salary) FROM employee_payroll;
Select COUNT(Salary) FROM employee_payroll;
Select COUNT(Salary) FROM employee_payroll group by gender;

UC8:
ALTER TABLE employee_payroll ADD phone varchar(255);
ALTER TABLE employee_payroll ADD address varchar(255) DEFAULT'TBD';
ALTER TABLE employee_payroll ADD department varchar(255) NOT NULL;
select * from employee_payroll;

UC9:
ALTER TABLE employee_payroll ADD Basic_Pay int;
ALTER TABLE employee_payroll ADD Deductions int;
ALTER TABLE employee_payroll ADD Taxable_Pay int;
ALTER TABLE employee_payroll ADD Income_Tax int;
ALTER TABLE employee_payroll ADD Net_Pay int;
select * from employee_payroll;

UC10:
insert into employee_payroll(id,name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay)values (5,'Terissa',18000,'2020-04-24','Female',787878787,'Mumbai','Sales',9500,1540,989,1400,14071);
alter table employee_payroll ADD PRIMARY KEY(id);
insert into employee_payroll(id,name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay)values (6,'Terissa',18000,'2020-04-24','Female',787878787,'Mumbai','Marketing',9500,1540,989,1400,14071);





