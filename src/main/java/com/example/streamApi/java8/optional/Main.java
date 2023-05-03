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

        //Optional@ karoxe liniel classi field,karox e linel methodi veradardznox tip
        //cankali vor optional@ chlini methodi @ndunox argument,qani vor ayn karoxe linel null ev unenaq NullPointerException
        //orinak`
//        getException(null);


    }

    public static void getException(Optional<Integer> value) {
        //ete valuen poxancenq null apa ifi paymani mej kunenanq NullPointerException,qani vor kuzenanq nullic kanchel method
        if (value.isPresent()) {
            System.out.println("Hello");
        }
    }
}
