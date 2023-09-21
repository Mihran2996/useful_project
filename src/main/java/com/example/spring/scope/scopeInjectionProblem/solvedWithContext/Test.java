package com.example.spring.scope.scopeInjectionProblem.solvedWithContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        //lucvace Context-ic getBean() kanchelov
        // contextic dursenq hanum Book-in;

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class, Book.class);
        User user = context.getBean(User.class);
        User user2 = context.getBean(User.class);

        Book book = user.getBook();
        Book book2 = user2.getBook();

        book.setTitle("book");
        book2.setTitle("book2");

        System.out.println(user==user2);
        System.out.println(book==book2);

        //ete book ev book2 objectner@ linen nuyn@ apa erkusi hamarel titl@ klini book2
        System.out.println(book);
        System.out.println(book2);

    }
}
