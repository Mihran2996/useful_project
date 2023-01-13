package com.example.streamApi.spring.scope.scopeInjectionProblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Book book;

    //erb spring@ tesnume ays anotacian na ovveride e anum tvyal metod@ ev amen angam veradardznum nor object,
    //chmorananq vor ays metodi depqum class@ petqe darna abstract ev book-i vrayi proxyMode attribut@ petqe jnjvi
    //ev Book constructori mej peqe uncomentel Book book = get();

//    @Lookup
//    public abstract Book get();

    public Book getBook() {
        //sa LookUp-i jamank uncommentel
//        Book book = get();

        //sael 3-rd casei depqum erb contexticenq durs hanum
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Book.class);
//        book = context.getBean(Book.class);
        book.printHashCode();
        return book;
    }

    //
    public User() {
    }


}
