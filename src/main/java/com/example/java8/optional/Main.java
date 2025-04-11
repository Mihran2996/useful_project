package com.example.java8.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        //Provides more suitable syntax
        //We can use the Optional class to wrap our data and avoid the classical null checks and some of the try-catch blocks.
        //As a result, we’ll be able to chain method calls and have more fluent, functional code.

        //Main useFull methods

        //If value is passed null into Optional.of() method we will get NullPointerException
        //Optional<String> nullExample = Optional.of(null);

        //==================================================================================================================================

        //Optional avoids of NullPointerException using Optional.ofNullable() method
        Optional<String> optionalS = Optional.ofNullable(null);

        //==================================================================================================================================

        //Conditional Action With ifPresent()
        //The ifPresent() method enables us to run some code on the wrapped value if it’s found to be non-null. Before Optional, we’d do:

        String name = "name";
        if(name != null) {
            System.out.println(name.length());
        }

        Optional<String> ifCondition = Optional.of("name");
//        ifCondition.ifPresent(System.out::println);

        //==================================================================================================================================

        //Default Value With orElse()
        //The orElse() method is used to retrieve the value wrapped inside an Optional instance.
        //It takes one parameter, which acts as a default value. The orElse() method returns the wrapped value if it’s present, and its argument otherwise:

        String val = null;
        String ifNull = Optional.ofNullable(val).orElse("another value");
//        System.out.println(ifNull);

        //==================================================================================================================================

        //Default Value With orElseGet()
        //The orElseGet() method is similar to orElse().
        //However, instead of taking a value to return if the Optional value is not present, it takes a supplier functional interface,
        //which is invoked and returns the value of the invocation:

        String ex = null;
        String result  = Optional.ofNullable(ex).orElseGet(() -> "another value");
//        System.out.println(result);

        //==================================================================================================================================

        //orElse() vs orElseGet()
        //orElse() method is EAGER, it does not matter optional contain null value or not orElse will be executed
        //orElseGet() method is LAZY. it is called only when optional contain null value

        String text = "has value";
        String exam1 = Optional.ofNullable(text).orElse(getDefaultValue());
        String exam2 = Optional.ofNullable(text).orElseGet(() -> getDefaultValue());

//        System.out.println(exam1);
//        System.out.println(exam2);

        //==================================================================================================================================

        //Exceptions With orElseThrow()
        //This method likes orElse() or orElseGet() methods but its another approach to handle case when there is need to throw exception

        String nullCase = null;
//        Optional.ofNullable(nullCase).orElseThrow(NullPointerException::new);

        //==================================================================================================================================

        //Conditional Return With filter()
        //If the wrapped value passes testing by the predicate,

        String filterExam = "Hello World";
        String res = Optional.of(filterExam).filter((value) -> value.startsWith("W")).orElse("does not pass filter");
//        System.out.println(res);

        //==================================================================================================================================

        //Transforming Value With map()
        //We can use a similar syntax to transform the Optional value with the map() method:

        String mapsExam = "hello world";
        Optional<String> maps = Optional.of(mapsExam);

        String mapRes  = maps.
                filter((value) -> value.startsWith("h"))
                .map(String::toUpperCase).orElseThrow(NullPointerException::new);
//        System.out.println(mapRes);

        //==================================================================================================================================

        //Opional can be as local variable or method return type
        //It can not be as method argument because we can have some part of code which can be reason of NullPointerException
        //Example
        //getException(null);
    }

    public static void getException(Optional<Integer> value) {
        //If value is passed as null here we will get NullPointerException
        if (value.isPresent()) {
            System.out.println("Hello");
        }
    }

    public  static String getDefaultValue() {
        System.out.println("getDefaultValue() method is called by orElse()");
        return "Default value";
    }
}
