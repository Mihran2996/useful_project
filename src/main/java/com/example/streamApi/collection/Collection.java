package com.example.streamApi.collection;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Collection {
    public static void main(String[] args) {

        //What are the main differences between array and collection?
        //arrayner@ unen fixzvac size
        //iranc performence aveli arage
        //iranq karoxen pahel primitiv tiper
        //iranq chen karox pahel xar@ tiper
        //Collectionner@ karoxen menak pahel bard tiper
        //iranc siz@ dinamike hamamematac Arraynerin iranc performancen aydqanel arag che
        LinkedList list = new LinkedList();

        ArrayList array5 = new ArrayList();
        array5.add("afadf");
        array5.add("566565");
        System.out.println(array5);
        System.out.println(array5.get(0));

        // adding  elements
        list.add("Geeks");
        list.add(4);
        list.add("Geeks");
        list.add("8");
        System.out.println(list);
        System.out.println(list.get(0));

        List<? extends Serializable> d = Arrays.asList(1, "d");
        for (Serializable serializable : d) {
            System.out.println(serializable);
        }


        //LinkedList VS ArrayList
        //LinkedList@ erkkapakcvac cucake
        //ArrayList @ massive
        //BigO in ArrayList
        //get@ indexov misht arage cucanish@ - O/1 e
        //ArrayList verjic remov@ - O/1 e
        //ArrayList veric element add anel@ - O/1 e
        //ete ArrayList-i mej verjic element enq add anum u capacity-n lcvace apa na peqtqe taza massiv sarqi u copy ani
        //aysinqn ayd process@ dandaxe bayc eli konstant jamanakahatvacume texi unuenum O/1
        //ArrayList-i mej mejtecic remove ev add anel@ - O/N e
        //ArrayListi skszbic element add ev remove anel@ O/N e

        //LinkedList-um demic,verjic element add,remove anel@  - O/1 e
        //LinkedList-i mej element get anel@ - O/N e
        //LinkedList-um mejtexic add,remove anel@ - O/n e qani vor indexov petqe da ani isk minjev ayd petqe gtni tvyal tex@ isk darden dandaxe


        //What is the difference between Iterator and ListIterator?
        //iterator@ colletion-i het ashxatume next elemntov-ov
        //listIterator@ Iteratori jarangne
        //listIteratora ashxatume ev nextov ev previous elementnerov-ov
        //iterator@ uni hasNext,next,remove methodner@ chi karoc element add anel
        //listIterator@ karoxe add anel elementner@
        //listIterator@ karoxe tal elementi index@
        //iterator@ karoxe ashxatekl List,Set Queue-i het
        //ListIterator@ karoxe ashxatel menak Listeri het

//        ArrayList arrayList = new ArrayList();
//        arrayList.add("dd");
//        arrayList.add(1);
//        arrayList.add(true);
//
//
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        ListIterator listIterator = arrayList.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }


        //What is Enumeration?
        //Karoxe kanchvel menak Vector
        //iteraciayi jamanak zugaher elmenent jnjeluc chi qcum ConcurrentModificationException.
        //Collections class@ uni enumeration() method@ vor@ andunume collectioni ev veradardznum enumuration
        Vector vector = new Vector();
        vector.add("adfss");
        vector.add(2);
        vector.add(false);
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
            vector.remove(0);
        }

        List<String> list1 = new LinkedList<>();
        list1.add("hello");
        list1.add("world");


        Enumeration<String> enumeration = Collections.enumeration(list1);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        //Iterator vs Enumeration
        //Enumeration@ chi karox element jnjel
        //Iterator@ karoxe remove anel elementner@
        //Karoxe kanchvel menak VEctor u mapic
        //iterator@ Fail-Faste isk Enumeration@ Fail-Safe e


        System.out.println();
        //Can set contain null values?
        //hashesi mej null karelie avelacnel,inq@ misht null valuen dnume arajin indexi tak,injqanel avelacnenq inq@ misht override kani,kmna mi hat null value
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("dff");
        hashSet.add("fgddff");
        hashSet.add("hj,h,jhdff");
        hashSet.add(null);
        hashSet.add(null);
