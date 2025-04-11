package com.example.java8;


public class Main {

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
    //todo



}
