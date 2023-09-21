package com.example.designPatterns.structure.proxy;

public class UserServiceImpl implements UserService {

    //Kapvac transaccianeri het
    //ete checked Exceptione throw linum aysinqn EXCEPTION class kam ira jarangner apa rallback chi linum
    //default transakcian rallbacka anum menak uncheked Runtime exceptionner@ ev Error ner@
    //dra hamar petqa config anel.    @Transactional(rollbackFor = Exception.class)
    //Transakcian naev chi ashxati ete method@ public chilini,anpayman public petqe lini


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

    public void itIsWillNotWork() {
        update();
        //ays methodi mejic erb kanchenq transactional method da nuynpes chi ashxati tranzakciayov
        //nuyn classi mejic erb kanchumes trnasactional method da chi ashxati
        //qani vor minjev ays method kanchel@ arden kanchvele ays classi proxy-n
        //ev proxy-i mejic kanchvyme ays method@,isk ays methodnel dimume ays classi update() methodin vorn aranc transaciaye
        //isk transactional method@ da proxy-i meji update methodne
    }

    @Override

    //@Transactional
    public void update() {
        System.out.println("User Created");
    }
}
