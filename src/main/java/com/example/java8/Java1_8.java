package com.example.java8;

import java.util.Optional;
import java.util.function.Predicate;

public class Java1_8 {


    //What are new features which got introduced in Java 8?

    //default forEach() method in Iterable interface.vorn @ndunum e Consumer funqtional tip
    //default and static methods in Interfaces
    //Functional Interfaces
    //Java Stream API
    //permGen@ popxvele metaspcae
    //lyambda
    //Optional Class

    //functional interface
    //bolor functional interfacener@ petqe unenan @FunctionalInterface anotacian
    //yuraqanchyur interface vorn uni mek abstract method hamaravume functional interface
    //ev iranc irakanacum@ karelie katarel lyambda -ov
    //lyambdaner@ ogtagorcvumen menak functional interfaceneri het,,aveli karc syntax e;
    //lyambdan functional interfacei irakanacnoxne,
    //funqtional interfacen chi karox unenal 2 abstract method,-------
    // ------- vorovhetev irakanacumn lyambdayove ayd paragayum lyambdayov haskacnel chi lini te vor methodne mez petq ogtagorcel
    //functional interface-i gaxapar@ ayna vor inq@ petqa unena mek abstract method
    //minjev java 8 menq anpayman petqe class unenanq vor@ petqe implementacner ayd interfacen heto override aner method@
    //heto sarqel classi object u nor kanchel objectic method@
    //isk funqtional interfacei depqum miangamic karoxenq lyamba-i mijocov ogtagorcel method@

//    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("thread  started");
//        runnable.run();
//        }

    //Funqtion
    //ays interfacen uni method vor@ uni @ndunox mek argument ev veradardznox urish argument
    //ays interfacen karoxe gorcoxutyunner katarel orinak1
//    public static void main(String[] args) {
//    t-n aystex methodi @ndunox argumente
//        Function<Integer, Integer> calculate = t -> t * 5;
//        System.out.println(calculate.apply(4));
//    }

    //supplier  sa pastavshikne
    //sa java 8-i meja nerkayacve functional interfacee
    //inq@ chi @ndunum argument bayc veradardznume injvor tip;

    //consumer sa clientne
    //void e
    //sa java 8-i meja nerkayacve functional interfacee
    //ays interfacen uni method vor@ uni @ndunox argument ev chi veredardznum vochmi ban

    //Predicaten sa tramabanakn arjeqe veradardznum
//    public static void main(String[] args) {
    Predicate<Integer> integerPredicate = t -> t > 10;
//        System.out.println(integerPredicate.test(10));
//    }


    //default forEach(Consumer consumer) method in Iterable interface;
    //ays method@ Iterable intyerfaceume inq@ defaulte ev @ndunume Consumer functional interface@,,
    //accept metodnel @ndunume mek argument ev voide
    //tuyle talis ogtagorcel lyampdaner
    //aveli karch syntaxe apahovum
    //tyule talis ogtagorcel method reference
    //default method@ karoxe overload linel

//    public static void main(String[] args) {
//
//        List<String> lists = Arrays.asList("a", "b");
//
////        for (String list : lists) {
////            System.out.println(list);
////        }
//
//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s.toUpperCase(Locale.ROOT));
//            }
//        });
//
//        lists.forEach(System.out::println);
//    }


    //static methods
    //interfacei static method@ chi karox override linel qani vor ayn hasaneli interface-i mijocov ev nra nersum,orinak` A.static();
    //  static method@ karoxe overload linel interfacei nersum


    //default methodner
    //java 1.8-i mej nranc ihayt gal@ parze,,qani vor interface-i mej mek method avleacnelu depqum nran railzacnoxbner@ petqe anpayman
    //override anen ,,isk default metodneri depqum miangamic ayn hasaneli klini realizaciyai mej,,default metodner@ unen marmin
    //ir hertin default metodner@ berelen xndir vor@ kochvume   Diamond Problem,,sa ayn depqne erb unenq 2 hat interface
    //2 interfacei mej unenq nuyn anunov method,ev ayd erku interfacenel implements-a anum mi hat class
    //kunnenq compile error,,compilyator@ kstipi ovveride anel voreve mek@,vorovhetev heto parz chi lini te vor interfacei methodnenq kanchelu
    //override kannenq kanchelov orinak A.super.some() ays dzev.u arden tvyal classi mej karoxenq nuyn method@ overload anel
    //private methodner@ voronq ekelene java 9-ic,nra hamaren vor default methodner-i mej karoxen kirarvel


