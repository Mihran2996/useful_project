package com.example.spring.scope.scopeInjectionProblem.solvedWithContext;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Book {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printHashCode() {
        //ays metodi ognutyamb ktesnenq vor tarber userneri book objectneri hashcoder@ tarberen
        //aysinqn dranq tarber objectneren
        System.out.println("Book hashcode` " + this.hashCode());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
