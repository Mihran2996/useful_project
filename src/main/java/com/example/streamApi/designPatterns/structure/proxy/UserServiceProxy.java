package com.example.streamApi.designPatterns.structure.proxy;

public class UserServiceProxy implements UserService {
    private UserService userService;

    @Override
    public void create() {
        //transaction.start()
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        userService.create();
        //transaction.commit()
    }

    @Override
    public void update() {
        //transactional.start()
        System.out.println("User Created");
        //transactional.commit()
    }
}
