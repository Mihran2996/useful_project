package com.serialisation;

import com.serialisation.exam.Person;
import com.serialisation.util.User;
import com.serialisation.util.UserDefense;

import java.io.*;
import java.util.Date;

public class Main {

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
//        //here we change date and it affects to user object
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
//        //here we change date and it does not affects to user object
//        birthDay2.setTime(1);
//
//        System.out.println(birthDay2);
//        System.out.println(user2);
//    }
    //==========================================================================================================================

    //https://medium.com/javarevisited/understanding-serialversionuid-in-java-07df4c57fc86
    //What is SerialVersionUID

    //During serialization process if we did not define serialVersionId the compiler will create it compile time
    //If the object was modified (added new field, removed, changed), the version ov serialVersionId will be changed
    //During deSerialization versionIds from loaded object and object to cast will not be equal and we will get an exception

    //==========================================================================================================================


}