    //Java Stream API
    //stexcelov mek angam stream ayn chenq karox bazmaki angam ogtagorcel
    //steram karoxenq sarqel mi qani chanaparhov
    //stream operation@ chi popoxum collection@
    //Stream.empty(); collection.stream(); Arrays.stream(array);Stream.<String>builder().add("a").build(); Stream.iterate(40, n -> n + 2).limit(20);
    //java 8-@ tyle talis sytexcel streamner primitiv tiperic,qani vor Stream@ generic e,nranq stexcel;en IntStream,DoubleStrem,LongStream interfacener@
    //ays kerp xusapelov autoBoxingic injnel drakane azdum performance-i vra
    //terminal operationic heto stream@ pakvume ev chenq karox kanchel eli terminal operation,drahamar petqe terminalic heto kanchenq nor stream heto terminal operation,ete ayd terminal operation@ liste veradardznum
    //cankali e vor stream@ lini  vopres veradardznox arjeq
    //intermediate oprtaionner@ LAZY en,minjev chkanchvi Terminal operation ayn chi execute lini,Terminalner@ EAGER en
    //Stream@ chi linum methodi @ndunvox argument, classi field,
    //steram@ vorpes methodi @ndunox argument chi kareli ogtagorcel,qani vopr ayn karoxe ev methodi mej ogtagorcvel ev minjev method@
    //hasnel@,kam dranic heto, es paragayum kunenanq IllegalStateException qani vor stream@ mek angame kareli ogtagorcel
    //Stream@ karoxe linel vorpes methodi veradardznox tip, qani vor amen angam menq nor stream kuxarkenq ev xndir chi lini ogtagorcman het


    //PermGen vs Metaspace
    //araj staceleen PermGen error
    //Metaspace depqum runtime inq@ ira chaper@ poxume anhrajeshtutyan depqum


    //What is Optional class
    //Optional@ objecti konteynera, vor@ vor karoxe ir mej pahel injpes null arjeq aynpesel voch null
    //uni aveli karch syntax,,
    //Optional@ karoxe liniel classi field,karox e linel methodi veradardznox tip
    //cankali vor optional@ chlini methodi @ndunox argument,qani vor ayn karoxe linel null ev unenaq NullPointerException

    //orinak`
    public static void getException(Optional<Integer> value) {
        //ete valuen poxancenq null apa ifi paymani mej kunenanq NullPointerException,qani vor kuzenanq nullic kanchel method
        if (value.isPresent()) {
            System.out.println("Hello");
        }
    }

    //Optional.empty()-talisenq empty arjeq
    //Optional.ofNullable()-karoxenq tall null value
    //Optional.of()-talisenq onjvor arjeq


//    public static void main(String[] args) {
//        Optional<String> str = Optional.ofNullable(null);
//        System.out.println(str.orElse("hello"));//ete konteyner@ null lini mez kveradardzni hello bar@
//
//        String str1 = null;
//        String str2;
//        if (str1 != null) {
//            str2 = str1;
//        }
//        //ays ameninj@ karoxenq grel mek toxov Optionali mijocov
//        String hello = str.orElse("hello");
//
//    }

    //steramApi vs Collection
    //collectionner@ ogtagorcvumen stexcelu hamar injvor tiperi xmber
    //stream ner@ injvor operationneren katarum ayd xmberi het
    //collectioni het ashxateluc menq karoxen popoxutyun katarel jnjel,add anel element orinak
    //steramneri het ashxateluc menq chen karox jnjel, kam add anel injvor element
    //collectionner@ menq karoxenq andadatar ogtagorcel.
    //streamner@ ete mek angam ogtagorcumenq inq@ asuma vor arden ogtagorcvace,
    // 2-rd angam ogtagorcelu hamar petqe nor stream stananq heto nor ogtagorcenq
    //collectioner@ eagren
    //Streamner@ lazy en,,Intermidate operationner@ chen katarvum minjev chen kanchvum terminal operationner@


