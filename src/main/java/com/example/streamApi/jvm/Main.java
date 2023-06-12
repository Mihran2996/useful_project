package com.example.streamApi.jvm;

public class Main {

    //WHAT IS JNDI
    //JAVA NATIVE INTERFACE
    //At times, it is necessary to use native (non-Java) code (for example, C/C++).
    //This can be in cases where we need to interact with hardware,
    //or to overcome the memory management and performance constraints in Java.
    //Java supports the execution of native code via the Java Native Interface (JNI).

    //JNI acts as a bridge for permitting the supporting packages for other programming languages such as C, C++, and so on.
    //This is especially helpful in cases where you need to write code that is not entirely supported by Java,
    //like some platform specific features that can only be written in C.
    //You can use the native keyword to indicate that the method implementation will be provided by a native library.
    //You will also need to invoke System.loadLibrary() to load the shared native library into memory,
    //and make its functions available to Java.*************************************************************************

    //JNI-@ stexcume kamurj java kodi ev native kodi mijev tuyl talov native codin realizacnel java kod@
    //ete uneneq native keyword@ apa JNI-i mijocov karoxenq Ayd methodi realizacin grel i=urish lezvov C or C++
    //nuynpes metqe kanchel System.loadLibrary() method@ vorpeszi native linrary-n load lini memory ev mez hasaneli lini.

    //******************************************************************************************************************

    //GARBAGE COLLECTOR

    //The Garbage Collector (GC) collects and removes unreferenced objects from the heap area.
    //It is the process of reclaiming the runtime unused memory automatically by destroying them.

    //Garbage collection makes Java memory efficient because it removes the unreferenced objects from heap memory
    //and makes free space for new objects. It involves two phases:

    //1) MARK - in this step, the GC identifies the unused objects in memory
    //2) SWEEP - in this step, the GC removes the objects identified during the previous phase

    //Garbage Collections is done automatically by the JVM at regular intervals and does not need to be handled separately.
    //It can also be triggered by calling System.gc(), but the execution is not guaranteed.

    //The JVM contains 3 different types of GARBAGE COLLECTORS:

    //1)SERIAL GC-This is the simplest implementation of GC, and is designed for small applications running on single-threaded environments.
    //It uses a single thread for garbage collection.this GC implementation freezes (STOP THE WORLD) all application threads when it runs.
    //The JVM argument to use Serial Garbage Collector is -XX:+UseSerialGC

    //2)PARALLEL GC - This is the default implementation of GC in the JVM, and is also known as Throughput Collector.
    //It uses multiple threads for garbage collection, but still pauses(STOP THE WORLD) the application when running.
    //The JVM argument to use Parallel Garbage Collector is -XX:+UseParallelGC.

    //GARBAGE FIRST (G1) GC - This was introduced in java 8
    //G1GC was designed for multi-threaded applications that have a large heap size available (more than 4GB).
    //It partitions the heap into a set of equal size regions, and uses multiple threads to scan them.
    //G1GC identifies the regions with the most garbage and performs garbage collection on that region first.
    //The JVM argument to use G1 Garbage Collector is -XX:+UseG1GC

    //Note: There is another type of garbage collector called Concurrent Mark Sweep (CMS) GC.
    //However, it has been deprecated since Java 9 and completely removed in Java 14 in favour of G1GC.

    //******************************************************************************************************************

    //Does parallel garbage collector use multiple threads?
    //Yes - The Parallel Garbage Collector (GC), so named because it can utilize multiple threads for handling GC tasks

    //******************************************************************************************************************

    //Which garbage collector is the simplest as it works with a single thread?
    //A serial collector is best suited for single-processor machines because multiprocessor machines can benefit from multiple threads.
    //It is also possible to use the serial collector on multiprocessor machines for applications with small data sets.
    //This collector may be the best choice for applications that can tolerate pauses and that create very small heaps.

    //******************************************************************************************************************

    //Concurrent mark sweep drawbacks? Why and when it was deprecated?
    //It was deprecated in java 9
    //And was deleted in java 14.

    //******************************************************************************************************************

    //Which garbage collector G1 has replaced?
    //In java-11 was introduced the new type of GARBAGE COLLECTOR called ` Z GARBAGE COLLECTOR
    // The Z Garbage Collector, also known as ZGC,
    //is a low latency scalable garbage collector designed to meet the following objectives.
    //
    //Pause times shall not exceed 10 ms
    //Handle heaps ranging from an 8MB to 16TB in size
    //Pause times do not increase with the size of the heap or live-set

    //ZGC performs all costly work concurrently, without stopping application thread execution for more than 10ms
    //which makes it ideal for applications needing low latency and/or using a very large heap (multi-terabytes).

    //******************************************************************************************************************




}
