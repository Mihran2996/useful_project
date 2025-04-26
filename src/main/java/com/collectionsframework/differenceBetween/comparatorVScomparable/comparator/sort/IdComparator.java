package com.collectionsframework.differenceBetween.comparatorVScomparable.comparator.sort;


import com.collectionsframework.differenceBetween.comparatorVScomparable.comparator.model.User;

import java.util.Comparator;

public class IdComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }
}
