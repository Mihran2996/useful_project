package com.collectionsframework.differenceBetween.hashmapVShashtable;

import java.util.*;

public class Main {

    //What is the difference between HashMap and Hashtable?

    //The HashMap object is threaded unsafe since it is unsynchronized.
    //A key can only return Null once, whereas a value may return Null several times.
    //because there is condition if key is null so the data will keep to specific backet
    //HashMap has a capacity of 16 by default.
    //We can modify to synchronized map calling  Collections.synchronizedMap method
    //Extended from AbstractMap

    //Hashtable is synchronised, hence the Hashtable object is thread safe Keys/Value.
    //Hashtable's default starting capacity is 11.
    //Key and Value cannot be a null, in put method there is checker like :
    // if (value == null) {
    //        throw new NullPointerException();
    // }
    //and there is not checker for key and here we will get exception:   int hash = key.hashCode();
    //We can not asynchronized hashTable
    //Extended from Dictionary

    //Both of them fail-fast that menas that they throw ConcurrentModificationException if some element would be changed during iteration
    //EXAMPLE
    public static void main(String[] args) {

        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Key1", 1);
        hashtable.put("Key2", 2);
        hashtable.put("Key3", 3);

        Runnable it  = () -> {
            try {
                Iterator<String> iterator = hashtable.keySet().iterator();
                while (iterator.hasNext()) {
                    Thread.sleep(1000);
                    System.out.println(iterator.next());
                }
                System.out.println("woke up");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable modify = () -> {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hashtable.put("Key4", 4);
            System.out.println("remove key");
        };

        new Thread(it).start();
        new Thread(modify).start();
    }
}
