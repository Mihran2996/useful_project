package com.example.streamApi.sql.ddl;

public class Main {

    //Types of SQL Commands

    //there are five types of SQL commands   DDL, DML, DCL, TCL, and DQL

    //DDL - Data Definition Language``    CREATE, DROP,ALTER,TRUNCATE
    //All the command of DDL are auto-committed that means it permanently save all the changes in the database.

    //DML - Data Manipulation Language  ``   INSERT, UPDATE, DELETE
    //DML commands are used to modify the database. It is responsible for all form of changes in the database
    //The command of DML is not auto-committed that means it can't permanently save all the changes in the database. They can be rollback.

    //DCL - Data Control Language ``  ??

    //TCL - Transaction Control language `` work only with` DML-Data Manipulation Language ` INSERT, UPDATE, DELETE

    //DQL - Data Query  language ``  SELECT
    //DQL is used to fetch the data from the database.


    //DROP Vs TRUNCATE
    //delete command is in the DML commands (insert,update,delete)
    //Delete command is used Where condition,if condition true it will delete only single rows
    //Otherwise if it is used without Where it will delete all rows in the database
    //Delete writes logs for each dremoved row in the transaction log.

    //Truncate comman is in the DDL (Data Definition language)
    //Truncate is used without transaction , because of it we can't ROLLBACK  the data
    //Truncate works so fast because it doesn't lose any time to log its records in the transaction log
    //With Truncate not used Where condition, and it removes all rows of a table.


    //WHERE vs HAVING
    //Where condition is used with` Select,Delete,Update,Insert for filter data from the table.
    //It describes a specific condition retrieving records from single or multiple tables using the  JOIN.
    //With Where we can implement as well as logical connectives AND , OR ... They are return Boolean value
    //GROUP BY comes after Where

    //We use Having only with Select
    //GROUP BY comes before Where


}
