--Topic Inroduction

--	Inner Join
--		○ Inner Join includes only common data between two tables .
--	Full Outer Join
--		○ Full outer join includes all the matching values 
--		○ And unmatched values from both tables
--	Right Join  (will never miss the right table data)
--		○ Right join includes tall the matching values from both the tables and unmatched from right table 
--		○ If no match from left table, the  value will be null for left table.
--	Left Join (will never miss the left table data)
--		○ Left join includes all the matching values from both the tables and unmatched values from left table 
--		○ If no match from right table , the value will be null for right table
    
--Table t1:
--
	--id1
	--1
	--1
	--1
	--2
	--2
	--3
--Table t2:
	--
	--id2
	--1
	--1
	--1
	--2
	--2
	--4



create table table1(id1 number);
create table table2 (id2 number);

insert into table1 values (3);
insert into table1 values (4);

select *  from table1;
select * from table2;

--inner join

select * from table1 
inner join table2 on
table1.id1 = table2.id2;

select * from table1 
full outer join table12 on 
table1.id1 = table12.id2;

select * from table1
right join 
table2 on table1.id1 = table2.id2;

select * from table1 
left join 
table2 
on table1.id1 = table2.id2;
