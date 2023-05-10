package com.example.streamApi.java11;

public class Main {

    //Allowed to use var variable in lambda expressions which was introduced in java 10 version.
    //Added new methods in String ` isBlank(), lines(), strip(), stripLeading(), stripTrailing(), repeat()
    //Added the new default toArray(IntFunction<T[]> generator) method in java.util.Collection
    //Added the static not(Predicate<? super T> target) method in Predicate Functional interface
    //HTTP API `` HttpClient, HttpRequest, HttpResponse,WebSocket classes
    //Nest-Based Access Control
    //was introduced the new garbage collector ` Z Garbage Collector

    public static void main(String[] args) {

        //STRING METHODS
        //isBlank(): returns true if the string is empty, or has spaces.
//        String  test = "";
//        String  test2 = " ";
//        System.out.println(test.isBlank());
//        System.out.println(test2.isBlank());

        //

        //lines(): returns Stream storing each element as one value in Stream by same character between words.
//        String lineStr = "Red, Blue , white";
//
//        List<String> collect = lineStr.lines().collect(Collectors.toList());
//        collect.forEach(System.out::println);

        //repeat(): string of original string repeated the number of times in the argument.

//        String expression = "Hello Java! ";
//        String result = expression.repeat(5);
//        System.out.println(result);

        //stripLeading(): It is used to remove the white space which is in front of the string

//        String str = "   java";
//        String strResult = str.stripLeading();
//        System.out.println(strResult);

        //stripTrailing(): It is used to remove the white space which is in the back of the string
//
//        String str2 = "java   ";
//        String str2Result = str2.stripTrailing();
//        System.out.println(str2Result);

        //strip(): It is used to remove the white spaces which are in front and back of the string

//        String str3 = "    java   ";
//        String str3Result = str3.strip();
//        System.out.println(str3Result);


        //Optional.isEmpty(): This method returns true if the value of any object is null and else returns false.

//        Optional<String > optional = Optional.empty();
//        System.out.println(optional.isEmpty());

        // Local-Variable Syntax for Lambda Parameters

//        IntStream.of(1, 2, 3, 5, 6, 7)
//                .filter((var i) -> i % 2 == 0)
//                .forEach(System.out::println);

        //Nest-Based Access Control
        //minjev java 11 nerdrvac class@ accese unece private variablein cheres bridge method()-i;
        //java 11-ic heto bridge method el chka. class@ access uni private variable-in
//        Alphabet alphabet = new Alphabet();
//        alphabet.test();

    }

}


