package com.example.streamApi.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    //Stream API
    //intermediate methods
    //filter
    //sort
    //distinct
    //map


    //Java Stream API
    //stexcelov mek angam stream ayn chenq karox bazmaki angam ogtagorcel
    //steram karoxenq sarqel mi qani chanaparhov
    //stream operation@ chi popoxum collection@
    //Stream.empty(); collection.stream(); Arrays.stream(array);Stream.<String>builder().add("a").build(); Stream.iterate(40, n -> n + 2).limit(20);
    //java 8-@ tuyle talis sytexcel streamner primitiv tiperic,qani vor Stream@ generic e,nranq stexcel en IntStream,DoubleStrem,LongStream interfacener@
    //ays kerp xusapelov autoBoxingic injnel drakane azdum performance-i vra
    //terminal operationic heto stream@ pakvume ev chenq karox kanchel eli intermediate operation,drahamar petqe terminalic heto kanchenq nor stream heto intermediate operation
    //cankali e vor stream@ lini  vopres veradardznox arjeq
    //intermediate oprtaionner@ LAZY en,minjev chkanchvi Terminal operation ayn chi execute lini,Terminalner@ EAGER en
    //Stream@ chi linum methodi @ndunvox argument, classi field,
    //steram@ vorpes methodi @ndunox argument chi kareli ogtagorcel,qani vopr ayn karoxe ev methodi mej ogtagorcvel ev minjev method@
    //hasnel@,kam dranic heto, es paragayum kunenanq IllegalStateException qani vor stream@ mek angame kareli ogtagorcel
    //Stream@ karoxe linel vorpes methodi veradardznox tip, qani vor amenangam menq nor stream kuxarkenq ev xndir chi lini ogtagorcman het

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 8, 2, 6, 9);
        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4);


        Stream<Integer> stream1 = getStream(integers);
        stream1.forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream2 = getStream(integers);
        stream2.forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream = integers2.stream();
        printStream(stream);

        //Stream@ chi linum vorpes classi field ev vorpes methodi @ndunox argument
        //steram@ vorpes methodi @ndunox argument chi kareli ogtagorcel,qani vopr ayn karoxe ev methodi mej ogtagorcvel ev minjev method@
        //hasnel@,kam dranic heto, es paragayum kunenanq IllegalStateException qani vor stream@ mek angame kareli ogtagorcel
//        stream.forEach(System.out::print);


//        integers.stream().filter(
//                element -> (element % 2 == 0)
//        ).forEach(System.out::print);
//        System.out.println();
//
//        //stream operation@ chi popoxum collection@
//        //hamozvelu hamar tpumenq u tesnum vor arjeqner@ pahpanvelen
//        for (Integer integer : integers) {
//            System.out.print(integer);
//        }
//        System.out.println();
//        //karoxenq sortavorel
//        integers.stream().sorted().forEach(System.out::print);
//        System.out.println();
//
//        //sortavoreluc heto tpumenq ev tesnumenq vor stream@ popoxutyun chi katarum collecti het
//        for (Integer integer : integers) {
//            System.out.print(integer);
//        }
    }

    public static void printStream(Stream<Integer> integersStream) {
        integersStream.forEach(System.out::print);
    }

    public static Stream<Integer> getStream(List<Integer> list) {
        return list.stream();
    }

    //what is ForkJoin
    //ForkJoin@ javayum ogtagorcvume aveli efetkit ashxatanqi hamar
    //gaxapar@ ena vor ete unenq mi hat task ashxatanqi jamanak ayd task@ forka linum aysinqn bajanvuma subtaskeri voric heto
    //joina linum sa aragacnuma ashxatanq@
    //ays platformi himq@ ForkJoinPool classne vor@ realizacnume ExecutorService@ ev jarangume abstractExecutorService@
    //forkJoinPool.invoke(some task..) method@ ev forka anum ev joina anum,kanchumen iran ev talis task@

    //How parallel streams work?
    //ira himqum @nkaca ForkJoin@;
    //injpes naev listIterator()-@,,vor@ vor ashxatumer next-i ev previous-i het;


    //Sequential Stream VS  Parallel Stream
    //sequaential stream@ ashxatume elementneri het hajordabar pahelov hajordakanutyun@
    //paralel stream masiv@ bajanume maseri

//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        Stream<Integer> stream = list.stream();
//        //cuyc kta vor main threadne ashxatum aysinq mi threadove ashxatum
//        stream.forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));
//
//        System.out.println();
//        Stream<Integer> parallelStream = list.parallelStream();
//
//        //cuyc kta ayn threadneri anunner@ voronq vor ashxatumen ira het
//        parallelStream.forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));
//
//
//    }
}
