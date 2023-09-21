package com.example.coerjava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("girq1");
        Student student = new Student("valod", "valodyan", Arrays.asList("one", "two"), book);
        System.out.println(student.getBook().getName());
        Student clone = (Student) student.clone();
        clone.getBook().setName("modify");
        System.out.println(clone.getBook().getName());
        //popoxumenq clone girqi anun@ bayc azdume student objecti Book-i vra
        //dra hamar ir hertin Book classnel petqe realizacni clone metod@,
        System.out.println(student.getBook().getName());
        System.out.println();

        Student student22 = new Student("valod22", "valodyan22", Arrays.asList("one22", "two22"), book);
        Student student44 = new Student("valod44", "valodyan44", Arrays.asList("one44", "two44"), book);

        DynamicArray<Student> array = new DynamicArray<>();

        array.add(student22);
        array.add(student44);

        DynamicArray<Student> clone1 = (DynamicArray<Student>)array.clone();

        Student[] arrays = clone1.getArrays();



    }

    //Can interface have a field?
    //AYO EV AYD FIELD@ ARDEN ISK PUBLIC STATIC FINALE


//Why string is immutable in Java? What is string pool? Are string hashes cached?
    //inq@ aktiv ogtagorcvume vorpes key HashMapum ev qani vor immutable hnaravor che element@ korcnel
    //inq@ qeshavorume ira hashcod@,
    //inq@ immutable ev apahove ete mi qani patoke ashxatum ira het,
    //inq@ qeshavorvum e string poll um


//    public static void main(String[] args) {
//        String str = "poxos";
//
//        //concatenq anum string@ bayc hajord toxin str-n tpeluc ktpi poxos
//        System.out.println(str + " new str ");
//        System.out.println(str);
//
//        StringBuilder stringBuilder = new StringBuilder("builder");
//        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.append("  new string builder"));
//        System.out.println(stringBuilder);
//
//    }


//   How to clone an object in java? What is cloneable interface? How to make a deep copy?
    //clonavorman hamar unenq erku havanakan tarberak shallow ev deep copy
    //clone aneluc petqa implement anenq clonable interfacen teche kunenanq cloneNotSupportedException
    //deep@ xoracvace copy anum
    //shallow clone-i depqum ete ayd objecti mej ka inject arac object,,menqa ayd inject arac object@ chenq clonavorum uxxaki ssilkenenq unenum
    //ev amen popoxutyun ira het kazdi naev original objecti vra
    //deep clony depqum clonavorum enq naev ayd inner obkjectner@


    //Where are static variables stored?
    //metaspace-um


}
