package com.example.spring.scope.scopeInjectionProblem.solvedWithLookUP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {


        //Lucum@ @st Lookup annotation-i
        //erkrord@ @lookUp metodi shnorhiv,vori depqum == stugman depqum false
        //ays depqum booker@ tarber klinen


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class, Book.class);

        User user = context.getBean(User.class);
        User user2 = context.getBean(User.class);

        Book book = user.getBook();
        Book book2 = user2.getBook();

        book.setTitle("book");
        book2.setTitle("book2");


        System.out.println(book == book2);

        //ete book ev book2 objectner@ linen nuyn@ apa erkusi hamarel titl@ klini book2
        System.out.println(book);
        System.out.println(book2);
    }
}
