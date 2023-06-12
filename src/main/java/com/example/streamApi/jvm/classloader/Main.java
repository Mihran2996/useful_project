package com.example.streamApi.jvm.classloader;

public class Main {

    //HOW CLASSLOADING WORKS?
    //ClassLoader in Java is a class that is used to load class files in Java.
    //Java code is compiled into a class file by javaC compiler and JVM executes the Java program,
    //by executing byte codes written in the class file.
    //ClassLoader is responsible for loading class files from file systems, networks, or any other source

    //There is three default class loader used in Java,
    //1-Bootstrap or Primordial class loader.
    //2-Extension class loader.
    //3-System or Application class loader.

    //There are three phases in the class loading process: LOADING, LINKING, and INITIALIZATION.

    //LOADING***********************************************************************************************************
    //Every class loader has a predefined location, from where they load class files.
    //I M P O R T A N T
    //The first class to be loaded into memory is usually the class that contains the main() method.

    //BOOTSTRAP OR PRIMORDIAL CLASSLOADER
    //The bootstrap class loader is responsible for loading standard JDK class files from rt.jar
    //And it is the parent of all class loaders in Java.
    //When we are trying to load HashMap, our (APPLICATION) SYSTEM CLASSLOADER delegates it to the Extension ClassLoader.
    //The EXTENSIONS class loader delegates it to the BOOTSTRAP CLASSLOADER.
    //The BOOTSTRAP CLASSLOADER  finds the HashMap class and loads it into the JVM memory.

    //EXTENSIONS CLASSLOADER
    //It loads the classes available in the path represented by the system property java.ext.dirs
    //it can load another jar file from our application which is for example library written with other language

    //APPLICATION OR SYSTEM CLASSLOADER
    //It loads our application classes(the classes which are written by us) from classpath

    //The JVM uses the ClassLoader.loadClass() method for loading the class into memory.
    //It tries to load the class based on a fully qualified name.
    //If a parent class loader is unable to find a class, it delegates the work to a child class loader.
    //If the last child class loader isn't able to load the class either, it throws NoClassDefFoundError or ClassNotFoundException.

    //JAVA CLASSLOADER WORKS IN THREE PRINCIPLES
    //1-DELEGATION
    //2-VISIBILITY
    //3-UNIQUENESS

    //1-DELEGATION PRINCIPLE
    //As discussed on when a class is loaded and initialized in Java, a class is loaded in Java,when it's needed.
    //Suppose you have an application-specific class called Some.class,
    //the first request of loading this class will come to Application ClassLoader
    //which will delegate to its parent Extension ClassLoader which further delegates to Primordial or Bootstrap class loader.
    //Primordial will look for that class in rt.jar and since that class is not there,
    //a request comes to Extension class loader which looks on jre/lib/ext directory and tries to locate this class there,
    //if the class is found there then Extension class loader will load that class
    //and Application class loader will never load that class but if it's not loaded by extension class-loader than
    //Application class loader loads it from Classpath in Java.

    //2-VISIBILITY PRINCIPLE
    //According to the visibility principle, Child ClassLoader can see class loaded by Parent ClassLoader
    //but vice-versa is not true.
    //The Visibility Principle states that a class loaded by a parent ClassLoader is visible to the child ClassLoaders
    //but a class loaded by a child ClassLoader is not visible to the parent ClassLoaders.
    //Suppose a class GEEKS.class has been loaded by the Extension ClassLoader,
    //then that class is only visible to the Extension ClassLoader and Application ClassLoader but not to the Bootstrap ClassLoader
    //If that class is again tried to load using Bootstrap ClassLoader it gives an exception java.lang.ClassNotFoundException.

    //3-UNIQUENESS
    //The Uniqueness Property ensures that the classes are unique and there is no repetition of classes.
    //It allows to load a class once. It is achieved by delegation principle.
    //It ensures that child ClassLoader doesn't reload the class, which is already loaded by the parent.


    //LINKING***********************************************************************************************************
    //After a class is loaded into memory, it undergoes the linking process.
    //Linking a class or interface involves combining the different elements and dependencies of the program together.

    //Linking includes the following steps
    //1-VERIFICATION
    //2-PREPARATION
    //3-RESOLUTION

    //VERIFICATION
    //This phase checks the structural correctness of the .class file by checking it against a set of constraints or rules.
    //If verification fails for some reason, we get a VerifyException.
    //For example, if the code has been built using Java 11,
    //but is being run on a system that has Java 8 installed, the verification phase will fail.

    //PREPARATION
    //In this phase, the JVM allocates memory for the static fields of a class or interface,
    //and initializes them with default values.
    //For example, assume that you have declared the following variable in your class:
    //private static final boolean enabled = true;
    //During the preparation phase, JVM allocates memory for the variable enabled
    //and sets its value to the default value for a boolean, which is FALSE.

    //RESOLUTION
    //In this phase, symbolic references are replaced with direct references present in the runtime constant pool.
    //For example, if you have references to other classes or constant variables present in other classes,
    //they are resolved in this phase and replaced with their actual references.

    //INITIALIZATION****************************************************************************************************
    //Initialization involves executing the initialization method of the class or interface (known as <clinit>).
    //This can include calling the class's constructor, executing the static block,
    //and assigning values to all the static variables. This is the final stage of class loading.
    //For example, when we declared the following code earlier:
    //private static final boolean enabled = true;
    //The variable enabled was set to its default value of FALSE during the preparation phase.
    //In the initialization phase, this variable is assigned its actual value of TRUE.

}