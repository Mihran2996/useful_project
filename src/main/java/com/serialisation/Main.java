package com.serialisation;

import com.example.test.List;
import com.serialisation.exam.Person;
import com.serialisation.util.User;
import com.serialisation.util.UserDefense;

import java.io.*;
import java.util.Date;

public class Main {

    //SERIALIZATION/DESERIALIZATION : https://howtodoinjava.com/java/serialization/serialversionuid/

    //==========================================================================================================================

    //What is defensive copy?
    //To prevent external code from accidentally (or maliciously) changing the internal state of an object

    //Defensive copy allows constructor, getters, setters if field are immutable like String there is no need to copy.

    //Example

//    public static void main(String[] args) {
//        Date birthDay = new Date();
//        User user = new User(birthDay);
//        System.out.println(user);
//
//        System.out.println();
//        System.out.println("After changing birthday");
//        System.out.println();
//        //here we change date, and it affects to user object
//        birthDay.setTime(1);
//
//        System.out.println(birthDay);
//        System.out.println(user);
//
//        System.out.println("--------------------------");
//
//        Date birthDay2 = new Date();
//        UserDefense user2 = new UserDefense(birthDay2);
//        System.out.println(user2);
//
//        System.out.println();
//        System.out.println("After changing birthday");
//        System.out.println();
//        //here we change date, and it does not affect to user object
//        birthDay2.setTime(1);
//
//        System.out.println(birthDay2);
//        System.out.println(user2);
//    }

    //==========================================================================================================================

    //https://www.baeldung.com/java-serial-version-uid
    //https://medium.com/javarevisited/understanding-serialversionuid-in-java-07df4c57fc86
    //https://medium.com/@salvipriya97/serialization-and-deserialization-explained-with-examples-5e2e45af97ee
    //https://senoritadeveloper.medium.com/serialization-and-deserialization-in-java-what-is-serialversionuid-and-when-to-regenerate-it-22e1ee628675

    //What is SerialVersionUID

    //During serialization process if we did not define serialVersionId the compiler will create it compile time
    //If the object was modified (added new field, removed, changed), the version ov serialVersionId will be changed
    //During deSerialization versionIds from loaded object and object to cast will not be equal, and we will get an exception

    //The serialVersionId defined as static long
    //we use the serialVersionUID attribute to remember versions of a Serializable class
    //to verify that a loaded class and the serialized object are compatible.

    //if there is not an serializeVersionId Jvm will create automatically
    //if then we remove, change or add some field and try to deserialize an object will get exception
    //every time it is best practise to define serialVersionId
    //==========================================================================================================================

    //What is Serialization/DeSerialization

    //Serialization is a process of converting an object to a byte stream, keeping stage of an object.
    //DeSerialization is a process to reconstructing an object from byte stream.

    //Use Cases

    //When objects need to be sent over a network between different applications or systems.
    // Storing an object’s state in a file or a database for later retrieval.
    //Serializable interface indicates that class can be serialized.

    //==========================================================================================================================

    //https://www.baeldung.com/java-org-json
    //https://medium.com/@bubu.tripathy/json-serialization-and-deserialization-in-java-2a3f08266b70

    //Why not just switch to json?

    //Excel or document templating use-cases: If you're using JXLS,
    //JSON won't work natively — it's built for Excel templating using beans and XML-based configs.

    //No built-in support for comments: JSON doesn't support comments,
    //which is a downside for config files or templates (YAML or HOCON are better here).

    //==========================================================================================================================

    //Is converting to json serialisation?

    //Yes — converting objects to JSON is a form of serialization.

    //When you convert a Java object to JSON, you're serializing it. Here’s an example with Jackson:

    //ObjectMapper mapper = new ObjectMapper();
    //String json = mapper.writeValueAsString(myObject); // Serialize

    //MyObject obj = mapper.readValue(json, MyObject.class);  // Deserialize

    //example with Gson
    //Gson gson = new Gson();
    //String json = gson.toJson(myObject); // Serialize
    //MyObject obj = gson.fromJson(json, MyObject.class); // Deserialize

    //==========================================================================================================================

    //What is the need of Serialization?

    //to save an object, to transfer an object across network,
    //we can also use bytes, but JSON is readable, it's slower than bytes,

    //==========================================================================================================================

    //https://medium.com/@tararamgoyal4_92353/serialization-and-deserialization-in-java-part-2-97f7496fa2f1

    //What will be the value of transient variable after de-serialization?

    //Default values of transient fields after deserialization:

    //Type	                          Default after deserialization
    //Object	                          null
    //int, long                          	0
    //float, double                     	0.0
    //boolean                           	false
    //char                         	\u0000 (null char)

