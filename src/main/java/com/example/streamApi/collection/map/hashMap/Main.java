package com.example.streamApi.collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //https://www.java67.com/2013/02/10-examples-of-hashmap-in-java-programming-tutorial.html
    //https://levelup.gitconnected.com/how-does-hashmap-work-internally-612dd950822f
    //https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
    //https://www.javatpoint.com/working-of-hashmap-in-java
    //https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html#axzz84M8eE9tj

    //collision        https://www.youtube.com/watch?v=-oafFAPgLao

    //******************************************************************************************************************

    //                                          BIG O COMPLEXITY IN ARRAYLIST

    //As we know, HashMap internally uses hash code as a base for storing key-value pairs.
    //If the hashCode() method is well-written, HashMap will distribute the items across all the buckets.
    //Therefore, HashMap stores and retrieves entries in constant time O(1).
    //if there is a collision the searching will be O(logN)
    //******************************************************************************************************************

    //                                    HASHMAP INTERNAL WORKING

    //******************************************************************************************************************

    //                                     put() method of hashMap

    //When we pass Key and Value object to put() method on Java HashMap,
    //HashMap implementation calls hashCode method on Key object and applies returned hashcode into its own hashing function
    //to find a bucket location for storing Entry object, the important point to mention is that HashMap in Java stores both
    //key and value object as Map.Entry in a bucket is essential to understand the retrieving logic.

    //after call map.put(Object key, Object value) - is called hash (Object key) method, that computes and get index of bucket using
    // hashCode of key, and the result will be less than capacity ` 16

    //static final int hash(Object key) {
    //        int h;
    //        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    //    }
    //******************************************************************************************************************

    //******************************************************************************************************************

    //                           Capacity is the number of buckets in the HashMap

    //The initial capacity is the capacity at the time the Map is created. Finally, the default initial capacity of the HashMap is 16.
    //As the number of elements in the HashMap increases, the capacity is expanded.
    //The load factor is the measure that decides when to increase the capacity of the Map. The default load factor is 75% of the capacity.

    //Here is the structure of our Map:

    //Map<String, String> mapWithDefaultParams = new HashMap<>();
    //mapWithDefaultParams.put("1", "one");
    //mapWithDefaultParams.put("2", "two");
    //mapWithDefaultParams.put("3", "three");
    //mapWithDefaultParams.put("4", "four");

    //As we see, our HashMap was created with the default initial capacity (16) and the default load factor (0.75).
    //modCount = 4 it means there are 4 object in the map
    //Also, the threshold is 16 * 0.75 = 12,
    //which means that it will increase the capacity from 16 to 32 after the 12th entry (key-value-pair) is added.
    //******************************************************************************************************************

    //                           Custom Initial Capacity and Load Factor

    //In the previous section, we created our HashMap with a default constructor.
    //In the following sections, we'll see how to create a HashMap passing the initial capacity and load factor to the constructor.

    //Map<String, String> mapWithInitialCapacity = new HashMap<>(5);
    //It will create an empty Map with the initial capacity (5) and the default load factor (0.75).
    //******************************************************************************************************************

    //                             With Initial Capacity and Load Factor

    //Similarly, we can create our Map using both initial capacity and load factor:

    //Map<String, String> mapWithInitialCapacityAndLF = new HashMap<>(5, 0.5f);
    //Here, it will create an empty Map with an initial capacity of 5 and a load factor of 0.5.
    //******************************************************************************************************************

    //                                      Collision

    //https://www.youtube.com/watch?v=-oafFAPgLao

    //Collisions may occur due to a bad hash code algorithm and often slow down the performance of the Map.
    //Prior to Java 8, HashMap in Java handles collision by using LinkedList to store map entries.
    //If a key ends up in the same bucket where another entry already exists, it's added at the head of the LinkedList.
    //In the worst case, this will increase complexity to O(n).

    //To avoid this issue, Java 8 and later versions use a balanced tree (also called a red-black tree) instead of a LinkedList to store collided entries
    //This improves the worst-case performance of HashMap from O(n) to O(log n).

    //******************************************************************************************************************

    //                             General Contracts for hashCode() in Java

    //1) If two objects are equal by the equals() method then their hashcode returned by the hashCode() method must be the same.

    //2) Whenever the hashCode() method is invoked on the same object more than once within a single execution of the application,
    //hashCode() must return the same integer provided no information or fields used in equals and hashcode is modified.

    //3) If two objects are not equaled by the equals() method it is not required that their hashcode must be different.
    //******************************************************************************************************************

}
