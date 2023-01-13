package com.example.streamApi.MultiTherading.dataRace;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        ThreadOne threadOne = new ThreadOne(example);
        ThreadTwo threadTwo = new ThreadTwo(example);
        Thread thread = new Thread(threadOne);
        Thread thread2 = new Thread(threadTwo);

        thread.start();
        thread2.start();
        //erbvor erku thread ashxatumen mi popoxakani het ev sxal texekutyunen stanum resourceic
        //erku thread@ arden miajamank chen haxordakcvi resource-i het qano vor unenq arden synchronized methodner
    }
}
