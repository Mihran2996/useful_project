package com.example.streamApi.sqlNoSql;

public class Main {

    //SQL(Relation) vs No SQL databases(NoN-Relation)

    //Sql databases
    //Stands for Structured Query Language
    //Data is stored in tables with columns and rows
    //Supports JOIN and complex queries
    //Follows ACID properties (Atomicity, Consistency, Isolation, Durability) for transaction management
    //Oracle, Microsoft SQL Server, PostgreSQL, MySQL, MariaDB


    //No Sql databases
    //Stands for Not Only SQL
    //Data is stored in collections or documents
    //Does not necessarily follow ACID properties
    //Does not support JOIN and complex queries
    //Uses denormalized data structure
    //It is a type of database that uses non-relational data structures,
    //such as documents, graph databases, and key-value stores to store and retrieve data.
    //MongoDB, Google Cloud Firestore, Cassandra, Redis, Apache HBase, Amazon DynamoDB


    //What is BASE
    //Base-@ nkaragrume tvyalneri bazayi het mshakum@ kapvac NoSql bazaneri het
    //Base-@ aveli qich erashxiqnere talis qan ACID-@,bayc na aveli lava ardzaganqum tvyalneri arag popoxutyunnerin@

    //GRAPH
    //Does Graph NoSQL datbases support ACID?
    //Graph databasen da ayne erb dataner@ haxordakcvumen irar het hanguycnerov
    //support anumen ACID-@
    //Graph database ner@ dranq NoSql databasanernen,iranq hamarvumen nonrelation databasaner
    //Graph databasener@ datan storen anum vorpes node, ev noderi mijev kap@ kochvume edges,
    //tvyal node uni uniwue key.ays databasener@ aragen ashxatum.


    //What is CAP
    //sa asume vor tvyalneri bazan karoxe erashxavorhel
    //C - Consistency
    //A - Availability
    //P - Partition Tolerance

    //Consistency- hamakarg@ hamarvume consistency ete bolor hanguycner@ tesnumen nuyn datan,
    //aysinqn ete mi texic input anenq,mek urish texic et datan karoxenq output anel nuyn input arac datan

    //Availability - hamakarga@ hasaneliutyun uni resourcein ete nuynisk ete sharqic dus ekac hanguyc ka

    //Partition -hamakarg@ zboy chi talis ete orinak mi hanguyc kap@ korcnume tekuz bolor hanguycneri  het


    //What are triggers?
    //Trigger@ hatuk stored proceduraye;
    //Ayn gorcarkvume erb vor bazayum sksvume injvor gorcoxutyun
    //triggeri tipericen DML,ashxatume UPDATE,INSERT,DELETE hramanneri jamank
    //triggeri tiperic en DDl- ashxatum e CREATE,ALTER, DROP hramanneri jamanak
    //trigger@ uni BEFORE ev AFTER
    //karoxenq stexcel Triger,, asel BEFORE orinak INSERT hramanic araj,ara esinj ban@ u inq@ kashxati insertic araj
    //karoxenq stexcel Triger,, asel after orinak INSERT hramanic araj,ara esinj ban@ u inq@ kashxati insertic heto
    //orinak erb unenq USER,vorn uni anun azganun ev tarq,Insert aneluc tariq@ chenq talis,bayc triggeri mej karoxen inicializacnel tariq@
    //ev erb uzer@ stexcvi inq@ kunena tariq


    //What's a sequence?
    //Sequence indefikatorin nman bane
    //karoxenq stexcel tablen ev id-i poxaren unena sequence
    //inq@ uni funkcianer,
    //(initial-value) -sequencin talisenq naxnakan arjec
    //(increment-value) -amen angam sequence kavelana sranov
    //(maximum-value) -te minjev injqan mecana,aysinqn karoxe sksvel 0-ic ev minjev mecana 100@
    //CYCLE kam NOCYCLE
    //CYCLE-erb sequenc@ hasni maximum arjeqin taza data avelanalun pes na ksksi eli initial-valueic
    //NOCYCLE- ete sequence maximum-valueic mec darav apa EXception kqci


    //What is a Union?
    //UNION keyword@ miacnume irar erku SELECT query
    //orinak`

    //SELECT column_name(s) FROM table1
    //UNION
    //SELECT column_name(s) FROM table2;

}
