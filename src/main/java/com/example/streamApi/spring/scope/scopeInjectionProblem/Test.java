package com.example.streamApi.spring.scope.scopeInjectionProblem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        //ete singleton beani mej injectenq anum prototype bean apa conflict klini
        //user@ singletone,isk ira mej inject ka arac Book vor@ vor prototype
        //aysinqn @st tramabanutyan 2 tarber userneri meji book@ petqe havasar chlinen irar qani vor book@ prototype
        //bayc aydpes che spring@ erb injecte anum bean@ singletone sarqum,dra hamar havasaren

        //ktpi true,useri meji book objectner@ nuynn en
        // createAndCheck();


        //xndir@ uni 3 tarberakov lucum
        //1-  arajin@ lucvele proxy-i ognutyam book classi mej scope anotaciayi mej proxyMode attribute-i shnorhiv,
        // objectner@ tarberen ,iranc hashCode-@ nuynpes tarbere bayc == stugman depqum true e

//         createAndCheckWithProxyMode();


        //2 - erkrord@ @lookUp metodi shnorhiv,vori depqum == stugman depqum false
        //ays depqum booker@ tarber klinen

//        createAndCheckWithLookUp();

        //3- errrod tarberak@ uxxaki contextic karel;ie book-in hanel dus;
        createAndCheckWithGetContext();
    }


    private static void createAndCheckWithProxyMode() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class, Book.class);
        User user = context.getBean(User.class);
        User user2 = context.getBean(User.class);

        System.out.println(user.getBook() == user2.getBook());
    }

    private static void createAndCheckWithLookUp() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class, Book.class);

        User user = context.getBean(User.class);
        User user2 = context.getBean(User.class);

        Book book = user.getBook();
        Book book2 = user2.getBook();

        book.setTitle("book");
        book2.setTitle("book2");


        System.out.println(book == book2);

        System.out.println(book);
        System.out.println(book2);
    }

    private static void createAndCheckWithGetContext() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class,Book.class);
        User user = context.getBean(User.class);
        User user2 = context.getBean(User.class);

        Book book = user.getBook();
        Book book2 = user.getBook();

        book.setTitle("book");
        book2.setTitle("book2");

        System.out.println(user==user2);
        System.out.println(book==book2);
        System.out.println(book);
        System.out.println(book2);
    }
}
