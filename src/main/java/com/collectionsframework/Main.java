package com.collectionsframework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

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

    //How to convert ArrayList to Array and Array to ArrayList?

//    public static void main(String[] args) {
//
//        //if array is primitive type
//        int [] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
//
//        //We can use Stream and mapping it to Collection
//        List<Integer> collectedToList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
//        System.out.println(collectedToList);
//
//        int[] array = collectedToList.stream().mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.toString(array));
//
//        //================================================
//
//        //if array is Object type
//
//        Integer [] objectArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
//
//        //Using Arrays.asList([])
//        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(objectArray));
//        System.out.println(integers);
//
//        Integer[] array1 = integers.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array1));
//    }


    //==========================================================================================================================

    //The complete hierarchy of collections framework

    //                                 Iterable (interface)
    //                                         |
    //                                         ↓
    //                                 Collection (interface)
    //                                         |
    //        -------------------------------------------------------------
    //        |                                |                          |
    //       List                             Set                   Queue (interface)
    //     (interface)                     (interface)           (interface, since Java 1.5)
    //        |                                |                          |
    //    --------------------             ------------               ----------------------------------------------------------------------
    //    |        |         |             |          |               |                              |                                     |
    //ArrayList LinkedList Vector        HashSet  SortedSet          PriorityQueue                 Deque                             BlockingQueue
    // (class)   (class)   (class)       (class)  (interface)         (class)                   (interface)                          |           |
    //                    /                          |                                 ---------------------------        ArrayBlockingQueue   LinkedBlockingQueue
    //                Stack                     LinkedHashSet                          |           |             |
    //               (class)                      (class)                         ArrayDeque   LinkedList  ConcurrentLinkedDeque
    //                                               |                                             |
    //                                             TreeSet                                  LinkedBlockingDeque
    //                                             (class)

    //==========================================================================================================================

    //What do you understand by BlockingQueue?

    //A BlockingQueue is a special kind of Queue in Java where:
    //
    //When you try to add an element and the queue is full,
    //→ it will wait (block) until space becomes available.
    //
    //When you try to remove an element and the queue is empty,
    //→ it will wait (block) until an element becomes available.

    //==========================================================================================================================

    //Why vectors and hashtables are not recommended to use?

    //They are synchronized for thread-safety at method level, which is very inefficient.
    //public synchronized void addElement(E e) {
    //    list.add(e);
    //    System.out.println("Added " + e);
    //}

    //public void addElement(E e) {
    //    synchronized (this) {
    //        list.add(e); // only this is critical
    //    }
    //    System.out.println("Added " + e); // no need to lock this
    //}



    //Even if you're using it in a single thread (no concurrency), Vector/Hashtable still lock methods — slowing performance for no reason.

    //Today, you can use ArrayList instead of Vector, and HashMap instead of Hashtable.
    //Modern classes like ArrayList, HashMap, and ConcurrentHashMap offer better, cleaner, faster APIs.

    //==========================================================================================================================

    //https://www.geeksforgeeks.org/stack-class-in-java/
    //What is the Stack class in Java and what are the various methods provided by it?

    //The class is based on the basic principle of LIFO (last-in-first-out).
    //The Stack class extends Vector
    //he Stack class can be considered as a subclass of Vector because it inherits all of its methods and properties.

    //Methods
    //push: This method pushes an element on the top of the stack.
    //pop: This method removes and returns the top element of the stack.An exception is thrown if we call pop() when the invoking stack is empty.
    //peek: This method returns the element on the top of the stack, but does not remove it.
    //empty: This method returns true if nothing is on the top of the stack. Else, returns false.
    //search: This method is used to determine whether an object exists in the stack. If the element is found, It returns the position of the element from the top of the stack. Else, it returns -1.

    //==========================================================================================================================

    //What is the load factor?

    //threshold that helps decide when the internal storage (bucket array) of a HashMap or Hashtable should be expanded.

    //⚡ Default Values:
    //Default load factor: 0.75
    //
    //This means that the table will resize when it is 75% full.
    //
    //Default initial capacity: 16
    //
    //So, if you insert more than 12 entries (16 * 0.75), the HashMap or Hashtable will resize (grow to the next power of 2, i.e., 32).


    //We can pass initialCapaCity and loadFactor:   new HashMap(30, 0.85f)

    //Operation	                       Size (entries)	 Threshold (16 * 0.75)	  Action
    //Initially	                         0	                  12	                —
    //Add first 12 entries          	 12                   12            	  Resize
    //After resizing (capacity 32)       12                   24	                —

    //==========================================================================================================================

    //How do HashSet and HashMap work internally?

    //How HashSet Works Internally:
    //HashSet is a set implementation backed by a HashMap.
    //It doesn't allow duplicate elements, and it is based on hashing for fast lookups.
    //
    //HashSet internally uses a HashMap to store elements, where each element is stored as the key.
    //
    //The value associated with each key is a constant (new Object()) because in a set, we only care about the presence of the element, not the value.
    //
    //Why HashMap?
    //
    //The HashSet relies on HashMap because HashMap stores key-value pairs in a hashed bucket structure, which allows for fast O(1) lookup, insertion, and deletion (on average).
    //
    //How Does It Handle Duplicates?
    //
    //When you add an element to the HashSet, it checks the HashMap for the key:
    //
    //If the key already exists in the HashMap, the HashSet will not add it (since sets don't allow duplicates).
    //
    //If the key doesn't exist, it adds the key to the HashMap with a dummy value (Boolean.TRUE).
    //
    //Hashing:
    //
    //The HashMap uses hashing to distribute the elements across buckets, ensuring quick lookup, insertion, and removal.



    //https://dev.to/abhishek_kumar_d9009a7ae6/internal-working-of-hashmap-2n28#:~:text=Summary%20of%20HashMap's%20Internal%20Working,load%20factor%20threshold%20is%20reached.
    //How HashMap Works Internally:
    //HashMap is a key-value pair data structure based on hashing. It’s a hash table with buckets, where each bucket is a linked list or tree (since Java 8) for handling hash collisions.
    //
    //Hashing and Buckets:
    //
    //Each entry in a HashMap consists of a key and a value.
    //
    //The key is hashed using the hashCode() method, and the hash value determines which bucket the entry is stored in.
    //
    //Buckets are array slots (each bucket can hold multiple entries in case of hash collisions).
    //
    //Handling Collisions:
    //
    //If two keys have the same hash code, they will be placed in the same bucket.
    //
    //For Java 8+, LinkedLists are used to store colliding entries, but if the collision chain grows too long, it’s converted to a balanced tree (a TreeNode structure) for better performance.
    //
    //Operations:
    //
    //Put (Insertion): When a new key-value pair is added, it is hashed to determine the appropriate bucket. If the key already exists in that bucket, the value is updated. Otherwise, a new entry is added.
    //
    //Get (Lookup): To find a value, the key is hashed, and the appropriate bucket is searched for the key.
    //
    //Remove (Deletion): The key is hashed, and the appropriate bucket is searched to remove the entry.
    //
    //Rehashing:
    //
    //As more entries are added and the load factor (e.g., 0.75) is exceeded, the HashMap doubles its capacity and rehashes all existing entries into the new bucket array to maintain efficient operations.

    //==========================================================================================================================

    //https://medium.com/codex/hash-tables-hashing-and-collision-handling-8e4629506572#:~:text=Two%20or%20more%20keys%20can,the%20same%20hash%20function%20values.
    //What is hash-collision in Hashtable and how it is handled in Java?

    //A hash collision occurs when two different keys in a hash table (like a Hashtable or HashMap) produce the same hash code.
    //In other words, the hash function generates the same bucket index for two distinct keys.

    //How is Hash Collision Handled in a Hashtable?
    //Old Way (before Java 8):
    //When a collision occurs, entries are stored as a linked list within the same bucket. Each entry in the linked list contains a key-value pair.

    //Java 8 and later:
    //If the number of collisions within a single bucket becomes too high (i.e., the linked list is long),
    //the linked list is converted into a balanced tree (red-black tree).
    //This helps improve the performance of searching from O(n) to O(log n) in the worst case for buckets with many collisions.

    //==========================================================================================================================

    //https://www.geeksforgeeks.org/introduction-to-red-black-tree/#what-is-a-redblack-tree
    //https://medium.com/@krisbachan123/red-black-tree-why-you-should-be-using-it-63656e68bf53
    //https://www.cs.usfca.edu/~galles/visualization/RedBlack.html

    //What is red black tree?
    //A red-black tree is a type of self-balancing binary search tree (BST) that ensures efficient search, insertion,
    //and deletion operations by maintaining specific properties related to node coloring and balancing.
    //It is widely used in various applications where performance is critical, such as in Java's Map

    //Key Features of a Red-Black Tree
    //A red-black tree has five key properties that help maintain its balanced nature:
    //
    //Each node is either red or black:
    //
    //Every node in the tree must be assigned one of two colors: red or black. This color helps the tree maintain its balance.
    //
    //The root is always black:
    //
    //The root of the tree must always be black, which helps maintain the tree’s balance from the top down.
    //
    //All leaf nodes are black:
    //
    //In red-black trees, leaf nodes are always black. These are the external nodes, which are represented as NIL or NULL in the actual implementation.
    //
    //Red nodes cannot have red children:
    //
    //If a node is red, then its children must be black. This property ensures that the tree is balanced and prevents it from becoming too deep in one section (which could make searching inefficient).

    //==========================================================================================================================

    //Big o notation for arraylist and linkedlist methods and how do you compute it?

    //ArrayList
    //Add: O(1) (amortized, because it occasionally resizes)
    //
    //Get: O(1)
    //
    //Remove: O(n) (because elements may need to be shifted)
    //
    //Insert: O(n) (shifting of elements might be needed)
    //
    //LinkedList
    //Add: O(1) (at the head or tail)
    //
    //Get: O(n) (because traversal is needed)
    //
    //Remove: O(1) (at the head or tail)
    //
    //Insert: O(n) (inserting at an arbitrary position)
    //
    //HashMap
    //Put (Insert): O(1) (amortized, unless there's a hash collision)
    //
    //Get: O(1) (amortized)
    //
    //Remove: O(1) (amortized)
    //
    //Search (Contains): O(1) (amortized)
    //
    //Worst-case: O(n) (when hash collisions occur)
    //
    //TreeMap
    //Put (Insert): O(log n)
    //
    //Get: O(log n)
    //
    //Remove: O(log n)
    //
    //Search (Contains): O(log n)
    //
    //HashSet
    //Add: O(1) (amortized)
    //
    //Remove: O(1) (amortized)
    //
    //Contains: O(1) (amortized)
    //
    //Worst-case: O(n) (when hash collisions occur)
    //
    //TreeSet
    //Add: O(log n)
    //
    //Remove: O(log n)
    //
    //Contains: O(log n)


    //Summary of Operations:
    //
    //CollectionType	   Add	       Get	        Remove	   Insert 	   Search
    //ArrayList    	       O(1)	       O(1)	        O(n)	    O(n)	    O(n)
    //LinkedList	       O(1)	       O(n)	        O(1)	    O(n)	    O(n)
    //HashMap	           O(1)	       O(1)	        O(1)	    O(1)	    O(1)
    //TreeMap	           O(log n)    O(log n)  	O(log n)	O(log n)	O(log n)
    //HashSet	           O(1)	       O(1)	        O(1)	    O(1)	    O(1)
    //TreeSet	           O(log n)    O(log n)	    O(log n)    O(log n)	O(log n)

    //==========================================================================================================================

}
