package com.example.streamApi.spring.scope.scopeInjectionProblem.solvedWithProxyMode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {


        //lucum@ @st PROXYMODE attributtei
        //proxyMode attribute ognutyamb menq injectenq anum Prototype bean
        //book classi mej scope anotaciayi mej proxyMode attribute-i shnorhiv,
        //objectner@ tarberen ,iranc hashCode-@ nuynpes tarbere bayc == stugman depqum true e

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class, Book.class);
        User user = context.getBean(User.class);
        User user2 = context.getBean(User.class);

        Book book = user.getBook();
        Book book2 = user2.getBook();


        book.setTitle("book1");
        book2.setTitle("book2");


        //ete book ev book2 objectner@ linen nuyn@ apa erkusi hamarel titl@ klini book2
        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());

        System.out.println(book== book2);
        System.out.println(user.getBook());

    }
}
