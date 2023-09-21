package com.example.spring.scope.scopeInjectionProblem.solvedWithContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Book book;

    public Book getBook() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Book.class);
        book = context.getBean(Book.class);
        book.printHashCode();
        return book;
    }
}
