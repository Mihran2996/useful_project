package com.example.streamApi.spring;

public class Main {

    //What are the different features of Spring Framework?

    //IOC CONTAINER
    //sa Springi himnakan hatkanishneric mekne vpr@ kargavorume java objectner@ ev patasxanatu e nranc life-circle hmaar
    //IOC-@ ogtagorcume DI- shablon@ beaner@ stexcelu hamar

    //MVC FRAMEWORK
    //TRANSACTION MANAGEMENT
    //SPRING WEB SERVICE
    //AOP


    //What are spring beans?
    //beaner@ ayn objectnern en voronq stexcvum ev karavarvum en containeri koxmic
    //beaner@ haytararvum enq 3 exanakov, XML faylov, Annotation-nnerov ev java configurationov,


    //What kind of Scope is there in Spring
    //SPRING-CORE-SCOPES  (SINGLETON , PROTOTYPE)
    //SINGLETON
    //ays scop@ springi default scopne,sa sarqume mek ekzemplyar abmboxj cragri hamara,
    //ev amen popoxutyun ira vra kazdi mnacac bolor hxumneri vra
    //PROTOTYPE
    //ays scop@ veradarndznume bean-i clon@ amen angam erb stexcumenq bean@
    //WEB-APPLICATION-SCOPES (REQUEST,SESSION,APPLICATION,WEBSOCKET)
    //REQUEST
    //amen HTTP requesti jamanak nor beane stexcvum
    //SESSION
    //Amen HTTP-sessioni jamanak nor bean kstexcvi containeri koxmic
    //APPLICATION
    //container@ kstexci bean@ ServletContext-i life-circle hamar henc vor application@ start lini ev verjanume erb avartvum kam reload e linum


    //What is Spring IOC Container?
    //IOC- INVERSION OF CONTROL
    //konteyner@ stexcume objectner,kargavorum nranq,karavarume nranc life-circl@
    //ayn ogtagorcume DI-DEPENDENCY INJECTION komponentner@ karavarelu hamar ev kaxvacutyan nerarkum anelu hamar
    //IOC-@ tramadrume erku tesaki containerne BEANFACTORY ev APPLICATIONCONTEXT

    //Differentiate between BeanFactory and ApplicationContext


    //ApplicationContext@ handisanume BeanFactory-i jarang
    //BEANFACTORY-n LAZY e,inq@ bean@ sarqume en jamanak erb kanchumenq context.getBean(beanName)
    //APPLICATIONCONTEXT @ ashxatume EAGER tarberakov
    //ApplicationContext @ avtomat registraciae anum BeanFactoryPostProcessor@ ev BeanPostProcessor@
    //BEANFACTORY-i haytni realizacian - XmlBeanFactory-n e
    //APPLICATIONCONTEXT@ realizacnume en`
    //1-ClassPathXmlApplicationContext- talisenq xml fayli anun@
    //2-FileSystemXmlApplicationContext - talisenq xml fayli path@
    //3-AnnotationConfigApplicationContext - ayn beaner@ voronq  nshvacen annotationov, talisenq beani.class@;


    //Spring bean scopes, when use what?

    //SINGLETON -Container-i hamar Spring@ kstexci mek ekzemplyar,Spring@ default ogtagorcume ays scop@
    //PROTOTYPE - amena angma erb context.getBean(beanName) method@ kkancgvi container@ kveradardzni nor ekzemplyar
    //REQUEST - sa nmane PROTOTYPE bean-in,ogtagorcvume WEB application-um,amen HTTP requesti jamanak ksarqvi nor ekzemplyar
    //SESSION - Container@ kstexci nor bean amen HTTP Session -in jamanak
    //GLOBAL-SESSION - Container@ sarquma mek ekzemplyar global session-i jamanak


    //What's scoped bean injection problem?
    //erb singleton beani mej @Autowired unenq arac prototype bean

    //What are different types of autowiring? @Resource vs @Autowired vs @Inject
    //@Resource ev @Inject annotationner@ gtnvumen javax.annotation package-i mej
    //@Autowired Annotation@ gtnvum e org.springframework.beans.factory.annotation package-i mej
    //@Resource annotation-@ chi karox inject anel constructori mijocov


    //Setter injection vs constructor injection?
    //Constructor injection@ aydqanel @nterneli che ete kan shat fielder
    //Setter injection@ @nterneli e
    //Constructor injection@ pahpanume immutable linel@
    //Constructor injection@ karoxe hanqecnel circular dependency-i,ayd paragayum kunenanq  ObjectCurrentlyInCreationException
    //ete A objecti constructori mej injecte arvum B-n ev hakarak@ apa kunenaq ObjectCurrentlyInCreationException
    //setter injection@ tuyle talis change anel inject exac bean@
    //ete menq ogtagorcumenq erku tesaknel inject anelu hamar apa IOC container@ kogtagorci setter injection vorovhetev constructoric heto ashxaatume setter method@
    //menq garancia chunenq vor setter injection@ inject kani bean@
    //myus koxmic constructor injection@ minjev chpatrasti dependence-ner@ chi ta mez patrasti object@


    //What is Autowiring in Spring?
    //Spring@ tramadrume chaparh vor@ avtomat kerpov karoxe bacahaytel tarber bean-eri mijev exac relationship@
    //ays ameninj@ kareli anel haytararelov bolor bean@ xml faylum
    //autowiring @ uni 5 rejim
    //NO-  erb autowired chka,deafult sae
    //BYNAME- ays paragayum inject arvume setteri mijocov ev beani id-n ev ref-@ petqe nuyn@ lini
    //BYTYPE-injecte anum @st type-i,ogtagorcume setter, beani-i idn karoxe chhamnknel hxman het ev lini tarber,
    //CONSTRUCTOR - injecte arvum @st constructori,anpayman petqe unenaq hamapatasxan fieldov override arac constructor,
    //ete chunenaq ayd constructor@ ev unenanq bolor fielderov constructor apa inject chi ani
    //AUTODETECT-ays depqum kpordzi inject anel ast CONSTRUCTOR ete chi stacvum apa inject kani BYTYPE


    //What is Proxy
    //Proxy-n ogtagorcvume erb petqa mecacnel classi funkcionalutyun@ bayc chpopoxelov tvyal class@
    //ka CGLB ev DYNAMIC PROXY tarberakner@
    //CGLB-@ proxy stexceluc jarangume target class@
    //@cofiguration class@ chpetqe lini final, methodnernel chpetqe linen final kam private.
    //CGLB-i depqun qani angamel kanchvi method@ menak arajin angam kstecvi bean,
    // mnacac kancher@ uxxaki containeric kveradardznen goyutyun unecox bean@
    //ete bean veradardznox method@ statice apa aydex proxy-n chi gorci
    //DYNAMIC PROXY -n stexcvume implementacnelov target classi impelent arac interfacener@


}
