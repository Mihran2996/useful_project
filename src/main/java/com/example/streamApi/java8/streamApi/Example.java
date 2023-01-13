package com.example.streamApi.java8.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    //Stream stanalu exanakner.
    public static void main(String[] args) {

        //empty Stream

        Stream<String> stream = Stream.empty();


        //Stream via collection

        List<Integer> list = new ArrayList<>();
        Stream<Integer> streemFromCollection = list.stream();


        //Stream via array

        int[] arr = {1, 2, 3};
        IntStream stream1 = Arrays.stream(arr);

        //Stream via Stream.builder();

        Stream<Object> element = Stream.builder().add("element").build();

        //Stream via iterate methods
        //iterate i stream capacity 5,amen mek elementnel naxordin + 5 arjeqn uni
        Stream<Integer> iterate = Stream.iterate(1, n -> n + 5).limit(5);
        iterate.forEach(System.out::print);
        System.out.println();


        //Stream-i operationner@ linumen terminal ev intermediate,
        //Intermediate operationner@ Lazy-en,nranq execute chen linum minjev chi kanchvum terminal operation@
        //terminal operationic hetpo chenq karox kanchel intermediate operation
        //intermediate operationner@ injvor result chen veradardznum nranq uxxaki stream@ transferen anum mek urish streami
        //terminal operationner@ veradardznumen result
        //Terminal operationner@ eager en


        //Stream methods

        //Stream.map()    intermediate operations
        //map() operation@ streami amen element@ converte anum urish objecti

        Stream<String> streamMap = Stream.of("a", "b", "c");

        Stream<String> stream2 = streamMap.map(String::toUpperCase);
        stream2.forEach(System.out::println);


        //Stream.filter()  intermediate operations
        //filter()

        List<Integer> streamFilter = new ArrayList<>();
        streamFilter.add(1);
        streamFilter.add(2);
        streamFilter.add(5);
        streamFilter.add(6);
        streamFilter.add(7);

        streamFilter.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::print);
        System.out.println();


        //Stream.collect()  terminal operations
        //collect() operation@ tuyle talis stanal elementner@ streamic pahelov collectioni mej


        Stream<String> streamCollect = Stream.of("one", "two", "three");

        List<String> listCollectResult = streamCollect.filter(el ->
                        el.contains("o"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        listCollectResult.forEach(System.out::println);
        System.out.println();

        //Stream.match() all match operations are Terminal

        Stream<String> streamMatch = Stream.of("one", "two");

        //anyMatch()  veradardznume boolean arjeq ete

//        boolean any = streamMatch.anyMatch(s -> s.startsWith("o"));
//        System.out.println(any);


        //allMatch()
//        boolean all = streamMatch.allMatch(s -> s.contains("o"));
//        System.out.println(all);

//        boolean none = streamMatch.noneMatch(s -> s.contains("z"));
//        System.out.println(none);

        //noneMatch()


        //Stream.count()  terminal operation e
        //count() veradardznume long value

        String[] stringArr = {"one", "two", "three"};

        Stream<String> streamCount = Arrays.stream(stringArr);
        long count = streamCount.filter(s -> s.contains("o")).count();
        System.out.println(count);
        System.out.println();


        //Stream.reduce()
        //reduce() terminal operatione ,karoxe  veradardznel  Optioanl

        Stream<Integer> streamReduce = Stream.of(1, 2, 3);

        int sum = streamReduce.reduce(0, (e, e2) -> e + e2);

        int[] arrInt = {1, 5, 6};

        int sum2 = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum2 += arrInt[i];
        }

        //0-n aystex uxxaki sum@ stanaluc heto gumarve nran
        System.out.println(sum);

        //map vs flatMap.
        //erkusnel intermediate operationner en
        //map@ hasaneliutyun uni collectioni elementin
        //flatMap@ listi meji listine hasanelityun talis

        List<String> lists = new ArrayList<>();
        lists.add("a");

        List<List<String>> multipleLists = new ArrayList<>();

        multipleLists.add(lists);

        lists.stream().map(String::toUpperCase).forEach(System.out::println);

        multipleLists.stream().flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::print);
        System.out.println();


        //Stream ofNullAble() method@ xusabumenq NullPointerException ic


        //How to work parallel stream

        //parallel stream@ ogtagorcume fork/join platform@,vor@ nerkayacvele java 1.7-ic sksac
        //tuyle talis ashxatel datai het miangamic stexclov bazmaki threadner
        //ayspes menq karoxenq imanal qani hat hasaneli processorner unenq
        System.out.println(Runtime.getRuntime().availableProcessors());
        //sequental stream@ ashxatume single threadov isk parallel@ mi qani threadov

        List<String> singleStream = Arrays.asList("a", "b", "c", "d", "e", "f");
        long start = System.currentTimeMillis();
        singleStream.stream().forEach(System.out::print);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println();

        List<String> multipleStream = Arrays.asList("a", "b", "c", "d", "e", "f");
        long start2 = System.currentTimeMillis();
        multipleStream.parallelStream().forEachOrdered(System.out::print);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);


    }
}
