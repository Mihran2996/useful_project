package com.example.generics;

public class Main {


    //What is Generics in Java ?
    //Genericner@ nshanakum en parametracvac, aysinqn i shnorhiv genericneri menq tuylenq talis vor
    //Integer@,String@ ev ayl tiper@ linen methodi parametr,classi,interfacei.
    //Ogtagorcelov genericner@ menq karoxenq stexcel class vor@ kashxati tarber tiperi het,
    //ayd classner vorornq ashxatumen parametracvac tiperi het hamarvum en universal


    //Why not Object and Generic
    //vorovhetev ete menq ogtagorcelov Object menq chenq tipizacnum ev shat texer konkret kunenaq xndirner
    //orinak ete haytararenq list <Oject> ev lcnenq xar@ tiper ev get eneluc menq chenq imana da inj tip get kani

//    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>();
//        list.add(10);
//        list.add("Hello");
//        list.add(new Dog());
//
//        for (Object o : list) {
//            //will throw ClassCastException
//            //Dog dog = (Dog)o;
//
//            //To avoid getting a ClassCastException we need to check using instanceof
//            if (o instanceof Dog) {
//                Dog dog = (Dog) o;
//                dog.some();
//            }
//        }
//    }


    //What are advantages of using Generics

    //ogtagorcelov genericner menq cast anelu kariq chenq unena
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("a");
//
//        String value = (String) list.get(0);
//
//        //using Generic
//        List<String> lists = new ArrayList<>();
//        lists.add("sdsad");
//
//        String var = lists.get(0);
//    }


    //Genericner@ compile time check en anum
//    public static void main(String[] args) {
//        ArrayList listOfNames = new ArrayList();
//
//        listOfNames.add("Sachin");
//        listOfNames.add(10);//generic ogtagorcelu depqum compilyator@ tuyl chi ta vor tiv avelacnenq
//
//        String s2 = (String) listOfNames.get(1);
//
//        // will throw Runtime Exception
//        String s3 = (String) listOfNames.get(2);
//
//
//        //using generic we can't add 10 in list
//
//    }


//   What is Bounded and Unbounded wildcards in Generics ?

    //sa unbounded (ansahmanapak) wildcard e
    // List<?>

    //upper bounded(sahmanapak) wildcard
    //List<? extends T>  sa nshanakume vor Listi mej karoxen pahvel menak T-i jarang@


    //lower bounded(sahmanapak) wildcard
    //List<? super T>  sa nshanakume vor listi mej karoxe pahvel menak T-i parent@


    //Can you pass List<String> to a method which accepts List<Object>
    //chenq karox , vorovhetev asumenq vor petqa menak Objectneri list @nduni
    // miayn ete metod@ @nduni vorpes upper bounded wildcard` List<? extends Object>
    // kam method@ @nduni any type,aysinqn unbounded wildcard` List<?>

//    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("asda");
//        //  some(list);//compile error
//    }
//
//    public static void some(List<Object> list) {
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }

    //What Is Type Erasure?
    //ays paragayum kampilyator@ poxarinum e E-n Objecti,
    //ays jnjman tesakner@ linumen kam methodi popoxakani het kam classi makardakov


    //methodi popoxakani het
//    public static <E> boolean containsElement(E[] elements, E element) {
//        for (E e : elements) {
//            if (e.equals(element)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
    //kampilyatori poxarinum e ayn Objecti
//    public static  boolean containsElement(Object [] elements, Object element){
//        for (Object e : elements){
//            if(e.equals(element)){
//                return true;
//            }
//        }
//        return false;
//    }

    //classi popoxakani het
//    public class Stack<E> {
//        private E[] stackContent;
//
//        public Stack(int capacity) {
//            this.stackContent = (E[]) new Object[capacity];
//        }
//    }

    //kampilyatori poxarinum e ayn Objecti
//    public class Stack {
//        private Object[] stackContent;
//
//        public Stack(int capacity) {
//            this.stackContent = new Object[capacity];
//        }
//    }

    //jnjman tesak  wildcardi depqum
//    public class BoundStack<E extends Comparable<E>> {
//        private E[] stackContent;
//
//        public BoundStack(int capacity) {
//            this.stackContent = (E[]) new Object[capacity];
//        }
//    }

    //kampilyatori poxarinum e ayn Comparable-i
//    public class BoundStack{
//        private Comparable[] stackContent;
//
//        public BoundStack(int capacity) {
//            this.stackContent = (Comparable[]) new Object[capacity];
//        }
//    }


    //Is It Possible to Declared a Multiple Bounded Type Parameter?
    //ayo hnaravore ays kerp

//    class Bounded<T extends Comparable & Comparator>{
//
//    }

    //What Is Type Inference?
    //minjev java 1.7@ menq anpayman petqa haytarareynq konkret generici tip@ orinak
    // List<Integer> list = new ArrayList<Integer>();

    //java 1.7-ic sksac improve en arel,,kampilyator@ avtomat haskanamua arden tip@
    //List<Integer> list = new ArrayList<>();

    //java 8-ic sksac menq karoxenq kanchel method@ v methodi @ndunox parametri tex@ new anel List
    //showList(new ArrayList<>())

    //An old approach(prior to Java 7) to create a list

//    List<Integer> list1 = new ArrayList<Integer>();
//    list1.add(11);
//    showList(list1);
//    Java 7
//    List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
//    list2.add(12);
//    showList(list2);
//    Compiler infers type of ArrayList, in Java 8
//    showList(new ArrayList<>());


    //If a Generic Type Is Omitted When Instantiating an Object, Will the Code Still Compile?
    //ayo da hnaravore qani vor genericner@ ihayten ekel java 5-ic;

    //List list = new ArrayList();//tip@ chenq asum bayc compile klini

    // G   E   N   E   R   I   C


    //What is this syntax List<?>
    //nshanakume karoxen tal lyuboy object vori tip@ parz che


    //What is List<Object>
    //nshanakum e vor karoxenq lyuboy object tal qani vor lyuboy object jarangum e class Objectic

    //What is the difference between List<? Extends User> and List<Object>
    ///ays greladzev@ nshanakume vor method@ @ndunume menak User-ic extend exac classner@

    //What is this syntax <? super User>
    //nshanakume karoxen tal menak User classi superin

    //GENERIC TYPES
    //T- nshanakume vor tipe @ndunum
    //K- nhsanakume vor KEY e, orinak HASHMAP<K,V>
    //V- nshanakum e vor VALU e ,orinak HASHMAP<K,V>
    //E- nshanakum e vor ELEMENT e @ndunum, orinak1 COLLECTION<E>,laynacaval ogtagorcvume Collectionnerum
    //N- nshanakum e vor NUMBER e @ndunum


    ///   Authentication vs. Authorization

    //Authorizatian- ayn procesna erb vor sisteman access e tramadrum userin
    //haytni methodneric JWT TOKEN@

    //Authetificatin -inj vor meki nuynakanacman hastataman procesne
    //MEK GORCONOV AUTHENTIFICATIAN -login password stugelne erb vor bazayic bervume ev hamematvume
    //ERKU GORCONOV AUTHENTIFICATIAN - ogtatirojic pahanjvume voj miayn login passwor,ayl naev injvor ezaki texekatvutyun,
    //orinak dproci anun,kam injvor tver uxarki @gmail-in kam heraxosahamarin

}
