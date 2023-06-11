package com.example.streamApi.sql.query;

public class Main {


    //MySQL Wildcard Characters
    //Wildcard characters are used with the LIKE operator.
    //The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.

    //******************************************************************************************************************

    //MySQL ALIASES
    //are used to give a table, or a column in a table, a temporary name.
    //Aliases are often used to make column names more readable.
    //An alias only exists for the duration of that query.
    //An alias is created with the AS keyword.

    //SELECT name AS alias_name FROM Persons;

    //SELECT CustomerID AS ID, CustomerName AS Customer FROM Customers;

    //******************************************************************************************************************

    //DROP
    //Command will delete the table
    //DROP table Persons;

    //******************************************************************************************************************

    //INSERT
    //Will insert value for appropriate columns;
    //insert into Persons(name,surname) values ('name','surname');

    //******************************************************************************************************************

    //SELECT
    //Will take the all records from table
    // select * from Persons;

    //*****************************************

    //Will take only data whose name is equal to poxos;
    //select * from Persons where name="poxos";

    //*****************************************

    //Will take only data whose id  is not equal to 1;
    //select * from Persons where id <> 1;

    //*****************************************

    //Will take only name and surname from table
    //select name,surname  from Persons;

    //******************************************************************************************************************

    //DISTINCT
    //Will take from Persons only name without duplicate
    //select DISTINCT name from Persons;

    //******************************************************************************************************************

    //BETWEEN
    //Will take only data whose id  is between 1 and 2;
    //select * from Persons WHERE id BETWEEN 1 and 2;

    //******************************************************************************************************************

    //WHERE
    //Will take only data whose id  is not equal to 1;
    //select * from Persons where id!=1;

    //*****************************************

    //Will take only data whose id  is equal or greater than 5;
    //select * from Persons where id >= 5;

    //******************************************************************************************************************

    //LIKE
    //Finds any values that start with "p"
    //select * from Persons WHERE name LIKE 'p%';

    //*****************************************

    //Finds any values that end with "p"
    //select * from Persons WHERE name LIKE '%p';

    //*****************************************

    //Finds any values that contain "p"
    //select * from Persons WHERE name LIKE '%p%';

    //Finds any values that have "o" in the second position
    //select * FROM Persons WHERE name LIKE '_o%';

    //Finds any values that start with "p" and are at least 2 characters in length
    //select * FROM Persons WHERE name LIKE 'p_%';

    //Finds any values that start with "p" and ends with "s"
    //select * from Persons WHERE name LIKE 'p%s';

    //NEGATIVE CASE
    //SELECT * from Persons where  name  not like 'p%';

    //******************************************************************************************************************

    //AND
    //Will take only data whose name  is poxos and surname is poxosyan
    //select * from Persons where name = 'poxos' and surname = 'poxosyan';

    //******************************************************************************************************************

    //OR
    //Will take only data whose name  is poxos or surname is aramyan
    //select * from Persons where name = 'poxos' or surname = 'aramyan';

    //******************************************************************************************************************

    //IN
    //Will take only data whose name  is poxos or aram
    //select * from Persons where name in ('poxos','aram');

    //*****************************************

    //Will take only data whose name is not poxos
    //select * from Persons WHERE name not in('poxos');


    //******************************************************************************************************************

    //NOT
    //Will take the data whose name is not poxos
    //select * from Persons WHERE NOT name='poxos';

    //******************************************************************************************************************

    //<>
    //Will take the data whose name is not poxos
    //select * from Persons WHERE name <> 'poxos';

    //******************************************************************************************************************

    //!=
    //Will take the data whose name is not poxos
    //select * from Persons WHERE name!= 'poxos';

    //******************************************************************************************************************

    //ORDER BY
    //Will take data ordering by name default ASC
    //select * FROM Persons order by name;

    //*****************************************

    //ASC
    //Will take data ordering by name  ASC
    //select * from Persons order by name ASC;

    //*****************************************

    //ASC,DESC
    //Will take data ordering by name default ASC,if the name column contains duplicate value resalt will be orderd by surname DESC
    //select * from Persons order by name ASC , surname DESC ;

    //******************************************************************************************************************

    //IS NULL
    //Will take only data whose age is null
    //SELECT name,surname from Persons WHERE age is null;

    //******************************************************************************************************************

    //NOT
    //Will take only data whose age is not 0
    //SELECT name,surname from Persons WHERE NOT age=0;

    //******************************************************************************************************************

    //IS NOT NULL
    //Will take only data whose age is not null
    //select name, surname from Persons WHERE age is not  NULL ;

    //******************************************************************************************************************

    //UPDATE
    //Will update name column whose age is null
    //update Persons set name = 'updated' where age is null;

    //*****************************************

    //Will update name and surname columns whose age is null
    //update Persons set name='updatedName',surname='updatedSurname' where age is null;

    //*****************************************

    //Will update the all records age setting 0 value
    //update Persons set age=0;

