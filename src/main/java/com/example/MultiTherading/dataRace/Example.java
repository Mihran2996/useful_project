package com.example.MultiTherading.dataRace;

public class Example {

    int i = 0;

    public   void incrementInteger() {
        i++;
        System.out.println("incremented +" + i);
    }

    public  void getInteger() {
        System.out.println(i);
    }

}
