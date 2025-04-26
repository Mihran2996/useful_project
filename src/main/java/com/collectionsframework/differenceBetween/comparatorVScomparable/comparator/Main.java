package com.collectionsframework.differenceBetween.comparatorVScomparable.comparator;

import com.collectionsframework.differenceBetween.comparatorVScomparable.comparator.model.User;
import com.collectionsframework.differenceBetween.comparatorVScomparable.comparator.sort.IdComparator;
import com.collectionsframework.differenceBetween.comparatorVScomparable.comparator.sort.NameComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/java-comparator-interface/
        //Comparator is used if we want to sort object in multiple field

        User user = new User(8, "armen", "poxosyan");
        User user2 = new User(2, "petros", "petrosyan");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);

        userList.sort(new IdComparator());

        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        Collections.sort(userList, new NameComparator());

        Iterator<User> iterator2 = userList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println();


        Set<User> set = new TreeSet<>(new NameComparator() {});
        set.add(user);
        set.add(user2);

        set.forEach(System.out::println);
    }
}
