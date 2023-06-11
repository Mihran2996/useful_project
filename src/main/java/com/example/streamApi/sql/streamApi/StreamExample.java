package com.example.streamApi.sql.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //There are many ways to create a stream instance of different sources.
        //Once created, the instance will not modify its source.
        //therefore allowing the creation of multiple instances from a single source.

        //**************************************************************************************************************

        //EMPTY STREAM
        //We should use the empty() method in case of the creation of an empty stream:

        Stream<Object> empty = Stream.empty();

        //We often use the empty() method upon creation to avoid returning null for streams with no element:

        Stream<String> stream = streamOf(List.of());

        //We can check how many element contains stream using count() operation
//        System.out.println(stream.count());

        //**************************************************************************************************************

        //STREAM OF COLLECTION
        //We can also create a stream of any type of Collection (Collection, List, Set)

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        //**************************************************************************************************************

        //STREAM OF ARRAY
        //An array can also be the source of a stream:

        Stream<String> stream1 = Stream.of("a", "b", "c");

        //We can also create a stream out of an existing array or of part of an array:

        String[] array = new String[]{"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(array);
        Stream<String> stream3 = Arrays.stream(array, 0, 3);

        //**************************************************************************************************************

        //STREAM.builder()
        //When builder is used, the desired type should be additionally specified in the right part of the statement,
        //otherwise the build() method will create an instance of the Stream<Object>:

        Stream<String> build = Stream.<String>builder().add("one").add("two").add("three").build();

//        build.forEach(System.out::println);

        //**************************************************************************************************************

        //STREAM.generate()
        //The generate() method accepts a Supplier<T> for element generation. As the resulting stream is infinite,
        //the developer should specify the desired size, or the generate() method will work until it reaches the memory limit:

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(5);

//        streamGenerated.forEach(System.out::println);

        //**************************************************************************************************************

        //STREAM.iterate()
        //Another way of creating an infinite stream is by using the iterate() method:

        Stream<Integer> limit = Stream.iterate(10, x -> x + 2).limit(10);

//        limit.forEach(System.out::println);

        //**************************************************************************************************************

        //STREAM OF STRING
        //We can also use String as a source for creating a stream with the help of the chars() method of the String class.
        //Since there is no interface for CharStream in JDK, we use the IntStream to represent a stream of chars instead.

        IntStream chars = "abc".chars();
//        chars.forEach(System.out::println);

        //**************************************************************************************************************


        //                 I N T E R M E D I A T E    O P E R A T I O N S    E X A M P L E

        //Java 8 Stream intermediate operations return another Stream which allows you to call multiple operations in the form of a query


        //LIST OF INTERMEDIATE OPERATIONS
        //filter()
        //map()
        //flatMap()
        //distinct()
        //sorted()
        //peek()
        //limit()
        //skip(

        //***************************************************

        //filter()
        //This method returns a stream consisting of the elements of this stream that match the given predicate

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        IntStream subStream = intStream.filter(value -> value > 3);
        long count = subStream.count();
//        System.out.println(count);

        //***************************************************

        //map()
        //Returns a stream consisting of the results of applying the given function to the elements of this stream.

        Stream<String> streamStr = Stream.of("java", "php", "js");

        List<String> listOfResult = streamStr.map(value -> {
            if (value.equals("java")) return "JAVA IS POWER";
            return value;
        }).collect(Collectors.toList());

//        listOfResult.forEach(System.out::println);

        //***************************************************

        //flatMap()
        //This flatmap works best for a list of collections.
        //We will show the example with two lists and how to convert them into a single stream using

        List<String> list = Arrays.asList("One", "Two", "Three");
        List<String> list2 = Arrays.asList("One2", "Two2", "Three2");
        List<List<String>> listOfList = List.of(list, list2);

        Stream<String> result = listOfList.stream().flatMap(Collection::stream);
//        result.forEach(System.out::println);

        //***************************************************

        //distinct()
        //This operation identifies the duplicate using hashcode() and equals() methods and removes them.
        //If we have Stream of our custom object we should override hashcode() and equals() methods
        //Otherwise the method won't work correct!

        Stream<String> fruitsStream = Stream.of("Apple", "Jack Fruit", "Water Melon", "Apple");
        Stream<String> distinct = fruitsStream.distinct();

//        distinct.forEach(System.out::println);

        //***************************************************

        //sorted()
        //Returns a stream consisting of the elements of this stream, sorted according to the natural order.

        Stream<String> ingredients = Stream.of("tomoto", "Green Chilli", "Pototo", "Beet root");
        Stream<String> sorted = ingredients.sorted(Comparable::compareTo);

//        sorted.forEach(System.out::println);

        //***************************************************

        //peek()
        //This method exists mainly to support debugging,
        //where you want to see the elements as they flow past a certain point in a pipeline

        //Note: We can not predict the order of peek() invocation for parallel stream pipelines.

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e));

        //***************************************************

        //limit()
        //Returns a stream with the limited size given.

        //Note: limit() is suitable for sequential streams and cannot give good performance results for parallel streams

        Stream<String> resultLimit = Stream.of("one", "two", "three", "four").limit(2);
