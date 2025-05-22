package com.collectionsframework.map;

public class Main {

    //https://www.geeksforgeeks.org/map-interface-java-examples/?ref=gcse

    //MAP INTERFACE

    //******************************************************************************************************************
    //In Java, Map Interface is present in java.util package represents a mapping between a key and a value.
    //Java Map interface is not a subtype of the Collection interface.
    //Therefore, it behaves a bit differently from the rest of the collection types. A map contains unique keys.

    //Maps are perfect to use for key-value association mapping such as dictionaries.
    //The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.
    //******************************************************************************************************************

    //                                IMPLEMENTATIONS OF MAP INTERFACE

    //******************************************************************************************************************
    //HashMap, LinkedHashMap and TreeMap classes implement the Map interface.
    //******************************************************************************************************************


    //                               CHARACTERISTICS OF A MAP INTERFACE

    //******************************************************************************************************************
    //A Map cannot contain duplicate keys and each key can map to at most one value.
    //Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.

    //The order of a map depends on the specific implementations.
    //For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.

    //There are two interfaces for implementing Map in Java.
    //They are Map and SortedMap, and three classes: HashMap, TreeMap, and LinkedHashMap.
    //******************************************************************************************************************


    //                                     Methods in Java Map Interface

    //******************************************************************************************************************
    //clear() - This method is used in Java Map Interface to clear and remove all the elements.
    //************************************************

    //************************************************
    //containsKey(Object) - This method is used in Map Interface in Java to check whether a particular key is being mapped
    //                      into the Map or not. It takes the key element as a parameter
    //                      and returns True if that element is mapped in the map.
    //************************************************

    //************************************************
    //containsValue(Object) - This method is used in Map Interface to check whether a particular value is being mapped by a single
    //                        or more than one key in the Map. It takes the value as a parameter
    //                        and returns True if that value is mapped by any of the keys in the map.
    //************************************************

    //************************************************
    //entrySet() - This method is used in Map Interface in Java to create a set out of the same elements contained in the map.
    //              It basically returns a set view of the map or we can create a new set and store the map elements into them.
    //************************************************

    //************************************************
    //get(Object) - This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter.
    //              It returns NULL when the map contains no such mapping for the key.
    //************************************************

    //************************************************
    //keySet()- This method is used in Map Interface to return a Set view of the keys contained in this map.
    //          The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
    //************************************************

    //************************************************
    //put(Object, Object) - This method is used in Java Map Interface to associate the specified value with the specified key in this map.
    //************************************************

    //************************************************
    //putAll(Map) - This method is used in Map Interface in Java to copy all of the mappings from the specified map to this map.
    //************************************************

    //************************************************
    //remove(Object) - This method is used in Map Interface to remove the mapping for a key from this map if it is present in the map.
    //************************************************

    //************************************************
    //size() - This method is used to return the number of key/value pairs available in the map.
    //************************************************

    //************************************************
    //values() - This method is used in Java Map Interface to create a collection out of the values of the map.
    //It basically returns a Collection view of the values in the HashMap.
    //************************************************

    //************************************************
    //getOrDefault(Object key, V defaultValue) - Returns the value to which the specified key is mapped,
    //                                           or defaultValue if this map contains no mapping for the key.
    //************************************************

    //************************************************
    //merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction) - If the specified key is not already
    //                                                                                       associated with a value or is
    //                                                                                       associated with null, associate
    //                                                                                       it with the given non-null value.
    //************************************************


    //************************************************
    //putIfAbsent(K key, V value) - If the specified key is not already associated with a value (or is mapped to null)
    //                              associates it with the given value and returns null, else returns the current associate value.
    //******************************************************************************************************************


}
