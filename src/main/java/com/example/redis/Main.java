package com.example.redis;

public class Main {

    public static void main(String[] args) {

        //CACHE STRATEGY


        //                     CACHE-ASIDE  or LAZY-LOADING

        //The Cache-aside approach is one of the most commonly used caching strategies.
        //Erb app@ dimume redisin, ete tvyal key-ov data ka uremn cache-hit ev datan return kani
        //ete chka data apa cache-miss, app@ kgna datan kvercni db-ic, kgri cahce-i mej, verjum return kani
        //IMPLEMENTATIONS
        //1-When a query reaches, the application checks if the requested data is in the cache.
        //2-If yes, the cache returns the data.
        //3-Otherwise, the application queries the data from the database, updates the cache and returns the data.
        //ADVANTAGES
        //1-The cache contains only data that the application requests for.
        //cache-@ parunakume miayn harcyum exac data
        //2-The logic is done on the application level. Hence, it’s easy to implement.
        //biznes logikan avartvum e app-level, ayn heshte implementacnel
        //DISADVANTAGES
        //1-Data might become stale if someone updates the database without writing to the cache.
        //datan karoxe hnanal redisum ete inj vor mek@ update ani db-n ev heto chgtri redisi mej.


        //                             WRITE-THROUGH / writes synchronously

        //The Write-through approach treats the cache as the primary data store.
        //erb grelu ev kardalu arajnayin motecum@ tvace redisin, heto db-in
        //IMPLEMENTATION
        //Both read and write requests hit the cache.
        //1-When a write request arrives, the application first updates the cache.
        //2-The cache then synchronously writes to the database
        //ADVANTAGES
        //1-The cache and database are almost always consistents, data in the chase is not stale
        //Redisi ev Db-i dataner@ misht hamahunchen, ev chache-i meji datan chi hnanum
        //DISADVANTAGES
        //1-High write latency, since we are writing to cache and database synchronously.
        //data grelu cacr performance,qani vor zkzbum grumenq redisi mej heto db-i
        //2-Inefficient use of cache. Data that are infrequently requested will also be written to the cache
        //cahce-i anardyunq ogtagorcum, ayn datan vor@ vor hazvadepe get linelu nuynpes grvume redisum


        //                                WRITE-BEHIND / writes asynchronously

        //The Write-behind strategy works almost similarly as the Write-through approach.
        //The only difference is Write-behind updates the database asynchronously.
        //nmane WRITE-THROUGH -in bacarutyamb ayn bani vor db-i mej grume asynchron,
        //zkzbic grume redis mej, heto gnum tvyalner qcume queue-i mej ,redisi mejic kardalnu db-i mej grel@ linume paralel
        //IMPLEMENTATION
        //Both read and write requests hit the cache.
        //1-When a write request comes in, the application updates the cache and returns the results to the clients immediately.
        //2-The cache then asynchronously updates the database.
        //ADVANTAGES
        //1-The cache and database are almost always consistents, data in the chase is not stale
        //Redisi ev Db-i dataner@ misht hamahunchen, ev chache-i meji datan chi hnanum
        //2-Lower write latency compared to Write-through strategy.
        //grelu cacr ushacum hamematac WRITE-THROUGH-i het
        //DISADVANTAGES
        //1-There could be data loss if the cache goes down before the sync to the database is done.
        //karoxe linel tvyalneri korust ete redisi veradardzni bolor tvyalner@ minj db-i mej grvac klini
        //2-It’s more complex to implement compared to Cache Aside and Write-Through.
        //aveli barde implementacnel hamematac Cache-Aside-i ev Write-Through-i het.


        //                              WRITE-AROUND / writes asynchronously

        //Instead of hitting the cache first, the application updates the database and then asynchronously writes to the cache.
        //Redisi mej datan grelu poxaren ayn zkzbum kgri db-i mej heto cachei,
        //IMPLEMENTATION
        //1-When a write request arrives, the application updates the record in the database.
        //2-The database asynchronously updates/ deletes the key in the cache
        //ADVANTAGES
        //1-Low read latency if the cache is updated after every database write.
        //cacr kardalu process, qani vor cachen tarmacvum e amen db-i mej greluc heto
        //DIADVANTAGES
        //1-Higher write latency since data is written to the database.
        //grelu aveli bardzr ushacum qani vor tvyalner@ skzbum grvumen db-i mej


        //                             READ-THROUGH / works synchronously

        //Erb app@ dimume redisin, ete key-ov ka data kverdardzni ete che redis@ kdimi db-in kstana datan ev het kta app-in
        //IMPLEMENTATION
        //1-When a query reaches, the application queries the data from the cache.
        //2-If the data is not in the cache, the cache queries the data from the database and updates itself.
        //3-The cache returns the data
        //ADVANTAGES
        //1-Read-through strategy moves the data access logic to the cache which simplifies the application code.
        //datan kardalu logikan texapoxvace redisi mej,heshtacvace app-i code-i hadvac@
        //2-Better read scalability. When a key expires in Cache-aside,
        //concurrent requests might query the same data from the database multiple times. In Read-through,
        //the cache ensures that only 1 query is sent to the database.
        //orinak erb CACHE-ASIDE - depqum key@ expire-e linum ev harcumner@ mi qani haten apa`
        //                                                      aydqan angam asynchronously request klini db-in,
        //READ-THROUGH-@ garanciaye talis vor single request klini db-in
        //DISADVANTAGES
        //2- that read logic is written in redis
        //vor data kardalu logikan grvace redisi mej


        //                                   REFRESH-AHEAD / works asynchronously

        //aysxatume nuyn READ-THROUG-i nman, bacarutyamb erb redis@ tvyale grum db-i mej parallel kardume nranic


        //REDIS
        //THIS is fast  working Non-relation db,based on key-value structure
        //First of all was represented in 2009, was developed by Italian "C" developer
        //Supports almost more popular language` JAVA,PYTHON,RUBY,C and it's Family,PHP and JAVASCRIPT

        //Tipes
        //Strings - for text, has maximum size` 512 mb   == hello world
        //Hashes - stores the data with key-pair, like` HashMap ==  { a:"hello", b:"world" }
        //List - stores ordered data like` List  [A>B>C>C]
        //Sets - stores unordered but uniqe data like' HashSet [A<B<C]

    }
}