    //******************************************************************************************************************

    //DELETE
    //Will remove all data from table
    //DELETE FROM Persons;

    //*****************************************

    //Will delete by some conditions
    //DELETE name FROM Persons where id =1;

    //******************************************************************************************************************

    //LIMIT
    //will take 2 objects at the beginning of the table
    //SELECT * FROM Persons LIMIT 2;

    //*****************************************

    //will take 2 objects at the beginning of the table with some conditions
    //SELECT * FROM Persons WHERE name='poxos' LIMIT 1;

    //******************************************************************************************************************

    //MIN
    //The MIN() function returns the smallest value of the selected column
    //SELECT MIN(age)  FROM Persons;

    //*****************************************

    //The MIN() function returns the smallest value of the selected column with our custom written column
    //SELECT MIN(age) AS age_of_persons  FROM Persons;

    //*****************************************

    //The MIN() function returns the smallest value of the selected column with ouw custom written column it will find
    //minimum value from data  whose name is poxos
    //SELECT MIN(age) AS age_of_persons  FROM Persons WHERE name='poxos';

    //*****************************************

    //MAX
    //The MAX() function returns the largest value of the selected column.
    //SELECT MAX(age)  FROM Persons;

    //*****************************************

    //The MAX() function returns the smallest value of the selected column with ouw custom written column
    //SELECT MAX(age) AS age_of_persons FROM Persons

    //*****************************************

    //The MAX() function returns the largest value of the selected column with ouw custom written column it will find
    //minimum value from data  whose name is poxos
    //SELECT MAX(age) AS age_of_persons  FROM Persons WHERE name='poxos';

    //******************************************************************************************************************


    //                        A G G R E G A T E      F U N C T I O N S


    //COUNT(column_name)  or *
    //The COUNT(column_name) function returns the number of rows that matches a specified criterion.
    //SELECT COUNT(column_name) FROM Persons;

    //*****************************************

    //The COUNT(DISTINCT column_name) function returns the number of rows with appropriate condition without duplicate.
    //SELECT COUNT(column_name) FROM Persons WHERE name='poxos;

    //******************************************************************************************************************

    //AVG(column_name)
    //The following SQL statement finds the average price of all products:
    //SELECT AVG(age) FROM Persons;

    //*****************************************

    //The following SQL statement finds the average price of whose name is poxos:
    //SELECT AVG(age) FROM Persons WHERE name='poxos';

    //******************************************************************************************************************

    //SUM(column_name)
    //The following SQL statement finds the sum of the "Quantity" fields in the "OrderDetails" table:
    //SELECT SUM(AGE) FROM Persons WHERE name='poxos';

    //*****************************************

    //Will computing the sum by given condition
    //SELECT SUM(AGE) FROM Persons WHERE name='poxos';


    //                                      E     N     D

    //******************************************************************************************************************

    //INNER JOIN
    //The INNER JOIN keyword selects records that have matching values in both tables.
    //select * from Persons inner join Book;

    //*****************************************

    //The INNER JOIN keyword selects records that have matching values in both tables which are relevant to the condition
    //select * from Persons inner join Book on Persons.id = Book.id;

    //******************************************************************************************************************

    //LEFT JOIN
    //The LEFT JOIN keyword returns all records from the left table (table1),
    //and the matching records (if any) from the right table (table2).

    //select * from Persons left join Book on Persons.id=Book.id;

    //******************************************************************************************************************

    //RIGHT JOIN
    //The RIGHT JOIN keyword returns all records from the right table (table2),
    //and the matching records (if any) from the left table (table1).

    //select * from Persons right join Book on Persons.id=Book.id;

    //******************************************************************************************************************

    //CROSS JOIN
    //The CROSS JOIN keyword returns all records from both tables (table1 and table2).
    //It's equal to INNER JOIN without ON condition ` select * from Persons INNER join Book;

    //select * from Persons CROSS join Book;

    //******************************************************************************************************************

    //UNION
    //The UNION operator is used to combine the result-set of two or more SELECT statements.
    //Every SELECT statement within UNION must have the same number of columns
    //The columns must also have similar data types
    //The columns in every SELECT statement must also be in the same order

    //select * from Game union select * from Book;

    //******************************************************************************************************************

    //GROUP BY
    //The GROUP BY statement groups rows that have the same values into summary rows,
    //like "find the number of customers in each country".
    //The GROUP BY statement is often used with aggregate functions (COUNT(), MAX(), MIN(), SUM(), AVG())
    //to group the result-set by one or more columns.

    //select count(id), name from Persons group by name;

    //*****************************************

    //Group rows that have the same values into summary rows, and ordering by count(id)
    //select Count(id), name from Persons group by name ORDER by  Count(id) asc;

    //*****************************************

    //select name, sum(age) from Persons group by name;

    //******************************************************************************************************************

    //HAVING
    //We can use having with agregation funqtion
}
