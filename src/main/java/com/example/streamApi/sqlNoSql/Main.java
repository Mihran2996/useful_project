package com.example.streamApi.sqlNoSql;

public class Main {

    //SQL(RELATION) VS No SQL DATABASES(NON-RELATION)

    //SQL DATABASES
    //Stands for Structured Query Language
    //Data is stored in tables with columns and rows
    //Supports JOIN and complex queries
    //Follows ACID properties (Atomicity, Consistency, Isolation, Durability) for transaction management
    //Oracle, Microsoft SQL Server, PostgreSQL, MySQL, MariaDB

    //******************************************************************************************************************

    //https://www.tutorialgateway.org/acid-properties-in-sql-server/

    //WHAT IS ACID?
    //
    //ACID is a principle of Transaction
    //ATOMICITY
    //The all changes must be performed successfully or not at all.
    //All the statements (insert, update, delete) inside a transaction must be completed successfully or roll back.
    // --------------------------------------------------------
    //CONSISTENCY
    //It means that whatever happens in the middle of the transaction, this will never leave your database in a half-completed state.
    //If the transaction is completed successfully, then it will apply all the changes to the database.
    //If there is an error in a transaction, then all the changes that have already been made will be rolled back automatically.
    //It means the database will restore to its state before the transaction starts.
    //If there is a system failure in the middle of the transaction, all the changes already made will automatically roll back.
    // --------------------------------------------------------
    //ISOLATION
    //A transaction in process and not yet committed must remain isolated from any other transaction.
    //Every transaction is individual, and One transaction can’t access the result of other transactions until the transaction completes.
    //Or, you can’t perform the same operation using multiple transactions at the same time
    // --------------------------------------------------------
    //DURABILITY
    //Once the transaction is completed, then the changes it has made to the database will be permanent.
    //Even if there is a system failure or any abnormal changes, this property will safeguard the committed data.

    //******************************************************************************************************************

    //WHAT ARE ISOLATION LEVELS?
    //https://www.geeksforgeeks.org/transaction-isolation-levels-dbms/
    //https://levelup.gitconnected.com/understanding-isolation-levels-in-a-database-transaction-af78aea3f44
    //READ-UNCOMMITTED
    //Read Uncommitted is the lowest isolation level.
    //In this level one transaction may read not yet committed changes made by other transactions, thereby allowing dirty reads.
    //At this level, transactions are not isolated from each other.
    // --------------------------------------------------------
    //READ-COMMITTED
    //This isolation level guarantees that any data read is committed at the moment it is read.
    //Thus, it does not allow dirty read. The transaction holds a read or write lock on the current row,
    //And thus prevents other transactions from reading, updating, or deleting it.
    // --------------------------------------------------------
    //REPEATABLE-READ
    //

    //DIRTY-READ
    //A Dirty read is a situation when a transaction reads data that has not yet been committed.
    //For example, Let’s say transaction 1 updates a row and leaves it uncommitted, meanwhile, Transaction 2 reads the updated row.
    //If transaction 1 rolls back the change, transaction 2 will have read data that is considered never to have existed.
    // --------------------------------------------------------
    //

    //NO SQL DATABASES
    //Stands for Not Only SQL
    //Data is stored in collections or documents
    //Does not necessarily follow ACID properties
    //Does not support JOIN and complex queries
    //Uses denormalized data structure
    //It is a type of database that uses non-relational data structures,
    //such as documents, graph databases, and key-value stores to store and retrieve data.
    //MongoDB, Google Cloud Firestore, Cassandra, Redis, Apache HBase, Amazon DynamoDB


    //WAHT IS BASE
    //Base-@ nkaragrume tvyalneri bazayi het mshakum@ kapvac NoSql bazaneri het
    //Base-@ aveli qich erashxiqnere talis qan ACID-@,bayc na aveli lava ardzaganqum tvyalneri arag popoxutyunnerin@

    //GRAPH
    //Does Graph NoSQL datbases support ACID?
    //Graph databasen da ayne erb dataner@ haxordakcvumen irar het hanguycnerov
    //support anumen ACID-@
    //Graph database ner@ dranq NoSql databasanernen,iranq hamarvumen nonrelation databasaner
    //Graph databasener@ datan storen anum vorpes node, ev noderi mijev kap@ kochvume edges,
    //tvyal node uni uniwue key.ays databasener@ aragen ashxatum.


    //WHAT IS CAP
    //sa asume vor tvyalneri bazan karoxe erashxavorhel
    //C - Consistency
    //A - Availability
    //P - Partition Tolerance

    //CONSISTENCY- hamakarg@ hamarvume consistency ete bolor hanguycner@ tesnumen nuyn datan,
    //aysinqn ete mi texic input anenq,mek urish texic et datan karoxenq output anel nuyn input arac datan

    //Availability - hamakarga@ hasaneliutyun uni resourcein ete nuynisk ete sharqic dus ekac hanguyc ka

    //Partition -hamakarg@ zboy chi talis ete orinak mi hanguyc kap@ korcnume tekuz bolor hanguycneri  het


    //WHAT ARE TRIGGERS?
    //Trigger@ hatuk stored proceduraye;
    //Ayn gorcarkvume erb vor bazayum sksvume injvor gorcoxutyun
    //triggeri tipericen DML,ashxatume UPDATE,INSERT,DELETE hramanneri jamank
    //triggeri tiperic en DDl- ashxatum e CREATE,ALTER, DROP hramanneri jamanak
    //trigger@ uni BEFORE ev AFTER
    //karoxenq stexcel Triger,, asel BEFORE orinak INSERT hramanic araj,ara esinj ban@ u inq@ kashxati insertic araj
    //karoxenq stexcel Triger,, asel after orinak INSERT hramanic araj,ara esinj ban@ u inq@ kashxati insertic heto
    //orinak erb unenq USER,vorn uni anun azganun ev tarq,Insert aneluc tariq@ chenq talis,bayc triggeri mej karoxen inicializacnel tariq@
    //ev erb uzer@ stexcvi inq@ kunena tariq


    //WHAT is a SEQUENCE?
    //Sequence indefikatorin nman bane
    //karoxenq stexcel tablen ev id-i poxaren unena sequence
    //inq@ uni funkcianer,
    //(initial-value) -sequencin talisenq naxnakan arjec
    //(increment-value) -amen angam sequence kavelana sranov
    //(maximum-value) -te minjev injqan mecana,aysinqn karoxe sksvel 0-ic ev minjev mecana 100@
    //CYCLE kam NOCYCLE
    //CYCLE-erb sequenc@ hasni maximum arjeqin taza data avelanalun pes na ksksi eli initial-valueic
    //NOCYCLE- ete sequence maximum-valueic mec darav apa EXception kqci


    //WHAT IS A UNION?
    //UNION keyword@ miacnume irar erku SELECT query
    //orinak`

    //SELECT column_name(s) FROM table1
    //UNION
    //SELECT column_name(s) FROM table2;

}
