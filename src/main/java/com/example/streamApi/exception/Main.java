package com.example.streamApi.exception;

public class Main {

    //What is exception rethrowing?
    //erbemn mez petqe rethrow anenq Exception@
    //linuma depq erv Catch block@ chi karox handle ene exception@ ev menqa karoxenq catch blocki mejic throw anel
    //mez petqa rethrow anel aveli manramasnelu exception@ te konkret inj operationi jamanake ayn texi unecel
    //npatak@ aveli bardzr makardakum handle enelne
    //himnakan npatak@  chained exception qcelne


    //Can we write only try block without catch and finally blocks?
    //karoxenq try blocki het uneneal finaly block@
    //nuynisk try-i mej return anenq finaly block@ ankax dranic eli kashxati

    //What are chained exceptions?
    //sa ayn exceptione vor@ karoxenq shxtayov kapel irar
    //getCause()-veradardznume  exceptioni patchar@
    //initCause() nel- sahmanaumenq Exception qcelu patchar@
    //getmessage() - veradardznume messagen vor@ sarqvele cherez exceptioni konstructor
    //getStackTrace()- excetionneri massiv@ kveradardzne,,aysinqn karoxe exception@ qci bayc hirarxiayov mi qani exception unena


    //What happens when exception is thrown by main method?
    //Runtime exception kqci,craggir@ kang karni ev consoli mej cuyc kta stackTrace @

    //What is Java 7 ARM feature?
    //sa Automatic Resource Management -ne,,nuyn try-with/resources
    //ayn tuyle talis avtomat pakel bacvac resource ner@,


    public static void main(String[] args) {
//        System.out.println(getEx().getCause());
        System.out.println(getEx().getMessage());
    }

    public static Exception getEx() {
        try {
            // creating an exception
            ArithmeticException e = new ArithmeticException("Apparent cause");
            // set the cause of an exception
            e.initCause(new NullPointerException("Actual cause"));
            System.out.println(e.getCause().getMessage());
            // throwing the exception
            throw e;
        } catch (ArithmeticException e) {
            // Getting the actual cause of the exception
            throw e;
        }
    }

}
