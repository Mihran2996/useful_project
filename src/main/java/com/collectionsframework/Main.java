package com.collectionsframework;

import java.util.*;

public class Main {

    //Explain various interfaces used in Collection framework?

    //                                     Iterable<E>
    //                                          |
    //                                    Collection<E>
    //       --------------------------------------------------------------
    //       |                                  |                         |
    //     List<E>                            Set<E>                 Queue<E>
    //       |                                  |                         |
    //  ----------------------          ---------------------          --------------------
    //  |           |       |               |           |                 |           |
    //ArrayList LinkedList Vector       HashSet    LinkedHashSet      PriorityQueue ArrayDeque
    //        Stack                         |
    //                                 SortedSet<E>
    //                                      |
    //                                NavigableSet<E>
    //                                      |
    //                                   TreeSet


    //Iterable<E>
    //Top-level interface; allows using for-each loop, returns Iterator
    //has forEach(Consumer<? super T> action) and default Spliterator<T> spliterator() methods, added in version java 1.8

    //Collection<E> extends Iterable<E>
    //Root of the collection hierarchy

    //List<E>
    //Ordered collection, allows duplicates

    //Set<E>
    //Unordered collection, no duplicates

    //Queue<E>
    //FIFO order, used for holding elements prior to processing

    //                             MAP
    //                            Map<K, V>
    //        -------------------------------------------------
    //        |                     |                        |
    //     HashMap<K, V>     SortedMap<K, V>            Hashtable<K, V>
    //        |                     |
    //  LinkedHashMap<K, V>   NavigableMap<K, V>
    //                              |
    //                          TreeMap<K, V>

    //Map<K, V> (Interface)
    //Represents a collection of key-value pairs
    //Does not extend Collection
    //Keys must be unique, values can be duplicated

    //Subinterfaces:
    //SortedMap<K, V>
    //Maintains keys in natural order or with a comparator

    //NavigableMap<K, V> (extends SortedMap)
    //Adds navigation methods like lowerKey(), ceilingEntry(), etc.



    //HashMap<K, V>
    //Most commonly used
    //Allows one null key and multiple null values

    //LinkedHashMap<K, V>
    //Maintains insertion order

    //TreeMap<K, V>
    //Implements NavigableMap
    //Keys are sorted
    //No null keys allowed'

    //Hashtable<K, V>
    //Legacy class
    //Synchronized (thread-safe but slower)
    //No null keys or values

    //==========================================================================================================================

    //https://medium.com/@avinashsoni9829/enumeration-iterator-internals-java-internals-part-5-c106b93e8a5c
    //https://www.geeksforgeeks.org/enumeration-interface-in-java/
    //What is Enumeration?

    //Enumeration is a legacy interface used to iterate over collections — mostly used with older classes like Vector and Hashtable.
    //It provides a way to sequentially access elements in a collection

    //Method	                      Description
    //boolean hasMoreElements()	      Returns true if more elements are available
    //E nextElement()	              Returns the next element in the sequence

    //Important Notes:
    //Enumeration is read-only: you can't remove elements during iteration.

    //==========================================================================================================================

    //Can set contain null values?

    //1. HashSet
    //Allows one null element
    //each time adding null value it will be overwritten and keep under first index,
    //because under hood works map, and there is operating hashing algorithm and the hashcode of null is ZERO

    //LinkedHashSet
    //Also allows one null element, same as HashSet only maintains insertion order

    //TreeSet
    //Does not allow null
    //Throws NullPointerException if you try to add null, because it uses natural ordering (or a comparator)

    //TreeSet uses comparisons (via Comparable or Comparator), and null can’t be compared to other values, so it's not allowed.

    //==========================================================================================================================

    //https://abhimanyu081.medium.com/how-java-hashmap-handles-null-keys-and-null-values-67b7cf7c1f95
    //How many null keys and values can HashMap contain?

    //✅ HashMap and null Handling
    // Null Keys:
    //HashMap allows one null key
    //Why only one? Because keys must be unique, and null is treated like any other key.
    //Internally, it's stored in a special bucket when the key is null the bucket is ZERO.
    //The hashCode of null iz zero

    // Null Values:
    //HashMap allows multiple null values
    //There's no restriction on how many values can be null.
    //==========================================================================================================================

    //How do you traverse HashMap?

    //example
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 3);
//
//        //1. Using entrySet() with enhanced for-loop (Most common)
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }
//
//        // 2. Using keySet() to iterate keys
//        for (String key : map.keySet()) {
//            System.out.println(key + " => " + map.get(key));
//        }
//
//        //3. Using values() to iterate values only
//        for (Integer value : map.values()) {
//            System.out.println("Value: " + value);
//        }
//
//        //4. Using Iterator with entrySet()
//        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, Integer> entry = it.next();
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
//
//        //5. Using forEach() method (Java 8+)
//        map.forEach((key, value) -> {System.out.println(key + " => " + value);});
//    }

    //==========================================================================================================================

    //Can TreeMap contain null value?

    //TreeMap and null Values
    //Allowed: You can store as many null values as you want.

    //TreeMap and null Keys
    //Not allowed: TreeMap throws a NullPointerException if you try to insert a null key unless you're using a custom Comparator that can handle null.
    //Why? Because TreeMap uses the natural ordering of keys or a comparator — and comparing null with other keys is not allowed.

    //Example with custom comparator

        public static void main(String[] args) {
            // Custom Comparator that handles null keys
            Comparator<String> nullFriendlyComparator = (s1, s2) -> {
                if (s1 == null && s2 == null) return 0;
                if (s1 == null) return -1; // null comes before non-null
                if (s2 == null) return 1;  // non-null comes after null
                return s1.compareTo(s2);
            };

            // TreeMap using the custom Comparator
            TreeMap<String, String> map = new TreeMap<>(nullFriendlyComparator);

            // Insert entries, including a null key
            map.put(null, "Null Key Value");
            map.put("Apple", "Fruit");
            map.put("Banana", "Fruit");

            // Print the TreeMap
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

    //==========================================================================================================================

}
