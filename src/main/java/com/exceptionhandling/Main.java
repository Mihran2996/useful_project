package com.exceptionhandling;

public class Main {

    //https://slycreator.medium.com/the-what-why-and-how-of-exception-handling-in-java-b2d1577a0bdd
    //https://rollbar.com/blog/java-exceptions-hierarchy-explained/

    //java.lang.Throwable
    //│
    //├── java.lang.Error          (Used for serious errors – usually not caught)
    //│
    //└── java.lang.Exception      (Used for conditions your program might want to catch)
    //    │
    //    ├── java.lang.RuntimeException   (Unchecked exceptions)
    //    │   ├── NullPointerException
    //    │   ├── IndexOutOfBoundsException
    //    │   ├── IllegalArgumentException
    //    │   ├── ArithmeticException
    //    │   ├── ClassCastException
    //    │   └── NumberFormatException
    //    │
    //    └── (Checked exceptions)
    //        ├── IOException
    //        │   ├── FileNotFoundException
    //        │   └── EOFException
    //        ├── SQLException
    //        ├── ParseException
    //        ├── ClassNotFoundException
    //        └── InterruptedException

    //==========================================================================================================================================

    //Why we need EXCEPTION
    //We need exceptions to make our programs more reliable, maintainable, and user-friendly when unexpected situations occur.

    //Exceptions help you detect problems like:
    //
    //Dividing by zero
    //
    //Accessing a null object
    //
    //File not found
    //
    //Invalid user input

    //👇 Key Benefits (in different words):
    //Controlled Failure
    //Instead of crashing the whole program, exceptions let you catch problems where they happen and handle them gracefully.
    //
    //Better Communication
    //Exceptions can carry detailed error messages and types. This helps you understand what went wrong and where — especially during debugging.
    //
    //Cleaner Code
    //Without exceptions, you'd have to add a bunch of if-else checks everywhere for error conditions.
    //==========================================================================================================================================

    //https://www.geeksforgeeks.org/creating-a-dynamic-array-in-java/

    //What is dynamic Array?
    //A dynamic array is an array that can change its size during program execution.
    //==========================================================================================================================================

    //https://www.baeldung.com/java-wrapping-vs-rethrowing-exceptions
    //What is exception rethrowing?

    //You catch an exception, possibly do something with it (like logging), and then throw it again so that it can be handled at a higher level.

    //public void readFile(String filePath) throws IOException {
    //    try {
    //        // Some risky operation
    //        Files.readAllLines(Paths.get(filePath));
    //    } catch (IOException e) {
    //        System.out.println("Error reading file: " + filePath);
    //        throw e; // Rethrowing the same exception
    //    }
    //}

    //Here:
    //
    //We catch the IOException
    //
    //Log a message or do something useful
    //
    //Then rethrow the same exception to be handled by the caller


    // Rethrowing with a new exception (custom message or type):

    //try {
    //    someOperation();
    //} catch (SQLException e) {
    //    throw new RuntimeException("Database failure occurred", e); // wrapping and rethrowing
    //}

    //This is useful when:
    //
    //You want to hide low-level details and expose a more meaningful exception to your API users
    //
    //Or convert a checked exception to an unchecked one
    //==========================================================================================================================================

    //https://medium.com/@prasanthnehru21/explain-the-custom-exception-class-creation-in-java-6931bb4f0805

    //How to implement custom exception classes?
    //Steps to Create a Custom Exception Class

    //1-Extend the Exception class (or RuntimeException for unchecked exceptions)
    //2-Add constructors to initialize the exception message and cause (optional).
    //3-Override toString() (optional) to provide a custom error message.
    //==========================================================================================================================================

    //https://medium.com/@AlexanderObregon/how-javas-try-finally-blocks-work-without-catch-96e93be92ae5

    //Can we write try block with finally?
    //✅ Yes, you can write a try block with only a finally block in Java — without a catch block.

    //Can we write only try block without catch and finally blocks?
    //❌ No, you cannot write a try block alone without either a catch or a finally block in Java.
    //Java requires that a try block must be followed by at least one of:
    //
    //a catch block
    //OR
    //
    //a finally block
    //OR both
    //==========================================================================================================================================

    //https://www.geeksforgeeks.org/chained-exceptions-java/

    //What are chained exceptions?
    //Chained exceptions allow you to associate one exception with another — basically, one exception caused another.
    //
    //It helps track the root cause of a problem when you're throwing a new exception but still want to preserve the original error that triggered it.

    //Why Use It?
    //In real-world applications, low-level methods might throw exceptions (e.g., IOException),
    //but higher-level methods may want to throw a custom exception with more context — without losing the original cause.
    //==========================================================================================================================================

    //Give some examples to checked exceptions?

    //📘 Checked Exceptions in Java
    //Checked exceptions are exceptions that:
    //
    //Are checked at compile time
    //
    //Must be either caught using try-catch or declared using throws in the method signature

    //🔧 Common Examples of Checked Exceptions:
    //Exception Class	When It Happens

    //IOException	         -   When reading/writing files or input/output streams
    //FileNotFoundException  -   Trying to open a file that does not exist
    //SQLException	         -   Database access errors
    //ClassNotFoundException -	 When trying to load a class dynamically, and it’s not found
    //ParseException	     -   Error while parsing a string (e.g., date formats)
    //InterruptedException   -	 When a thread is interrupted while sleeping or waiting
    //==========================================================================================================================================

    //https://rollbar.com/blog/how-to-resolve-classnotfoundexception-in-java/

    //When ClassNotFound exception is thrown?
    //The ClassNotFoundException is thrown when your Java program tries to load a class by name at runtime,
    //but the class cannot be found by the class loader.

    //Common scenarios where this happens:
    //Using Class.forName("some.class.Name")
    //
    //This method tries to load the class with the specified fully qualified name.
    //
    //If the class isn’t on the classpath, Java throws ClassNotFoundException.
    //
    //Using dynamic class loading (Reflection)
    //
    //When your code dynamically loads classes, for example, loading JDBC drivers, plugins, or modules.
    //
    //Incorrect or missing JAR files or class files
    //
    //The class might not be in your project, or the required JAR/library is missing from the classpath.

    //Example:
    //try {
    //    Class.forName("com.example.NonExistentClass");
    //} catch (ClassNotFoundException e) {
    //    System.out.println("Class not found!");
    //}

    //If "com.example.NonExistentClass" does not exist in your classpath, this code will throw a ClassNotFoundException.
    //==========================================================================================================================================
    //todo add link

    //What are important methods of Java Exception Class?

    //getMessage()
    //Gives you the error message string you usually pass in the exception constructor.
    //
    //getCause()
    //Returns the original exception that caused this one, useful in chained exceptions.
    //
    //printStackTrace()
    //Prints the sequence of method calls leading to the exception, which is essential for debugging.
    //
    //toString()
    //Returns a string like "java.lang.NullPointerException: message", handy for logging.
    //==========================================================================================================================================

}


