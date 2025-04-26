package com.collectionsframework.differenceBetween.arrayVsarraylist;

public class main {

    //https://medium.com/@AlexanderObregon/java-arrays-and-arraylists-a-comparative-look-bcbc97b32a1e#:~:text=Arrays%3A%20Generally%20faster%20for%20basic,possible%20resizing%2C%20and%20data%20copying.

    //What is the difference between Array and ArrayList?

    //Array
    //Characteristics of Arrays
    //Fixed Size: Once an array is created, its size cannot be changed.This static size is both an advantage and a limitation.
    //Performance: Arrays have a constant time complexity for basic operations like accessing and updating an element at a specific index.
    //This makes them very efficient for operations where the number of elements is known and doesn’t change.

    //Type-Safety and Homogeneity: Arrays can only store one type of element.
    //For instance, an int[] array will only accept integers. This type safety helps prevent runtime errors and ensures more predictable behavior of the array.

    //Limitations of Arrays
    //Inflexibility in Size Adjustment: The inability to resize an array is one of its main limitations.
    //If you need a collection whose size can change dynamically, you must opt for another data structure like an ArrayList.



    //ArrayList
    //Characteristics of ArrayLists
    //Dynamic Sizing: ArrayLists can grow and shrink dynamically, offering more flexibility when dealing with collections of varying sizes.
    //Ease of Manipulation: High-level operations like adding, removing, searching, and updating elements are straightforward with ArrayLists.
    //Generics for Type Safety: ArrayLists use Generics, ensuring that only the specified type of objects are stored, which helps in reducing runtime errors.

    //Performance Considerations
    //While ArrayLists offer more flexibility than arrays, this comes at the cost of a slight decrease in performance,
    //especially when the list size is modified frequently. This is because, internally, the ArrayList needs to resize and possibly copy the entire array to a new array.

    //==================================================================================================================

    //Similarities
    //Store Elements: Both can store multiple elements, making them useful for handling collections of items.
    //Indexed Access: Elements in both arrays and ArrayLists can be accessed using indices.
    //Iterable: Both can be iterated over using loops.

    //==================================================================================================================

    //Differences
    //Size Flexibility
    //
    //Arrays: Fixed in size. Once an array is created, its size cannot be changed.
    //ArrayLists: Dynamic in size. They can grow and shrink during runtime.

    //Performance
    //
    //Arrays: Generally faster for basic operations like accessing and updating elements, due to their fixed size and direct memory allocation.
    //ArrayLists: Slightly slower, especially when resizing is involved, due to the overhead of checking size, possible resizing, and data copying.

    //Type of Elements
    //
    //Arrays: Can hold both primitives (like int, char) and objects (like String, Integer).
    //ArrayLists: Can only hold object elements. They cannot store primitive types directly.

    //Memory Usage
    //
    //Arrays: More memory efficient for storing large numbers of elements, as they have a lower memory overhead.
    //ArrayLists: Have additional memory overhead due to the dynamic resizing capability and storage of object references.

}


