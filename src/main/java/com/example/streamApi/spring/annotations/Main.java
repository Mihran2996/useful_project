package com.example.streamApi.spring.annotations;

public class Main {

    // @Autowired vs @Qualifier
    //@Autowired anotacin katarume DI
    //@Qualifier anotation ogtagorcumenq ayn jamank erb interfacen uni mi qani irakanacum
    //ev menq inject enq anum interfacei anunov vren avelacnumenq @Qualifier anotacion
    //ira mej mutqagrelov inject linox classi anun@ vorpeszi konflict chta

    //@Value what does it do?
    //Ays anotacian ogtagorcvume tvyal parametrin talov default value
    //karoxenq menq tal value ev ayn karoxe properties fayli mejic verdzni valuen
    //karoxen dnel fieldi vra,setteri ev constructori vra ev karoxe linel @ndunvox argument

    //erb menqenq talis
    //@Value("John")
    //private String trainee;

    //kardume properties ic
    //@Value("${car.brand")
    //private String brand;

    //ogtagorcumenq dnelov setteri vra kardalov properties faylic
    //@Value("${car.brand}")
    //public CarData setCarData(String color, String brand) {
    //    carData.setCarColor(color);
    //    carData.setCarBrand(brand);
    //}

    //ogtagorcum enq vorpes methodi @ndunox argument
    //@Value("${car.brand}")
    //public CarData setCarData(@Value("${car.color}") String color, String brand) {
    //    carData.setCarColor(color);
    //    carData.setCarBrand(brand);
    //}


    // @Component vs @Bean
    //ete nshvace @Component anotaciayov Spring@ avtomat khaytnaberi bean@
    //ete @Bean anotaciayove nshvac Spring@ avtomat chi haytaberi
    // petqe @ComponentScan anotacianel avelacnenq ev cuyc tanq  tex@
    //@Bean anotacion methodi hamare naxatesvac
    //@Component anotacian naxatesvace classi hamar
    //@Bean anotacian ashxatume menak ayn jamank ete ayd classum ka @Configuration anotacian
    //ete mez petqe konkret realizaciya menq ogtagorcumenq @Bean annotation @


    // @Repository vs @Service vs @Controller vs @Component
    //ays ereq anotacianer@ @Componenti jarangen handisanum
    //@Service anotacian nshumenq ayn classi vra vor@ vor biznes funkionalutyune katarum
    //@Repositor@ anotavian nshumenq ay classi vra vor@ uni mexanizm  save,create,delete  anelu hamar
    //@Controller anotacian nshumenq konkret classi vra vorpeszi kantralyori der tani


    //Controller classi vra chenq karox dnel @service kam @Repository annotations


    // @ExceptionHandler vs @ControllerAdvice
}
