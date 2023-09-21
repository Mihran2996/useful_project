package com.example.comparatorAndComparable.comparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Comparator@ sortavorelu hamar ogtagorcume compare(Object o, Object o2) method@
        //Comparator@ uni shat methodner,ev karoxe sortavorel bazmaki objectnerov

        User user = new User(8, "armen", "poxosyan");
        User user2 = new User(2, "petros", "petrosyan");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);

        //sortavorumenq tvyal Userneri list@ @st Age-i
        Collections.sort(userList, new IdComparator());

        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        //sortavorumenq tvyal Userneri list@ @st Name-i
        Collections.sort(userList, new NameComparator());

        Iterator<User> iterator2 = userList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


    }
}
