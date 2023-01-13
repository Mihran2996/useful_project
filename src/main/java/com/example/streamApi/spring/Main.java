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


    //What is Spring IOC Container?
    //IOC- INVERSION OF CONTROL
    //lonteyner@ stexcume objectner,kargavorum nranq,karavarume nranc life-circl@
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


}
