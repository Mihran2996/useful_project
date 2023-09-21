package com.example.java11;

public class Alphabet {
    //It supports private access within nest members directly, no more via an auto-generated bridge method access$000.
    // Furthermore, new nested APIs for validation and allowed private reflection access within nest members.

    private String name = "I'm Alphabet!";

    public class A {
        public void printName() {
            System.out.println(name);       // access Alphabet's private member!
        }
    }

    public void test() {
        A a = new A();
        a.printName();
    }
}
//Before Java 11.
// After javac Alphabet.java, Java compiler created something similar to this.

//public class Alphabet {
//    private String name = "I'm Alphabet!";
//    String access$000(){
//        return name;
//    }
//}
//
//public class Alphabet$A {
//    final Alphabet obj;
//    public void printName(){
//        System.out.println(obj.access$000());
//    }
//}
