--
--
--School <-one to one->Principal <-One to Many-> Teachers
--
--School
--schoolId number(10,0) PK
--schoolName varchar2(250)
--principalID FK
-- one to one b/w school and Principal
--Principal
--principalID number(10,0) PK,
--principalName varchar2(250),
--teacherId number(10,0)FK 
--One to Many b/w principal to Teacher
--
--Teacher 
--teacherId number(10,0) PK
--teacherName varchar2(250)
--
-- 
select * from teacherData;

create table teacherData(
teacherID number(10,0) primary key,
teacherName varchar2(250) not null,
principalId number(10,0),
constraint FK_IN_TEACHER_DATA foreign key(principalId) references principalData(principalId)
);

create table principalData (
principalId number(10,0) primary key,
principalName varchar2(250) not null
);

create table school (
schoolId number(10,0) primary key,
schoolName varchar2(250),
principalId number(10,0),
constraint FK_PRINCIPAL_DATA foreign key(principalId) references principalData(principalId)
);

select * from principalData;


   CREATE SEQUENCE  "SYS"."SCHOOL_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
   CREATE SEQUENCE  "SYS"."TEACHER_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
   CREATE SEQUENCE  "SYS"."PRINCIPAL_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;



select * from employeedata;

select concat(upper(employee_lastname),',Welcome SQL World') from employeedata;

select 'The Development Team member Name is '|| employee_lastname from employeedata;

--SRF - Single Row Functions

select concat('The Development Team member Name is ',employee_lastname)as sentance from employeedata;

select upper('hello') from employeedata;

select upper(employee_lastname) from employeedata;

select lower(employee_lastname) from employeedata;


select upper('hello') as fromDual from dual;

select 'pizza'as FOOD ,'fanta'as Drink,concat('hello','Praneeth')as ConcatFunction from dual;

select concat(concat(upper(employee_lastname),' is the Last Name'),lower(', and their Job as '),upper('Developer')) from employeedata;

select * from employeedata where lower(employee_lastname)='diguvapalem';

select employee_lastname ,length(employee_lastname)as length from employeedata;


select 'Praneeth chakravarthi', length(substr('Praneeth chakravarthi',10,20)) from dual; 



select  LPAD(employee_lastname,14,'MR.') from employeedata; --padding the chars from left
select  RPAD(employee_lastname,14,'MR.') from employeedata; --padding the chars from right


select LTRIM(employee_lastname,'D') from employeedata;
select RTRIM(employee_lastname,'m') from employeedata;
select RTRIM('Helloooooo','o') from dual;
select LTRIM('oooooHelloooooo','o') from dual;
--length(),
--substr()
--upper()
--lower()
--concat()
--LPAD(,,)
--RPAD(,,)
--LTRIM(,)Trims the left side of chars mentioned in the 2nd param,,eg:  select LTRIM('oooooHelloooooo','o') from dual
--RTRIM(,)Trims the right side of chars metioned in the 2nd param,, eg: select RTRIM('Helloooooo','o') from dual;

--numeric and Date Type SRF 's

--round(,)

select round(1010.29,1) as valueCheck from dual;
--trunc()

select trunc(1234.0234,3) as trunckingValue  from dual;


--to_char method
--date to char /varchar with given formats
select to_char(sysdate,'YYYY-mm-dd') from dual;
select to_char(sysdate,'mm-dd-YYYY') from dual;
select to_char(sysdate,'dd-mm-YYYY')from dual;

select months_between('01-04-2025',sysdate) from dual;
select last_day(add_months(sysdate,3)) from dual;
select last_day('01-03-2025')from dual;

select next_day('06-10-1991','THURSDAY')from dual;  --- FIRST thursday from the given date is 10-10-1991, and the given date is 06-10-1991 is SUNDAY




select * from employees;
commit;

insert into employees values(6,'Praneeth',33,67000,'08-11-2017','06-08-1991','Inactive',0,'IT','image6.gif',NULL,5.0);
insert into employees values(7,'Chakravarthi',33,167000,'01-04-2025','06-08-1991','Active',0,'IT','image7.gif',10212,5.0);
--NVL() to handle the args the null values

select name,salary,NVL(monthly_sales,0),performance_score from employees;

select name,salary,NVL(to_char(monthly_sales),'No Sales in the current month'),performance_score from employees;

