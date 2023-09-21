package com.example.daemondproblem;

public class Example implements A, B {

    //default methodner@ i hayten ekel java 1.8-ic sksac
    //implements anox class@ partavor che override anel default method@
    //ir hertin default methodner@ berelen Daemon -Problem xndir@
    //da ayn depqne erb erku interface uni nuyn anunov default method@
    //ev irenc implements anox class@ arden compilyatornel kstipi vor override ani ayd method@

    @Override
    public void some() {
       //A.super.some();
       //B.super.some();
        System.out.println("my custom method");
    }


    public static void main(String[] args) {

        Example example = new Example();

        example.some();
    }
}