    // What is method reference in java 8?
    //method referencen poxarinum e lyambdayin
    //java i mej ka 3 tipi hxumayin methodner   hxum static methodin; hxym exemplyari methodin;hxum constructor-in
//    public static void main(String[] args) {
//        //hxum static methodin
//        Music music = Some::songAnything;
//        music.song();
//
//        //hxum exemplyari methodin..ays depqum tvyal exemplyari method@ petqe static chlini
//        Some some = new Some();
//        Music music2 = some::songSomething;
//        music2.song();
//
//        //hxum constructorin;
//        Message message = MessageService::new;
//        message.getMessage("That is ok!");
//
//        List<Integer> list = Arrays.asList(1, 8, 9, 6, 4);
//        //method referencen poxarinume lyambdanerin
//        list.stream().sorted((a, b) -> a.compareTo(b));
//        list.stream().sorted(Integer::compare).forEach(System.out::print);

//
//    }


    //Difference between Intermediate and terminal operations in Stream?
    //intermediate operationner@ vorpes result veradardznumen stream,irancic heto petqe kanche terminal operartion vorpeszi stananq rezult
    //terminalner@ injor result,voric heto chenq karox kanchel intermidate operation


    //What Is the Difference Between Map and flatMap Stream Operation?
    //erkusnel intermediate operationen
    //map@ gorcoxutyune anum listi elemnti het
    //flatmat@ karoxce mtnel listi meji listi mej
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a", "b");
//        list.stream().map(String::toUpperCase).forEach(System.out::print);
//        List<List<String>> listList = Arrays.asList(list);
//        System.out.println();
//        //flatmap@ mtnuma listi mej,ira meji amen listin sarquma stream
//        // heto nor mapov arden isk karoxe gorcoxutyun anel tvyal streami elementneri het
//        listList.stream().flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::print);
//    }


    //What are static default methods?
    //static methodi vra karoxen unenla method reference
    //ays methodner@ haytnvelen java8-ic sksac
    //default methodner@ partadir chi override anel;
    //staticnernel karoxenq kanchel interfaceic
    //erku methodnernel anpayman petqe body unenan
//    public static void main(String[] args) {
//        MessageImpl messageService = new MessageImpl();
//        messageService.defMethod();
//        messageService.getMessage("It is abstract method");
//        new Thread(Message::statMethod).start();
//    }

    //How will you call a default method of an interface in a class?
    //classi mej default method@ kanchelu hamar petqe unenanq classi ekzemplyar@ ev iranic kanchel default method@
//    public static void main(String[] args) {
//        class A implements Message {
//
//            @Override
//            public void getMessage(String message) {
//            }
//
//            //default method called
//            public void print() {
//                A a = new A();
//                a.defMethod();
//            }
//        }
//    }


    //What is private interface method?
    //interfacener@ ogtagorcumenq pravite methodner@ taqcnelov detalner@ irenc reailizacnox classneric  ev nranq kanchvum en default methodneri mej


    //What is the use of ofNullable method in Stream?
    //NullpointerExceptionic xusapelu hamar;;
    //ete streami mej lini 5000 tiv@ apa kveradardzni te qani hat ka ays tvic ete che count@ klini null
    //ete 5000- poxaren poxancenq null menq chenq stana NullPointerException uxxaki result@ klini int isk valeun 0.
    //   int count = (int) Stream.ofNullable(5000).count();
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(1,2,3,3,3);
//        Stream<Integer> stream = list.stream();
//        System.out.println(Stream.ofNullable(3).count());
//
//
//    }

    //How iterations are different between collections and streams
    //stream-i foreach@ collection@ veracuma streami heto nor iteracia e katarum


}
