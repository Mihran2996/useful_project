package com.example.sql.sqlIndex;

public class Main {

    //b-tree
    //noder@ karoxe linel m qanakutyamb  orinak 4;
    //amena verevi nod@ kochvuma root
    //amenanerqevi nod@ kochvuma leaf,leaf@ chpetqe unena erexa node
    //amen node petqe unena m-1 hat element aysinqn 1 nodi mej karoxe linel 4-1 qanakutyamb element oronak(10,30,40)
    //amen node petqe unena m/2 qanakutyam child node aysinqn 4 bajanc 2-i qanakutyamb erexa node
    //b-treen verabalansavorvume,tver@ dasavorume achman kargov
    //4-bolor leafer@ mi leveli vraen ,,bardrutyun@ petqa lini mi makardaki vra
    //5-element add anel@ texia unenamu bottom up,aysinqn nerqevic verev;
    //ays searching@ ashxatume o/log(n)


    //What are INDEXy?
    //binary search O/Log(n)

    //Index ner himnakanum avelacnum enq ayn column-i vra vorov vor aveli hajaxakienq search anum data-n
    //Index@ databasei searchingi ev mutq gorcelu proscesner@ optimizacnelu hamaren,dranq stexcvumen columneri vra
    //erb menk primaryKey-ov uzumenq access unenal tablein menq arajin@ dimumenq indexi tablein ,da binary searche o/log(n)
    //queryn dimumem indexin aynuhetev indexnel giti te table-i mej vor toxuma gtnvum mer datan,
    //index@ ir hertin ir het zugaher pahume tvyal toxi hascen,
    //ayd hascei mijocov inq@ gtnume tvyal datan te vor toxuma
    //indexner@ dasakargvum en sortavorvac

    //Composite key-երը
    //Composite Key@ erku kam aveli columneri kombinaciane
    //sa en depqna erb ka mi qani colum-i vra primary key
    //ete seleqt anenq sax infon unikalnost@ pahuma
    //ete select anenq arandzin unikalnost@ chi pahum
    //composite keyer@ ogtagorcumenq ayn depqum ete menq hachaxenq dimum table meji name,ev surname columnerin,sortavorume @st name- valuen pahelov surname@

    //clustered vs non-clustered indexes
    //table karoxe unenal mi clustered index
    //clustered indexner@ sahmnaumen table-um hertakanutyun@,da primary key-ne,
    //ete menq uxxaki id ov enq get anum inq@ arden primary key,vor@ apahovume mer table sortavorum@ ev gete eanum bynarny searchov
    //table karoxe unenal mi qani hat non-clustered index
    //non-clustered index@ iranq pahpanvumenq arandzin tablei mej isk tvyalner@ urish tableum,pahume tvyal columi valuen ev pointer blocki mej tvyal value-i iprimary-key-i hascen kam henc iran
    //non clustered index@ hamarakalvume uni pointer column vori mej pahvume kam tvyal datai hascen

    //Where are indexes stored? In disk or in memory?
    //pahpanvumen jostki diskum

    //ALL
    //queryn vor@ ogtagorcyme ALL keyword@ kweradardzni true kam false,ete tvyal
    //query-i subQuery-n kbavarari paymanin;


    //How does the ordering of column matter in indices?
    //hertakanutyun@ kap uni,
    //dranic karoxa vatanal performacen
    //ete orinak indexavorumenq konkret mi ban orinkk` indexavorumenq ete name = "poxos";
    //hajord indexavorum@ indexavorumenq ete tariq@ mece 10ic,
    //sranic hete ete select query anenq ev uzenanq stananq userin vori anun@ "poxos" ev tariqnel mece tasic ev ayd select@ anenq ogtagorcelov poxosi index@
    //apa na uxxaki kgtni bolor poxosnerin,orinak 100,voric heto kstugi tariq@ mece tasic ev result karoxe tal 50 hat user
    //ete menq nuyn select queryn katarenq ev ogtagorcenq tariqi index@,apa na kgtni liq@ tariq column vor@ mece 10 ic ev da karoxe linel orinak 200 hat
    //isk heto apa ed 200 hatic na dus kberi 50 hat user,,aysinq aveli shat gorcoxutyuna katarum


    //orinak
    //-- Index 1   indexenq stexcum erku co,umni vra,arajin@ LastEditorDisplayName-i,erkrord@ ViewCount-i;
    //CREATE NONCLUSTERED INDEX IX_LastEditorDisplayName_ViewCount
    //ON Posts (LastEditorDisplayName, ViewCount)
    //INCLUDE (Score)

    //-- Index 2   indexenq stexcum erku co,umni vra,arajin@ ViewCount-i,erkrord@ LastEditorDisplayName-i;
    //CREATE NONCLUSTERED INDEX IX_ViewCount_LastEditorDisplayName
    //ON Posts (ViewCount,LastEditorDisplayName)
    //INCLUDE (Score)

    //Unique Index
    //orinak Primary key@ da arden unique clustered indexe,
    //tuyl chi talis duplicate
    //unique index karoxenq unenal naev mi qni column-i hamar;

    //orinak

    // CREATE UNIQUE INDEX ix_uniq_ab
    //  ON table_name(column1, column2);
    //
    //INSERT INTO table_name(a,b) VALUES(1,1);
    //estex erro texi chi unena vorovhetev duplicate combination chka
    // INSERT INTO table_name(a,b) VALUES(1,2);

    //estex kunenanq error vorovhetev kompinacian duplicate e linum
    //INSERT INTO table_name(a,b) VALUES(1,2);


    //avelacnumenq index goyutyun unecox tablei vra
    //ALTER TABLE tbl_name ADD INDEX index_name (col_name);


    //Uniq index@ krkvox arjeqner chi pahum
    //ALTER TABLE tbl_name ADD UNIQUE INDEX index_name (col_name);


    //stexcumenq index
    //CREATE INDEX index_name ON table_name (column_A, column_B, ...);


    //jnjumenq index@
    //DROP INDEX  index_name  ON  tbl_name;


    // What are logical reads in index?

    //ays harcumov menq vercnumenq bolor orderner@,
    // hajord harcumov ayd orderneric menak nranq voronc clint!= e1244,voric heto stacac resultic vercnumenq nranq voronc itemne =9876
    //aysinq arjin zaprosov karoxenq stanal 100 hat order,heto @st clienti stananq ayd 100-ic 50 hat,aynuhetev ayd 50 hatic item-ov stananq 10 hat
//    select *
//    from
//            (
//                    select *
//                    from orders
//                    where client = 1234
//            )
//    where item = 9876;

    //isk ays harcman performanc@ aveli lave,vorovhetev menq miangamic stanumenq clinetov aysinq 100 hat
    //voric heto ayd 100 ic stanumenq 10 hat,ardyunqum nuyn resultne
//    select *
//    from orders
//    where client = 1234
//    and item = 9876;

    //What does explain keyword do?

    //explain keyword@ ogtagorcvume, select,insert,delete,update queryneri hamar,
    //inq@ injvor usefull texekutyuna tramadrum tvyal queryn irakanacnelu jamanak,
    //orinak`
    //te vor table-ne ogtagorcvum,
    //tvyal query-i hamar qani toxa ogtagorcvelu,
    //index ogtagorcveluya te che,
    //bolor toxernen ogtagorcvelu te che


    //What is inequality operators?
    // ays operatorne <>;
    //orinake
    //Select * from Student where Student.name <> 'poxos'; sa == e sran` Select * from Student where Student.name != 'poxos'
    //aysinqn vorpes result cuyc kta ayn studentnerin voronc anun@ vor poxos che;
}
