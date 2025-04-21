package com.example.java8;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class   Main {

    //When will you use optional interface?
    //https://medium.com/javarevisited/4-reasons-why-you-should-use-java-optional-or-not-4e44d51a9645

    //===================================================================================================================================================================

    //1. Optional as Method Return Type
    //One way of using Optional would be to wrap data before returning - if it can potentially be null.
    //This approach was quickly adopted by developers and frameworks such as SpringDataJPA.
    //As a result, the caller will be aware that the result can be null. Furthermore,
    //this gives the caller some flexibility: for example, it allows him to easily throw a custom exception if the Optional is empty.

    //Example

    //public Account getAccount_classic() {
    //        Account account = accountRepository.get("johnDoe");
    //        if(account == null) {
    //            throw new AccountNotEligible();
    //        }
    //        return account;
    //    }
    //
    //    public Account getAccount_optional() {
    //        return accountRepository.find("johnDoe")
    //                .orElseThrow(AccountNotEligible::new);
    //    }


    //Let’s look into some scenarios and compare the two solutions:

    //public Membership getAccountMembership_classic() {
    //    Account account = accountRepository.get("johnDoe");
    //    if(account == null || account.getMembership() == null) {
    //        throw new AccountNotEligible();
    //    }
    //    return account.getMembership();
    //}
    //
    //public Membership getAccountMembership_optional() {
    //    return accountRepository.find("johnDoe")
    //        .flatMap(Account::getMembershipOptional)
    //        .orElseThrow(AccountNotEligible::new);
    //}

    //For these use-cases, we can leverage the filter and map methods from the Optional’s API.

    //public Membership getAccountEligibleForPromotion_classic() {
    //    Account account = accountRepository.get("johnDoe");
    //    if(account == null || account.getMembership() == null || !account.isActive()) {
    //        throw new AccountNotEligible();
    //    }
    //    return account.getMembership();
    //}
    //
    //public Membership getAccountEligibleForPromotion_optional() {
    //    return accountRepository.find("johnDoe")
    //        .filter(Account::isActive)
    //        .flatMap(Account::getMembershipOptional)
    //        .orElseThrow(AccountNotEligible::new);
    //}

    //===================================================================================================================================================================

    //2. Wrapping the Getters
    //Making the getters return Optional can be a good practice for the fields where null is a valid value from a business point of view.

    //Optional<Membership> getMembershipOptional() {
    //    return Optional.ofNullable(membership);
    //}

    //===================================================================================================================================================================

    //What is private interface method?
    //https://medium.com/@salimoncu.fb/using-private-methods-in-java-interfaces-90670367447d
    //Interfaces are able to use private methods to hide details on implementation from classes that implement the interface.
    //Private interface methods can be static or instance. In both cases, the private method is not inherited by sub-interfaces or implementations
    //.They are mainly there to improve code re-usability within interface only — thus improving encapsulation.

    //==========================================================================================================================

    //What is the use of ofNullable method in Stream?
    //https://rameshfadatare.medium.com/java-stream-ofnullable-method-with-examples-d2265648225b#:~:text=ofNullable()%20method%20is%20used,a%20concise%20and%20readable%20manner.

    //The Stream.ofNullable() method allows you to create a stream from a single value that may be null.
    //If the value is null, the method returns an empty stream.
    //This provides a convenient way to handle optional values in a stream processing pipeline.

    //===================================================================================================================================================================


    //https://medium.com/@AlexanderObregon/javas-try-with-resources-statement-explained-6b0ebf84d582

    //What is a Resource?
    //In Java, a resource is any object that implements the AutoCloseable interface, which includes the Closeable interface as well.

    //What is the purpose of try-with-resource statement?
    //The try-with-resources statement in Java is a feature introduced in Java 7 to help manage resources automatically — especially things like files, database connections

    //1.Automatically close resources (like streams, readers, sockets, etc.)
    //2.Avoid resource leaks (like forgetting to call .close())
    //3.Make code cleaner and less error-prone

    //this is error-prone

    //BufferedReader reader = null;
    //try {
    //    reader = new BufferedReader(new FileReader("data.txt"));
    //    String line = reader.readLine();
    //    System.out.println(line);
    //} catch (IOException e) {
    //    e.printStackTrace();
    //} finally {
    //    try {
    //        if (reader != null) reader.close();
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }
    //}

    //Problems:
    //1.You might forget to close the resource.
    //2.You might miss a null check.
    //3/You have nested try-catch blocks — easy to get wrong.

    //===================================================================================================================================================================

    //How iterations are different between collections and streams

    //for-loop
    //Eager evaluation – All elements are stored in memory and available immediately.
    //You iterate explicitly, often using a for loop or iterator.
    //The control of iteration is external – you manage the loop.

    //List<String> list = Arrays.asList("a", "b", "c");
    //for (String s : list) {
    //    System.out.println(s);
    //}

    //Behind the scenes:
    //Java walks through each element in sequence (e.g., via Iterator).
    //You decide when to stop, skip, or break.


    //Stream iterator
    //Lazy evaluation – Operations are not performed until a terminal operation is invoked.
    //Iteration is internal – the stream handles the looping.
    //Often used for functional-style operations like map, filter, reduce.

    //Stream.of("a", "b", "c")
    //      .map(String::toUpperCase)
    //      .forEach(System.out::println);

    //Behind the scenes:
    //You describe what should happen, not how to do it.
    //Stream handles iteration, optimization (like short-circuiting), and parallelism if desired.


    //===================================================================================================================================================================

    //What Is the Difference Between Map and flatMap Stream Operation?
    //https://howtodoinjava.com/java8/stream-map-vs-flatmap/
    //The map() operation is used to transform each element of a stream into another object using a given function.
    //It returns a new stream containing the transformed elements in the same order as the original stream.

    //The flatMap() operation is used when each element in the stream is transformed into multiple elements,
    //often in the form of another collection or stream. The resulting elements are then flattened into a single stream.

    //===================================================================================================================================================================

    //How parallel streams work?
    //https://medium.com/geekculture/pitfalls-of-java-parallel-streams-731fe0c1eb5f

    //===================================================================================================================================================================

    //Do we have PermGen in Java 8? Are you aware of MetaSpace?

    //PermGen
    //
    //(Permanent Generation) is a special heap space separated from the main memory.
    //The JVM keeps track of class metadata in the PermGen. Also, the JVM stores all the static content in this.
    //Due to limited memory size, PermGen can throw OutOfMemoryError.
    //Metaspace
    //
    //Metaspace is a new memory space.
    //It has replaced the older PermGen memory space.
    //It can now handle memory allocation.
    //Metaspace grows automatically by default.

    //===================================================================================================================================================================

    //What methods are added to Collections in Java 9?

    //List.of(...), Set.of(...), Map.of(...)
    //They are immutable – trying to modify them (like add() or put()) throws UnsupportedOperationException.
    //Nulls are not allowed – any null element or key/value will throw NullPointerException.
    //Map.of() supports up to 10 key-value pairs. For more, use Map.ofEntries(...).

    //===================================================================================================================================================================

}
