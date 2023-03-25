package com.example.streamApi.spring.scope.scopeInjectionProblem.solvedWithProxyMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Book book;


    public Book getBook() {
        book.printHashCode();
        return book;
    }
}
