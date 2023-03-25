package com.example.streamApi.spring.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeeAndDepartment.xml");
        Employee bean = context.getBean(Employee.class);
        bean.showEmployeeDetails();

    }
}
