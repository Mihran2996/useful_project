package com.example.streamApi.MultiTherading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2Demo {

    //ThreadPoolExecutor implementacnume ExecutorServic-in
    //Thread pool@ ogtagorcum-e anum naxqinum stexcvac patokner@ current tasker@ katarelu hamar
    //1-in hertin stexcvuma task@
    //2-rd hertin stexcvume TheradPool@
    //3-rd hertin tasker@ talisenq Executor Poolin
    //threadPoll@ stexcelu hamar kanchumenq Executors i newFixedThreadPool@ talisenq chap,te qani thread karoxe parunakel pool@
    //Executors-i newFixedThreadPool@ mez veradardznume ThreadPoolExecutor,vornnel uni execute method@ qani vor ExecutorServicne realizacnum
    //newFixedThreadPool(3) stexcume pooli chap@ aysinqN 3 hat threade karox pahvel pooli mej
    //shat threadner sarqel ev chogtagorcel@ kazdi performance-i vra
    //dra hamar ka newCachedThreadPool() method@ vor@ naxnakan sarqume pool@ 0
    //newCachedThreadPool() ays method@ naxnakan ksarqi pool@ 0;sa aveli lavacnume performanc@ stexcume threadner @ast anhrajeshtutyan,ev naxkinum stexcac threadner@ voronq vor hasnaelien ogtagorcvumen
    //newCachedThreadPool()-i depqum ayn threadner@ voronq vor chen ogtagorcvum 60 varkayic aveli jnjvac klinen
    //heto sarqume pooli mej patok erb vor pool.execute(Runnable runnable) method@ kanchvume
    //newSingleThreadPool();//ays method@ stexcume mek patok pooli hamar


    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args) {
        // creates five tasks
        Runnable r1 = new Task2("task 1");
        Runnable r2 = new Task2("task 2");
        Runnable r3 = new Task2("task 3");
        Runnable r4 = new Task2("task 4");
        Runnable r5 = new Task2("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // pool shutdown ( Step 4)
        //ays methodic heto pool@ el tasker chi iragorci
        pool.shutdown();
        //wii will get an Exception
//        pool.execute(r5);


    }
}