//        for (String s : hashSet) {
//            System.out.println(s);
//        }
        System.out.println();


        //linkedhashset-i mej karoxenq null value avelacnenq,,mek hat,injqanel avelacnenq inq@ override
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(null);
        linkedHashSet.add(5);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        for (Integer integer : linkedHashSet) {
            System.out.println(integer);
        }
        System.out.println();


        //Treset-i jamanak chenq karox null value avelacnel,,kunenanq NullPointerException,
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(0);
//        treeSet.add(null);
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        //List vs Set
        //Seter@ chen toxnum duplikat
        //Seter@ extends en anum Collection@ ev chen avelacnum nor metodner
        //lister@ toxnumen duplikat
        //lister@ extends anum Collection@ ev avelacrelen nor metodner
        //Seter@ chunen get() method


        //How do you traverse HashMap?
        //Can TreeMap contain null value?
        //hashmap@ tuyle talis mek key null,ev liq@ null valuener,injqan taza null key avelacnenq override kani naxord@
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "eds");
        hashMap.put(null, null);
        hashMap.put(null, "asddfa");
        System.out.println(hashMap);


        //linkedHashMap@ tuyle talis mek key null,ev liq@ null valuener,injqan taza null key avelacnenq override kani naxord@
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, null);
        linkedHashMap.put(null, null);
        linkedHashMap.put(null, "asfaf");
        System.out.println(linkedHashMap);

        //treeMap@@ tuyl chi  talis null key,bayc tuyle talis null valuner
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, null);
        treeMap.put(2, null);
//        treeMap.put(null, null);//tuyl chi talis null key unenal
        System.out.println(treeMap);


        //HashTable vs HashMap
        //HashTabl@ tuyl chi talis null voch key voch value,bolor methodnernel synchronized en
        //HashTable chen karox dardznel asixron
        //HashMap@ karox enq dardznel synchronized Collections.synchronizedMap(hashMap);
        //hashMap@ jarangum e AbstractHashMapic
        //HashTable @ jarangume Dictionary classic
        //HashTable-i iterator@ chi qcum CuncurrentModification Exception, aysinqn Enemuration e

        Hashtable<Integer, String> hashtable = new Hashtable<>();


        //ConcurrentHashMap vs hashtable
        //cuncurrenthashmap@ tuyle talis null key ev value
        //erkusi hamarel iterator@ fail-safe,
        //hashTabl@ tuyl chi talis voj null key, vochel null value
        //hashtable blocke anum backet@ ampoxjovin,minjev chavarti ashxatanq@ myus thread@ chi karox operation katarel
        //cuncourrenthashmap@ blocka anum segmentner@,aysinqn erku thread karoxen hangist ashxatel tarber segmentnerum chxangarelov mimyanc
        //segment@ skzbum 1-ic minjev 16 ne,aysingn indexner@,voronc mejel pahvumen objectner@


        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

        //Collection vs Collections
        //collection@ stexcume tvyalneri xumb@
        //collections@ tvyalneri xmbi het ahsxatelu hamare stexcvac,utilitayin class e
        //collection@ interface e isk collections@ classe,
        //collections-i metodner@ static en.
        //collection-i mej java 1.8-ic sksac kan static metodner,uni naev abstract ev default methodner


//        What is the Dictionary class?
        //Dictionary-n abstract classe nmane mapin, pahume key value
        //nra bolor methodner@ abstracten


        //array vs array list.

        //array uni fixed size/
        //performance aveli arage qani vor siz@ fixvace
        //karoxa pahpanel parz tiper.
        //arrayList@ dinamike


        //convert from arraylist to array
        //kunenanq exception qani vor toArray() method@ veradardznume Object tip
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // Error: incompatible types: Object[]
        // cannot be converted to Integer[]
//        Integer[] objects = al.toArray();

        //sa chisht tarberakne
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);

        //convert from array to arrayList
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

//        List al2 = Arrays.asList(geeks);//ays depqum kunenanq exception qani vor masiv@ uni fixvac size.chenq karox listi hxumov stanal
        List<String> al2 =
                new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(al2);


    }
}