    //==========================================================================================================================

    //Other than Serialization what are the different approach to make object Serializable?

    //ObjectMapper
    //ObjectMapper mapper = new ObjectMapper();
    //String json = mapper.writeValueAsString(myObject);      // Serialize
    //MyObject obj = mapper.readValue(json, MyObject.class);

    //Gson
    //Gson gson = new Gson();
    //String json = gson.toJson(myObject);

    //https://www.geeksforgeeks.org/externalizable-interface-java/
    //https://javarush.com/en/groups/posts/en.2023.externalizable-interface-in-java
    //Java Externalizable Interface
    //Externalizable extends from the java.io.Serializable marker interface.
    //Any class that implements Externalizable interface should override the writeExternal(), readExternal() methods.
    //You can organize what serialize/deserialize in writeExternal/readExternal methods;

    //==========================================================================================================================

    //https://howtodoinjava.com/java/serialization/externalizable-vs-serializable/
    //What is the difference between Serializable and Externalizable interface in Java?

    //Serializable
    //Serialization is a marker interface
    //The class which is implementing this interface gives the responsibility to JVM for serializing or persist java object.
    //JVM use readObject and writeObject for serialization
    //In serialization, JVM ignores transient variables during the serialization and deserialization of a java object
    //If the superclass implements Serializable, subclasses are also serializable

    //If the superclass is not serializable, and the subclass is serialized but...

    class Parent {
        int x = 10;
    }

    class Child extends Parent implements Serializable {
        int y = 20;
    }
    //This will compile and serialize just fine — BUT:
    //
    //The Child’s fields (y) are serialized
    //
    //The Parent’s fields (x) are not serialized — and will be reset using default constructor during deserialization,
    //
    //So if Parent doesn’t have a no-arg constructor, you’ll get a java.io.InvalidClassException.


    //Externalizable
    //Externalization contains two methods readExternal and writeExternal.
    //Externalization provides implementation logic control to the application by overriding readExternal and writeExternal methods.
    //Programmer can write their own logic to ignore some of the variables during externalization of java object

    //==========================================================================================================================

    //If a class is serializable but its superclass in not, what will be the state of the instance variables inherited from super class after deserialization?

    //the instance variable of supperClass will be ignored, and there is a need to add no-args constructor
    //if default constructor isn't added, we will get InvalidCastException.

    //==========================================================================================================================

    //How can one customize the Serialization process? or What is the purpose of implementing the writeObject() and readObject() method?

    //Mark fields as transient
    //Override writeObject() and readObject() methods
    //This is the most direct way to customize serialization for a class that implements Serializable.

    class User implements Serializable {
        String username;
        transient String password; // transient: won't be serialized by default

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Custom serialization
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject(); // serialize non-transient fields
            out.writeObject("ENCRYPTED:" + password); // manually handle transient
        }

        // Custom deserialization
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject(); // deserialize non-transient fields
            String encrypted = (String) in.readObject();
            password = encrypted.replace("ENCRYPTED:", ""); // simple decoding
        }

        public void printInfo() {
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }

    //writeObject() is automatically called when ObjectOutputStream.writeObject() is used.
    //
    //readObject() is automatically called when ObjectInputStream.readObject() is used.
    //
    //You must make them private and exactly match the signature.
    //
    //method must be private, because under hood of  serialization works reflection, and reflection has access to private definition


    //How it works behind the scenes
    //1. Checks if the object’s class implements Serializable.

    //2. Looks (via reflection) for a private method with this exact signature:
          // private void writeObject(ObjectOutputStream out) throws IOException;
          // private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException

    //3.If found, it invokes that method instead of using the default serialization.

    //==========================================================================================================================

    //What are some drawback of serialisation?

    //Versioning issues : 	Changes in class structure can break deserialization compatibility.
    //Fields that can't be serialized require special handling (e.g., transient).
    //Performance overhead	Serialization can be slow, especially for large objects.

    //==========================================================================================================================

    //What are different types of shared memory? Describe the architecture of SMP

    //https://www.geeksforgeeks.org/what-is-a-shared-memory/

    //==========================================================================================================================

    //We also can do deep copy using serialization/deserialization

    public class TestClass implements Serializable {

      private static final long serialVersionUID = 1L;

      private String firstName;
      private String lastName ;
      private List permissions;

      public TestClass deepCopy() throws Exception {
        //Serialization of object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);

        //De-serialization of object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        TestClass copied = (TestClass) in.readObject();
        return copied;
      }
    }

    //==========================================================================================================================
}
