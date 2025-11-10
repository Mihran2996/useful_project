package com.java8.methodRefernces;

import com.java8.methodRefernces.model.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    //What is method reference in java 8?
    //https://medium.com/@nagarjun_nagesh/method-references-in-java-5eca2a49f85e


    //Method references to provide a way to refer to methods without invoking them.
    //They are compact and readable and can be used with lambda expressions.

    //TYPE                                                                          EXAMPLE                    EQUIVALENT LAMBDA
    //Reference to a static method	                                                ClassName::staticMethod	   x -> ClassName.staticMethod(x)
    //Reference to an instance method of a particular object	                    instance::method	       x -> instance.method(x)
    //Reference to a constructor	                                                ClassName::new	           () -> new ClassName()

    public static void main(String[] args) {

        //Example: Reference to a Static Method
        List<String> items = Arrays.asList("A", "B","C");

        // Using lambda expression
        //instead of create functional interface we can reach the same behavior using method reference
        Consumer<String> consumer = (String s) -> System.out.println(s);
        items.forEach((s) -> consumer.accept(s));

        //Using method reference
        items.forEach(System.out::println);

        System.out.println("Instance references");
        //Example: Reference to an instance Method
        Printer<String> printer = new Printer<>();

        //Using lambda expression
        items.forEach((s) -> printer.print(s));

        //using instance references
        items.forEach(printer::print);

    }
}