select name,status,NVL(monthly_sales,0) from employees 
where monthly_sales=NVL(monthly_sales,0);

select name,length(name) from employees;
select nvl(to_char(nullif(length(name),3)),'Length is 3') from employees;
select name,nvl(to_char(nullif(length(name),3)),'Length is 3') from employees;


create table city(
cityID number(10,0) primary key,
cityName varchar2(250),
countryCode varchar2(250),
district varchar2(150),
population number(20,0)
);

commit;
insert into city values(1,'Bangalore','IND','Bangalore',700000);
insert into city values(2,'Honkong','CHI','China',1000000);
insert into city values(3,'Sydeny','AUS','Austrilla',800000);
insert into city values(4,'Newyork','USA','USA',1700000);
insert into city values(5,'Tokyo','JAP','Japan',600000);
--delete from city;
select * from city;


select concat(concat(cityname,' has the population of'),to_char(population)) from city where countrycode='IND';

select concat(concat(substr(upper(district),1,3),' - '),substr(upper(district),length(district)-2,3)),length(district) from city;

SELECT CONCAT(CONCAT(UPPER(SUBSTR(district, 1, 3)), ' - '),UPPER(SUBSTR(district, LENGTH(district) - 2))) FROM city;

SELECT MONTHS_BETWEEN(LAST_DAY('15-JAN-12') + 1, '01-APR-12') FROM DUAL;











select upper('Praneeth') from dual;
select lower('PRANEETH') from dual;
select concat('Praneeth','Diguvapalem') from dual;
select substr('Praneeth',3,6) from dual;
select LPAD('Praneeth',11,'Mr.') from dual;
select RPAD('Diguvapalem',18,'SurName') from dual;

select LTRIM('PraneethDiguvapalemChakravarthi','Praneeth') from dual;
select RTRIM(LTRIM('PraneethDiguvapalemChakravarthi','Praneeth'),'Chakravarthi') from dual;

select round(1023.1232432,3)from dual;
select trunc(123213.2131,2) from dual;



select substr(2009,1,2)||LTRIM(1124,1) from dual;
select substr('Praneeth',1,2) from dual;

select months_between('02-02-2025','06-10-1991') from dual;
SELECT MONTHS_BETWEEN(LAST_DAY('15-JAN-12') + 1, '01-APR-12') FROM DUAL;
SELECT MONTHS_BETWEEN('01-02-2012','01-APR-2012') FROM DUAL;---3.03225806451612903225806451612903225806


SELECT LAST_DAY('15-JAN-12') +1 FROM DUAL;


select to_date('05-02-2001') from dual;
--NULLIF(PARAM1,, PARAM2) accepts 2 parms and if both the params are equal, it returns null else return param11
-- will be used to avoid to divide by zero
select nullif('Praneeth','Praneeth') as nulifcolumn from dual;

select * from employees;
select name,count(*),status from employees  group by status,name;
--min,max
select max(salary) AS MaxSalay ,min(salary) AS MinSalary from employees;
--sum
select sum(salary)from employees;
select max(salary) from employees where is_manager=1;
select * from employees where is_manager=1;


select * from employees;

select max(salary) from employees;

--nth / Max Salary;
WITH SALARYRANK AS (
SELECT SALARY,ROW_NUMBER() OVER(ORDER BY SALARY DESC) AS SALRANK FROM EMPLOYEES)
SELECT salary FROM SALARYRANK WHERE SALRANK=1;


--MAX(),MIN,SUM(),AVG()
SELECT MAX(SALARY) FROM EMPLOYEES;
SELECT MIN(SALARY) FROM EMPLOYEES;
SELECT SUM(SALARY) FROM EMPLOYEES;
SELECT AVG(salary) from EMPLOYEES;
SELECT COUNT(DISTINCT NAME)FROM EMPLOYEES;
SELECT COUNT(NAME)FROM EMPLOYEES;
SELECT COUNT(SALARY) FROM EMPLOYEES;
SELECT COUNT(*) FROM EMPLOYEES;


SELECT SUM(SALARY)/COUNT(*) AS COMPUTED_RESULT,AVG(SALARY) AS FUNCTION_RESULT FROM EMPLOYEES;

--Max salary by deportment
SELECT MAX(SALARY),department FROM EMPLOYEES GROUP BY department;
--Avg salart by deportment
SELECT avg(SALARY),department FROM EMPLOYEES GROUP BY department;








