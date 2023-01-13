package com.example.streamApi.MultiTherading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {

//        Describe thread lifecycle

        //NEW statum erbvor  new enq anum
        //RUNABLE state erb kanchuenq start() method@
        //RUNNING state erb kanchumenq run() method@
        //WAITING state erb kanchumenq,wait,sleep() methodner@
        //TIMEWAITING state erb kanchumenq wait@ ev sleep@ jamanakov;
        //BLOKED state erb synchronized e,spasuem monitorin
        //TERMINATED erb thread@ avartele ashxatanq@


        //NEW stateic karoxe gnal RUNNABLE vichak erb kanchumenq start() method@
        //NEW stateic karoxe gnale TERMINATED vichak erb Exception e qcum

        //RUNNABLE stateic karoxe gnal RUNNING vichak erb kanchumenq run() method@

        //RUNNING stateic karoxe gnale WAITING vichak erb kanchumenq wait,sleep() methodner@
        //RUNNING stateic karoxe gnal TERMINATED vichak erb avartele ir ashxatanq@
        //RUNNING stateic karoxe gnal RUNNABLE vichak erb kanchvele yield() method@

        //WAITING stateic karoxe gnal RUNNABLE vijak erb kanchvele notify,notifyAll() methodner@
        //TIMEWAITING stateic karoxe gnal RUNNABLE vijak erb kanchvele notify,notifyAll() methodner@
        //BLOKED static karoxe gnal RUNNABLE vichak


        //What are the methods of Thread class? Describe them in detail

        //getState() veradardznume tvyal threadei staten
        //isAlive() veradardznume true kam false ete thread@ RUNNABLE statem egtnvum,
        //setName() talisenq anunn
        //getName() vercnumenq threadei anun@
        //join() spasume minjev thread@ avarti ashxatanq@
        //run() sa ayn ketne erb mtnuma patoki mej
        //start() sa ira nersic kanchume run() method@
        //sleep() qnacnumenq threadein
        //currentThread() verdardznume current threade-i ssilken
        //getId() veradardznume threade-i identifikator@
        //interrupts() kanganacnume thread@
        //setPriority()  talisenq threade-in prioritet
        //getPriority() stanumenq threade-i prioritet@


//        What is the difference between thread and runnable?
        //Runnaable funqtonal intrerface e
        //Thread@ class implementacnume Runnable interfacen
        //Runnable interfacen karelie implement anel ete mez menak petqe run method@
        //menq ete extend anenq Thread class@ apa el chenq karoxana extend anel urish classenr,
        //ayd paragayum aveli lava menq implement anenq Runnuable interfacenq vor karoxananq extend anenq mez harkavor class@
        //Runnable-@ karoxe irakanacvel urish threadov,,stexcelov Thread@ ev constructori mej poxancel Runnable@
        //Runnable-i ekzemplyar@ karoxe execute linel ExecuterService-ov Ev Threadov

        RunnableImpl runnable = new RunnableImpl();
        runnable.run();

        Task task = new Task();
        task.start();

        new Thread(new RunnableImpl()).start();
        new Thread(() -> new RunnableImpl().run()).start();


//        Callable vs Runnable
        //Runable-i ekxemplyar@ karoxe execute linel ev Threadov ev ExecutorService-ov
        //Callable-n karoxe menak execute linel ExecutorServiceov;
        //Callebl@ nynpes funqtional interface e,
        //Callebl@ uni mek call() method@ vor@ veradardznume Object,isk Rubnnable uni void run()method@
        //Callable-i call() method@ throws e anum exception
        CallableImpl callable = new CallableImpl();
        //new Thread(callable).start(); kunenanq ClassCastException vorovhetev Callablen run chi linum Threadov

        //What is Executor
        //Executor uni mek execute method@
        //execute method@ vor@ @ndunume Runnable-i ekzemplyar ahsxatacnume Runnable-i run method@


        //What is Executors
        //Executors mez ognume sarqel thread pool
        //uni newFixedThreadPool(int size).ays methodov sarqume size chapov pool
        //newSingleThreadPool()-sarqume mek pool
        //newCachedThreadPool()-naxnakan ksaqri 0
        //Executors@ veradardznume ThreadPoolExecutor,vornel implementacnume ExecutorServicen interfacen
        //Executor interfacen uni mek Execute() method@,vor@ rune anum Runnablei run() method@

        //What is a thread pool?
        //Thread pool@ ogtagorcum-e anum naxqinum stexcvac patokner@ current tasker@ katarelu hamar
        //1-in hertin stexcvuma task@
        //2-rd hertin stexcvume TheradPoll@
        //3-rd hertin tasker@ talisenq Executor Poolin
        //threadPoll@ stexcelu hamar kanchumenq Executors i newFixedThreadPool@ talisenq chap,te qani thread karoxe parunakel pool@
        //Executors-i newFixedThreadPool@ mez veradardznume ThreadPoolExecutor,vornnel uni execute method@ qani vor ExecutorServicne realizacnum
        //newFixedThreadPool(3) stexcume pooli chap@ aysinqN 3 hat threade karox pahvel pooli mej
        //shat threadner sarqel ev chogtagorcel@ kazdi performance-i vra
        //dra hamar ka newCachedThreadPool() method@ vor@ naxnakan sarqume pool@ 0
        //newCachedThreadPool() ays method@ naxnakan ksarqi pool@ 0;
        //heto sarqume pooli mej patok erb vor pool.execute(Runnable runnable) method@ kanchvume
        //newSingleThreadPool();//ays method@ stexcume mek patok pooli hamar







        //What is ExecutorService
        //ExecutorService supporta anum pool@ threadneri hamar ev assighn e anum nranc hamar tasker
        //tasker@ inq@ pahuma hertakanutyamb, Queue-i mej ete taskeri qanak@ gerazancuma threadneri qanakin
        //ThreadPoolExecutor implementacnume ExecutorServic-in
        //ExecuteService.execute(Runable runable)  katarume task@ Runablei hamar
        //ExecuteService.submit (Runable runable)  katarume task@ Runablei hamar
        //ExecuteService.submit (Callable callable)  katarume task@ Callable hamar
        // irakanum submit(Callable callable)-takic kanchume Executor-i execute method@
        //erb kanchumenq submit@ ExecutorAdapterService-i submit methodne kanchvum vor@ vercnume Callablen dardznum Runnable ev kanchum Executori execut@(Runnable)
        //ExecuteService.invokeAny (Collection<? Callable callable>)  katarume task@ Callable-neri listi hamar
        //ExecuteService.invokeAll (Collection<? Callable callable>)  katarume task@ Callable-neri listi hamar

        //execute(Runnable)-sa @ndunume Runnable ev kanchume nra run method@
        //submit(Runnable)-sa nynpes @ndunume Runable bayc verdardznume Future object
        // karoxenq future-ic kanchel get method@ kveradardzni 0 ete ashxatanq@ normal avartvele
        //submit(Callable)-veredardznume future object,irakanum klanchvume Executori execute() method@,
        //invokeAny(Collection<? Callable>)-sa @ndunume Callable-i list, chi veradardznum Future object aylmethod@ verdardznume
        // avratvac taski result@,evgaranciya chka te vor mekin@
        //ete veradardzrec result@ mnacac tasker@ kdadadaren ashxatel,ete ashxatanqi jamanak exception qcec eli kdadadaren ashxatel

        //what is ThreadLocal
        //ThreadLocal@ nerkayacnume iranic threadi local popoxakan;
        //sa mez tuyle talis stexcel popoxakanner voronq karoxen get() kam set() linen nuyn threadi mej;
        //ete 2 thread unen dostup nuyn kodi vra vornel uni ThreadLocali hasce,apa erlku threadnernel chen karox tesnel local popoxakan@ mek@ myusi hamar


        //What is a Future?
        //Future interface e gtnvume java.utul.concurrent package -i mej
        //Ayn ogtagorcvum e asixron hashvarki result@ nerkayacnelu hamar qani vor Callablen sinchronized che menq karoxenq hetevel tvyal taski ashxatanqi processin
        //ogtakar methodnere tramadrum
        //amenalav orinkanerice ExecutorService@ vor@ uni mi qani method voronq stexcumen Future object
        //ev hetevumen Ansixron taskeri ashxatanqin
        //cancel()-ays method@ pordzume kangnecnel katarvox task@
        //get()-anhrajeshtutyan depqum spasume minjev task@ complete lini ev kveradardzni result@
        //inCanceled()-true kverdaradzni ete task@ kangnecvace exe
        //isDone()-true kverdardznu=i ete task@ complete exel


        //What is a daemon thread?
        //ays threadner@ aveli qich prioritet unecox threadnernen,
        //injpoisine orinak garbarje collection-ov zbaxvox thread@
        //karch asac iranq carayutyunner e matucum user threadnerin
        //nra kyanq@ kaxvace userThreadi kyanqic ete userThread@ mahanume JVM@ avtomat avartume DaemonThreadner@
        //setDaemon(Boolean)-ays method@ ete tanq true apa thread@ ksarqi Daemon;
        //isDaemon()-veradardznume true ete Daemon threade
        //ete thread.start() method@ kanchvele ev dranic heto usumenq setDaemon(true) method@ kanchel apa kunenanq IllegalThreadStateException

        //What is a data race?
        //erbvor mi thread mi resource-@ karduma isk myus thread@ ayd pahin popoxutyuna  anum.


        //What does volatile keyword do?
        //volatile-@ chi qeshavorvum ev ira masin infromacian kardacvuma memory-ic
        //sa keyword@ u ete popoxakanov unenq haytaravac volatilen apa mi threadi koxmic arvac popoxutyun@ hasaneli klini myus threadi hamar
        //ete unenq erku thread voronq ahsxatumen tarber processorneri vra,ev erkusnel ashxatumen nuyn popoxakani het
        //apa erkusnel iranc mot unen ayd popoxakani kopyan,ev ira veraberyal popoxutyun@ hasaneli che myus threadi hamar
        //isk volatile popoxakani depqum erku threadnel kkardan @ndhanur memory-ic


        //synchronized vs Volatile
        //volatile-i depqum threadner@ himnakan memory-ic en kardum arjeq@
        //synchronized-i depqum amen thread erb mtnume synchronized block nax tarmacnumen irenc arjeq@ himnakan memory-ic
        //blockic elneliuc arajel verdardznum enc irenc arjeq@ himnakan memory

        //Mutual Exclusion (Mutex)
        //sa nshanakume vor menak mek thread kam procces karoxe miajamanak katarel kodi hatvac@ verabervume synchronized-in

        //Visibility
        //mi Threadi koxmic katarvac popoxutyun@ hasaneli kdarna urish Threadi hamar- verabervume voolatile-in

        //ete mi qani thread pordzen gorcooxutyun katarael synchronised resource-i het apa khaytnven Waiting state-um


        // What are some ways to implement mutex(Mutual Section) in Java?
        //arajin@ vor karoxenq resource-n haytararel synchronized
        //erkrord@ vor karoxenq resource pahel synchronized blocki mej
        //karoxenq patrastel  new ReentrantLock() object vor@ realizacnume Lock interfacen object override anel getNextSequence()-@;
        //karoxenq patrastel  new Semaphore() object override anel getNextSequence()-@;
        //karoxenq patrastel  new Monitor() object override anel getNextSequence()-@;


        //What is an atomic variable?
        //sa concurrent package-i meja
        //apahova sinxron ashxatanq@ popoxakani het
        //ete erku thread gorcen anum nuyn resource-i het,apa naxqan popoxel@ nax kardumen ,heto popoxum,heto save anum
        //aypisov myus threadnele nuyn gorcoxutyun@ anum ev resouce-i arjeq@ chishta stexcvum


        //What is an intrinsic lock?
        //ays interfacei realizacianeric mek@ ReentrantLock classne vor@ apahovume sinxron ashxatan


        //ReentrantLock, the differene with synchronized blocks

        //Thread@ block anelu hamar ReentrantLock@ ogtagorcume lock() method@
        //blockic hanelu hamar ReentrantLock() ogtagorcume unLock() method@
        //ReentrantLock() i jamanak thread@ blockixc duse galic cankacac kargov
        //synchronized haytararelov blockenq anum thread@;
        //synchronized-ic blockic helnel@ katarvume anuxxakioren
        //synchronized-i jamanak thread@ blockic duse galis ayn hertakanutyamb injov vor block state-um e haytnvel

        //What is a deadlock?
        //sa ayn depqne erb erku kam aveli threadner blocken exel bayc anverj spasumen mimyanc notify()-i hamar
        //deadlockic xusapelu hamar karoxenq ogtagorcel tryLock() method@;

        //What is lifeLock
        //sa ayn depqne erb erku kam aveli thread mimyanc anverj spaselu poxaren uzumen vijak poxancen

        //What is starvation
        //sa ayn depqne erb vor thread@ uzume hasaneliutyun unena resourcei ev chi karoxanum qani vor mi thread
        //hachaxe ogtagorcum ayd resourcen ev arajin threadnel shut shute @nknum waiting vijaki mej


    }


}
