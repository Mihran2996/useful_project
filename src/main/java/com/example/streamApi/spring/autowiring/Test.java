package com.example.streamApi.spring.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        //autowiring @ uni 5 rejim
        //NO-  erb autowired chka,deafult sae
        //BYNAME- ays paragayum inject arvume setteri mijocov ev beani id-n ev ref-@ petqe nuyn@ lini
        //BYTYPE-injecte anum @st type-i,ogtagorcume setter, beani-i idn karoxe chhamnknel hxman het ev lini tarber,
        //CONSTRUCTOR - injecte arvum @st constructori,anpayman petqe unenaq hamapatasxan fieldov override arac constructor,
        //ete chunenaq ayd constructor@ ev unenanq bolor fielderov constructor apa inject chi ani
        //AUTODETECT-ays depqum kpordzi inject anel ast CONSTRUCTOR ete chi stacvum apa inject kani BYTYPE
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeeAndDepartment.xml");
        Employee bean = context.getBean(Employee.class);
        bean.showEmployeeDetails();

    }
}