//        resultLimit.forEach(System.out::println);

        //***************************************************

        //skip()
        //This method skips the given n elements and returns a Stream

        Stream<String> skip = Stream.of("one", "two", "three", "four", "five").skip(2);
//        skip.forEach(System.out::println);


        //**************************************************************************************************************


        //                T E R M I N A L   O P E R A T I O N S    E X A M P L E

        //Terminal operations return result


        //LIST OF TERMINAL OPERATIONS
        //anyMatch()
        //allMatch()
        //noneMatch()
        //collect()
        //count()
        //findAny()
        //findFirst()
        //forEach()
        //min()
        //max()
        //reduce()
        //toArray()

        //***************************************************

        //anyMatch()
        //The Java Stream anyMatch() method is a terminal operation that takes a single Predicate as a parameter,
        //starts the internal iteration of the Stream, and applies the Predicate parameter to each element.

        boolean anyMatch = Stream.of("java", "php", "python").anyMatch(x -> x.startsWith("py"));
//        System.out.println(anyMatch);

        //**************************************************************************************************************

        //allMatch()
        //If the Predicate returns true for all elements in the Stream, the allMatch() will return true.
        //If not all elements match the Predicate, the allMatch() method returns false.

        boolean allMatch = Stream.of("php", "python").allMatch(x -> x.startsWith("p"));
//        System.out.println(allMatch);

        //**************************************************************************************************************

        //noneMatch()
        //The noneMatch() method will return true if no elements are matched by the Predicate
        //and false if one or more elements are matched.

        boolean nonMatch = Stream.of("java", "php", "python").noneMatch(x -> x.startsWith("xxxx"));
//        System.out.println(nonMatch);

        //**************************************************************************************************************

        //collect()
        //The Java Stream collect() method is a terminal operation that starts the internal iteration of elements
        //and collects the elements in the stream in a collection or object of some kind.


        List<String> collect = Stream.of("one", "two", "three")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

//        collect.forEach(System.out::println);

        //**************************************************************************************************************

        //count()
        //Method is a terminal operation that starts the internal iteration of the elements in the Stream and counts the elements.

        long countResult = Stream.of("one", "two", "three")
                .map(String::toUpperCase)
                .count();

//        System.out.println(countResult);

        //**************************************************************************************************************

        //findAny()
        //The Java Stream findAny() method can find a single element from the Stream.
        //The element found can be from anywhere in the Stream.
        //There is no guarantee about from where in the stream the element is taken.

        Optional<String> findAny = Stream.of("one", "two", "three", "four").filter(x -> x.contains("r")).findAny();

//        System.out.println(findAny.get());

        //**************************************************************************************************************

        //findFirst()
        //The Java Stream findFirst() method finds the first element in the Stream if any elements are present in the Stream.
        //The findFirst() method returns an Optional from which you can obtain the element if present.

        Optional<String> findFirst = Stream.of("one", "two", "three", "four").filter(x -> x.contains("t")).findFirst();

//        System.out.println(findFirst.get());

        //**************************************************************************************************************

        //forEach()
        //The Java Stream forEach() method is a terminal operation that starts the internal iteration of the elements
        //in the Stream and applies a Consumer (java.util.function.Consumer) to each element in the Stream.
        //The forEach() method returns void.

        Stream<String> streamForeach = Stream.of("one", "two", "three", "four");

//        streamForeach.forEach(x -> {System.out.println(x);});

        //**************************************************************************************************************

        //min()
        //The Java Stream min() method is a terminal operation that returns the smallest element in the Stream.

        IntStream minStream = IntStream.of(2, 9, -1, 7, -7, 0, 33);
        OptionalInt min = minStream.min();
//        System.out.println(min.getAsInt());

        //**************************************************************************************************************

        //max()
        //The Java Stream max() method is a terminal operation that returns the largest element in the Stream.


        IntStream maxStream = IntStream.of(2, 9, -1, 7, -7, 0, 33);
        OptionalInt max = maxStream.max();
//        System.out.println(max.getAsInt());

        //**************************************************************************************************************

        //reduce()
        //The Java Stream reduce() method is a terminal operation that can reduce all elements in the stream to a single element.

        Stream<String> reduceStream = Stream.of("one", "two", "three", "four");
        Optional<String> reduce = reduceStream.reduce((value, value2) -> {
            return value + " +" + value2;
        });

//        System.out.println(reduce.get());

        //*******************************************************

        //in case of Stream is empty result will be some value.

        Stream<String> reduceStreamEmpty = Stream.empty();
        String valueStr = reduceStreamEmpty.reduce("valueString", String::concat);

//        System.out.println(valueStr);

        //**************************************************************************************************************

        //toArray()
        //Returns an array of Objects containing all the elements.

        Stream<String> toArrayStream = Stream.of("one", "two", "three");
        Object[] arrayOfStream = toArrayStream.toArray();

//        System.out.println(arrayOfStream[0]);
//        System.out.println(arrayOfStream[1]);
//        System.out.println(arrayOfStream[2]);

        //**************************************************************************************************************

    }


    private static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
