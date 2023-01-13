package com.example.streamApi.designPatterns.structure.proxy;

public class UserServiceImpl implements UserService {

    @Override
    //@Transactional
    public void create() {
        System.out.println("User Created");
        update();
        //kanchumenq update method@ vori vra nuynpes ka transactional annotation@
        //bayc update method@ texi kunena aranc transacciayi
        //qani vor@ stexcvume prox@,ev ir mej stexcume UserService userServiceImpl object
        //erb kanchumenq userServiceImpl-i create method@ irakanum kanchvume userServiceProxy-i create method@
        //proxy-i create method@ stexcume transakcia nor kanchume userServiceImpl.create() method@ ,aysinqn arden sa
        //ev hetevapar es methodi mej mtnelov kkanchi ays service update() method@,vorn aranc tranzakciaye.
        //ev texi chi unena transakciya vorovhetev chi kanchvume proxyUserServiceImpl.update();
    }

    @Override
    //@Transactional
    public void update() {
        System.out.println("User Created");
    }
}
