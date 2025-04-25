package com.collectionsframework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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

//        public static void main(String[] args) {
//            // Custom Comparator that handles null keys
//            Comparator<String> nullFriendlyComparator = (s1, s2) -> {
//                if (s1 == null && s2 == null) return 0;
//                if (s1 == null) return -1; // null comes before non-null
//                if (s2 == null) return 1;  // non-null comes after null
//                return s1.compareTo(s2);
//            };
//
//            // TreeMap using the custom Comparator
//            TreeMap<String, String> map = new TreeMap<>(nullFriendlyComparator);
//
//            // Insert entries, including a null key
//            map.put(null, "Null Key Value");
//            map.put("Apple", "Fruit");
//            map.put("Banana", "Fruit");
//
//            // Print the TreeMap
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//            }
//        }

    //==========================================================================================================================

    //https://anmolsehgal.medium.com/fail-fast-and-fail-safe-iterations-in-java-collections-11ce8ca4180e#:~:text=Fail%2Dsafe%20iterators%20means%20they,modified%20while%20iterating%20over%20it.&text=As%20arrayLists%20are%20fail%2Dfast%20above%20code%20will%20throw%20an%20exception.
    //What do you understand by FAIL-FAST?    : ArrayList is fail-fast

    //that means that any changing of collection during iteration wil raise to ConcurrentModificationException
    //How does it happen??

    //Collections maintain an internal counter called modCount.
    //Each time an item is added or removed from the Collection, this counter gets incremented.

    //When iterating, on each next() call, the current value of modCount gets compared with the initial value.
    //If there’s a mismatch, it throws ConcurrentModificationException which aborts the entire operation.

//    public static void main(String[] args) {
//        List <String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//
//        //modCount=2
//        Iterator<String> iterator = list.iterator();// expectedModCount=modCount
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next()); // if(expectedModCount != modCount) throw new ConcurrentModificationException
//            list.add("Apple");  //modCount++
//        }
//
//    }

    //==========================================================================================================================

    //What do you understand by FAIL-SAFE?    : CopyOnWriteArrayList is fail-safe

    //Unlike the fail-fast iterators, these iterators traverse over the clone of the collection.
    //So even if the original collection gets structurally modified, no exception will be thrown.


    //So we clone original collection and each changes of original collection will not affect of clone
//    public static void main(String[] args) {
//        List <String> list = new CopyOnWriteArrayList<>();
//        list.add("A");
//        list.add("B");
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            list.add("Apple");
//        }
//
//    }

    //==========================================================================================================================

    //Can you use any class as a Map key?

    //We can use any object as a key in a Map, but there are some important considerations regarding how the object behaves when used as a key.

    //Override equals()
    //Override hashCode()
    //Make class Immutable

    //==========================================================================================================================

    //https://www.tutorialspoint.com/java/java_dictionary_class.htm
    //What is the Dictionary class?

    //It is class of Key, Value pairs representation lik a map,
    //it returns ENumeration which is Fail-Safe iterator

    //==========================================================================================================================

    //https://www.geeksforgeeks.org/how-to-make-an-arraylist-read-only-in-java/
    //How to make Java ArrayList Read-Only?

    //Collections.unmodifiableList(ArrayList);
    //Using List.of() (Java 9 and above)

    //==========================================================================================================================

    //What is the contract between hashCode and equals?

    //1. General Contract for equals():
    //The equals() method is used to compare two objects for equality. The contract for equals() is as follows:
    //
    //Reflexive: For any non-null reference x, x.equals(x) should return true.
    //
    //Symmetric: For any non-null references x and y, if x.equals(y) is true, then y.equals(x) must also be true.
    //
    //Transitive: For any non-null references x, y, and z, if x.equals(y) and y.equals(z) are both true, then x.equals(z) must also be true.
    //
    //Consistent: For any non-null references x and y, if x.equals(y) is called multiple times during the execution of the program, it should consistently return the same result (if no properties of x or y are modified).
    //
    //Null comparison: For any non-null reference x, x.equals(null) should return false.


    //2. General Contract for hashCode():
    //The hashCode() method returns an integer that represents the hash code value of an object. The contract for hashCode() is as follows:
    //
    //Consistent: If an object is not modified, multiple invocations of hashCode() should consistently return the same value.
    //
    //Equality consistency: If two objects are considered equal by the equals() method (i.e., x.equals(y) is true), then x.hashCode() must be equal to y.hashCode().
    //
    //Unequal objects: If two objects are not considered equal (i.e., x.equals(y) is false), the hashCode() values may or may not be different.
    //However, it is better if they are different to improve the performance of hash-based collections (but this is not required by the contract).

    //Summary of the Contract:
    //Equal objects must have equal hash codes.
    //
    //Unequal objects can have the same or different hash codes.

    //IMPORTANT
    //If you do not override the equals() method in Java,
    //the default behavior of equals() (inherited from the Object class) will simply compare reference equality (i.e., whether two references point to the same object in memory).
    //This means that two objects with the same data or content will be considered not equal unless they are actually the same object (i.e., they have the same memory reference).

    //EXAMPLE

    //public class Person {
    //    private String name;
    //    private int age;
    //
    //    public Person(String name, int age) {
    //        this.name = name;
    //        this.age = age;
    //    }
    //}
    //
    //public class Main {
    //    public static void main(String[] args) {
    //        Person person1 = new Person("Alice", 30);
    //        Person person2 = new Person("Alice", 30);
    //
    //        System.out.println(person1.equals(person2));  // false
    //    }
    //}
    //==========================================================================================================================

    //When should we override hashcode and equals?
    //When your class will be used as a key in a Map

    //==========================================================================================================================

    //How hashcode should be overriden?

    //public class Person {
    //    private String name;
    //    private int age;
    //
    //    public Person(String name, int age) {
    //        this.name = name;
    //        this.age = age;
    //    }
    //
    //    @Override
    //    public boolean equals(Object obj) {
    //        if (this == obj) return true;  // Same reference
    //        if (obj == null || getClass() != obj.getClass()) return false;  // Null or different class
    //        Person person = (Person) obj;  // Cast to correct type
    //        return age == person.age && Objects.equals(name, person.name);  // Compare contents
    //    }
    //
    //    @Override
    //    public int hashCode() {
    //        return Objects.hash(name, age);  // Consistent with equals()
    //    }
    //}

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
