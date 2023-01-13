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


//    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(1, 8, 2, 6, 9);
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
//    }

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

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> stream = list.stream();
        //cuyc kta vor main threadne ashxatum aysinq mi threadove ashxatum
        stream.forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));

        System.out.println();
        Stream<Integer> parallelStream = list.parallelStream();

        //cuyc kta ayn threadneri anunner@ voronq vor ashxatumen ira het
        parallelStream.forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));


    }
}
