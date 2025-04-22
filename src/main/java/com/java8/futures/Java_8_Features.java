package com.java8.futures;

public class Java_8_Features {

    //What are new features which got introduced in Java 8?

    //==========================================================================================================================

    //1. Lambda Expressions
    //Lambda expressions are a new and essential feature in Java 8.
    //They enable functional programming by allowing you to pass functionality as a method argument
    //or to define anonymous methods more concisely.

    // Traditional approach
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Running...");
        }
    };

    // Lambda expression
    Runnable lambdaRunnable = () -> System.out.println("Running...");

    //Why Do We Need a Lambda Expression?
    //Lambda converts the code segment into an argument
    //It is a method that can be created without instantiating a class
    //==========================================================================================================================

    //2. Functional Interfaces

    //Functional interfaces have a single abstract method, making them ideal for lambda expressions.
    //Java 8 introduced several new functional interfaces in the java.util.function package.

    //Example

    @FunctionalInterface
    interface MyFunctionalInterface {
        void perform();
    }

    //Using a lambda expression
    //MyFunctionalInterface action = () -> System.out.println("Action performed");
    //action.perform();

    //2.1 Why functional interface has a single abstract method

    //A functional interface in Java has a single abstract method
    //because it enables lambda expressions and method references to be used unambiguously and concisely.

    //Lambda Expressions Need Clarity
    //Lambda expressions are anonymous functions that implement a method.
    //To work properly, the compiler must know exactly which method the lambda is targeting.
    //If there were multiple abstract methods, the compiler wouldn't be able to tell which one the lambda was for.

    //Still Allows Default & Static Methods
    //You can have default and static methods in a functional interface — they don’t count as abstract methods.

    //Functional interfaces

    //1. Function <T R>  = It's used in map method of Stream Api

    //R apply(T t); = Represents a function that takes one argument and returns a result
    //Example =  Function<String, Integer> length = s -> s.length();

    //Has Useful static method which always returns its input argument
    //static <T> Function<T, T> identity() {
    //        return t -> t;
    // }

    //2. Consumer<T> = It's used in forEach method of Stream Api
    //accept(T t); = Takes a value but returns nothing (used for performing actions).


    //Predicate<T> = It's used in filter method of Stream Api
    //boolean test(T t); = Returns true if the input argument matches the predicate, otherwise false

    //==========================================================================================================================

    //3. Method References

    //Method references provide a way to refer to methods without invoking them.
    //They are compact and readable and can be used with lambda expressions.

    //TYPE                                                                          EXAMPLE                    EQUIVALENT LAMBDA
    //Reference to a static method	                                                ClassName::staticMethod	   x -> ClassName.staticMethod(x)
    //Reference to an instance method of a particular object	                    instance::method	       x -> instance.method(x)
    //Reference to a constructor	                                                ClassName::new	           () -> new ClassName()

    //==========================================================================================================================

    //4. Stream Api

    //One of the major new features in Java 8 which contains classes for processing sequences of elements.
    //Creating one time you can not use it multiple time,
    //stream can not be a class variable or as method argument because it can be used before to pass method or then,
    //stream can be as return type of method because every time we create a new stream and return,
    //stream operation does not change collection,
    //Stream has 2 types of operation Terminal/Intermediate,
    //Terminal operations are not lazy; they trigger the evaluation of the stream pipeline.
    //Intermediate operations are lazy and do nothing until a terminal operation is invoked.
    //Intermediate operation does not return result, they only transfer stream to another stream.
    //Terminal operations returns result.
    //After Terminal operations we can not call Intermediate operations,
    //to reach this we need to call stream which creates a new stream and then to call Intermediate operation
    //If we use stream multiple time we will get an IllegalStateException

    //Stream Creation
    //Streams can be created from different element sources e.g. collections or arrays with the help of stream() and of() methods

    //String[] arr = new String[]{"a", "b", "c"};
    //Stream<String> stream = Arrays.stream(arr);
    //stream = Stream.of("a", "b", "c");

    //A stream() default method is added to the Collection interface and allows creating a Stream<T> using any collection as an element source:
    //Stream<String> stream = list.stream();
    //Stream.empty(); collection.stream(); Arrays.stream(array);Stream.<String>builder().add("a").build(); Stream.iterate(40, n -> n + 2).limit(20);

    //Multi-threading With Streams
    //In Java 8, Stream and Parallel Stream are used to process sequences of elements from a source, such as a collection.
    //However, they differ in how they perform the processing:

    //Stream (Sequential Stream):
    //A sequential stream processes elements one by one in a single thread.
    //Operations are executed in the order the stream is created (from start to end).
    //Suitable for scenarios where processing is inexpensive or needs to be done in order.

    //Parallel Stream
    //A parallel stream divides the elements into multiple parts and processes them in parallel using multiple threads from the ForkJoinPool.
    //The stream is split into substreams, which are processed concurrently.

    //==========================================================================================================================

    //5. Optional Class

    //Optional is a container class representing a value's presence or absence.
    //1.We can use the Optional class to wrap our data and avoid the classical null checks and some of the try-catch blocks.
    //As a result, we’ll be able to chain method calls and have more fluent, functional code.

    //It helps avoid null checks and NullPointerException.
    //It provides more suitable syntax

    //It can be as Class variable, and method return type
    //It can not be as method argument, because it can be pass as null,
    //this time if in method there is a condition like if(optionalArgument.isPreset()) we will get a NullPointerException

    //==========================================================================================================================

    //6.ForEach() Method
    //The forEach() method in Java 8 provides a new way to iterate over collections.
    //It adopts Consumer functional interface
    //It is part of the Iterable interface and allows you to act as each collection element, typically using a lambda expression.

    //==========================================================================================================================

    //7. Default methods

    //The reason why the Java 8 release included default methods is pretty obvious.
    //In a typical design based on abstractions, where an interface has one or multiple implementations,
    //if one or more methods are added to the interface, all the implementations will be forced to implement them too.
    //Otherwise, the design will just break down.
    //Default interface methods are an efficient way to deal with this issue.
    //They allow us to add new methods to an interface that are automatically available in the implementations.


    //==========================================================================================================================

    //8. Static methods

    //The static methods in interfaces are similar to default methods but the only difference is that you can’t override them.
    //Now, why do we need static methods in interfaces if we already have default methods?
    //Suppose you want to provide some implementation in your interface,
    //and you don’t want this implementation to be overridden in the implementing class, then you can declare the method as static.

    //==========================================================================================================================

    //9. PermGen replaced to MetaSpace
}
