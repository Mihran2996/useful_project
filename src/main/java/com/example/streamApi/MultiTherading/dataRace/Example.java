package com.example.streamApi.MultiTherading.dataRace;

public class Example {

    int i = 0;

    public  void incrementInteger() {
        i++;
    }

    public  void getInteger() {
        System.out.println(i);
    }

}
