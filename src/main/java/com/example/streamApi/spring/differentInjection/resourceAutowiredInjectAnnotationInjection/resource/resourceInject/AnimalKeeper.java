package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class AnimalKeeper {
    //estex kunenaq exception vorovhetev Animal@ uni tarber realizacianer,qani vor pordzume inject anel byType
    //xndir@ karoxenq lucel @Qualifier()annotation@
    //kam field-i anun@ dnel tiger kam lion es paragayum khaskana te vor realizacianenq uzum inject lini,inject ByName

    //inject byName
    @Resource
    private Animal tiger;

    //karoxenq ogtagorcel @Qualifier() anotacian
    //ete nuynisk anun@ sxal tanq na ksksi man gal byName'
    //isk @Autowired ev @inject annotacianer@ kqcen exception
//    @Resource
//    @Qualifier("incorrect")
//    private Animal tiger;



    //inject byName
    //    @Autowired
//    private Animal tiger;


    public Animal getTiger() {
        return tiger;
    }
}