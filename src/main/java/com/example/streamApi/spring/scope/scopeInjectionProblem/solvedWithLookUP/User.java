package com.example.streamApi.spring.scope.scopeInjectionProblem.solvedWithLookUP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class User {

    @Autowired
    Book book;

    //erb spring@ tesnume ays anotacian na ovveride e anum tvyal metod@ ev amen angam veradardznum nor object,
    //chmorananq vor ays metodi depqum class@ petqe darna abstract ev book-i vrayi proxyMode attribut@ petqe jnjvi
    //ev getBook methodi mej peqe uncomentel Book book = get();
    @Lookup
    public abstract Book get();

    public Book getBook() {
        book = get();
        book.printHashCode();
        return book;
    }
}
