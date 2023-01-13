package com.example.streamApi.designPatterns.structure.proxy;

public class Demo {
    public static void main(String[] args) {

        UserService userService = new UserServiceProxy();

        userService.create();

    }
}
