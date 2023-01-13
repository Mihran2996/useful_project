package com.example.streamApi.comparatorAndComparable.comparatorExample;


import java.util.Comparator;

public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {

        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
