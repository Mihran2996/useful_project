package com.example.streamApi.spring.beanFactory;

public class Employee {
    private String name;
    private String surname;
    public static boolean isBeanInstantiated = false;


    public void setName(String name) {
        this.name = name;
    }

    public void postConstruct() {
        setIsBeanInstantiated(true);
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee() { }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static boolean isIsBeanInstantiated() {
        return isBeanInstantiated;
    }

    public static void setIsBeanInstantiated(boolean isBeanInstantiated) {
        Employee.isBeanInstantiated = isBeanInstantiated;
    }

}
