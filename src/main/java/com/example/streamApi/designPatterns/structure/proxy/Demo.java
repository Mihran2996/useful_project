package com.example.streamApi.designPatterns.structure.proxy;

public class Demo {
    public static void main(String[] args) {

        //Proxy-n ogtagorcvume erb petqa mecacnel classi funkcionalutyun@ bayc chpopoxelov tvyal class@
        UserService userService = new UserServiceProxy();

        userService.create();

    }
}
