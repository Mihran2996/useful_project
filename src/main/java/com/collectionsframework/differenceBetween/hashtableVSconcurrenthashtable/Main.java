package com.collectionsframework.differenceBetween.hashtableVSconcurrenthashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    //https://www.geeksforgeeks.org/difference-between-concurrenthashmap-hashtable-and-synchronized-map-in-java/

    //What is the difference between HashTable and ConcurrentHashMao

    //HashTable
    //Null is not allowed for both keys and values.
    //Iterator of HashTable FAIL-FAST and it will raise ConcurrentModificationException
    //We will get thread safety by locking the whole map object
    //At a time one thread is allowed to operate on a map object.
    //Introduce in java 1.0version
    //Extended from Dictionary


    //ConcurrentHashMao
    //Null is not allowed for both keys and values.
    //Iterator of ConcurrentHashMap is FAIL-SAFE and won’t raise ConcurrentModificationException
    //We will get thread safety without locking the total map object just with a bucket level lock.
    //At a time multiple threads are allowed to operate on map objects safely.
    //Introduce in java 1.5version
    //Extended from AbstractMap

    public static void main(String[] args) {

        Map<String, Integer> hashtable = new ConcurrentHashMap<>();
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
