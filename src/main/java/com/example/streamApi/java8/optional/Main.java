package com.example.streamApi.java8.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //Optional@ xusapume nullPointerExceptionic
        //ev apahovume aveli karch syntax
        String str = null;
        String str2;
        if (str != null) {
            str2 = str;
        }

        Optional<String> optionalS = Optional.ofNullable(null);
        str2 = optionalS.orElse("non null");
        System.out.println(str2);


        Optional<String> str3 = Optional.ofNullable(null);
        String str4 = str3.orElse("optional is empty");
        System.out.println(str4);


    }
}
