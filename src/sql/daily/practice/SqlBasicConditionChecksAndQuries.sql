--Questions for this assignment

--Write a query that retrieves suppliers that work in either Georgia or California.
--Write a query that retrieves suppliers with the characters "wo" and the character "I" or "i" in their name.
--Write a query that retrieves suppliers on which a minimum of 37,000 and a maximum of 80,000 was spent.
--Write a query that returns the supplier names and the state in which they operate meeting the following conditions:
--	belong in the state Georgia or Alaska
--	the supplier id is 100 or greater than 600
--	the amount spent is less than 100,000 or the amount spent is 220,000


create table suppliers(
        supplier_id int primary key,
        supplier_name varchar2(250),
        city varchar2(250),
        state varchar2(250),
        total_spent  int
);

commit;

alter table suppliers modify supplier_id int;

SELECT * from suppliers;

drop table suppliers;

delete from suppliers WHERE supplier_id=10;
update suppliers sup set sup.state= 'Alaska' WHERE sup.supplier_id=600;
rollback;

insert into suppliers values(100,'shop of Ephiphany','Augusta','Georgia',220500.00);
insert into suppliers values(200,'Instant Assemblers','Valdez','Alaska',37000.00);
insert into suppliers values(300,'Time Manufacturers','RedWood City','CAlifornia',90500.00);
insert into suppliers values(400,'Round House Inc.','Newyork City','NewYork',78150.00);
insert into suppliers values(500,'Smiths And Berries','Portland','Oregon',114600.00);
insert into suppliers values(600,'Wesson LLC','Yuma','Alaska',32000.00);
insert into suppliers values(700,'ICF Foods','Orlando','California',78700.00);
insert into suppliers values(800,'Cheffmens Inc. ','Toledo','Georgia',187500.00);
insert into suppliers values(900,'Samwoods Drinks','Portland','Georgia',17800.00);

rollback;

SELECT * from suppliers sup WHERE sup.state in ('Georgia','California');

SELECT * from suppliers  sup WHERE sup.supplier_name  like '%I%' and (sup.supplier_name like '%ss%' or sup.supplier_name like '%rs%');

SELECT * from suppliers sup WHERE sup.total_spent >36000 and sup.total_spent <=80000;

SELECT sup.supplier_name from suppliers sup WHERE (sup.state ='Georgia' or sup.state= 'Alaska') and (sup.supplier_id =100 or sup.supplier_id>600)and
(sup.total_spent < 100000 or sup.total_spent=220000);

