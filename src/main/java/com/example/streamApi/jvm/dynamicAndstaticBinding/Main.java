package com.example.streamApi.jvm.dynamicAndstaticBinding;

public class Main {


    public static class SupperClass {

        // Method of inner class
        static void print() {

            // Print statement
            System.out.println(
                    "print() in superclass is called");
        }
    }

    // Static nested inner class
    // Class 2
    public static class SubClass extends SupperClass {

        // Method of inner class
        static void print() {
            // print statement
            System.out.println(
                    "print() in subclass is called");
        }
    }

    public static void main(String[] args) {
        SupperClass obj1 = new SupperClass();
        SupperClass obj2 = new SubClass();

        //Dynamic Compilation
        //ays depqum petqa method@ kam private kam static lini
        //erb objceti tip@ voroshvace linum runtime da kochvume dynamic bindig kam dynamic compilation
        //compilyator@ ashxatume byName aysinqn hxumov vochte byType,
        //qani vor Subclassi instanc@ nuynpes Supperclassi instance hamarvum,compilyatornel chi haskanum te vortexic petqa kanchi method@
        //ayd isk patcharov na himnvume vochte hxman ayl tipi vra .

//        obj1.print();
//        obj2.print();


        //Static Compilation
        //private, static methodneri depqum
        //ays paragyum obj2.print method@ kkanchvi SupperClassic,
        //qanivor compilyator@ giti vor static ev private method@ override chi linum dra hamar kkanchi hxumic
        obj1.print();
        obj2.print();
    }
}
