package com.example.streamApi.spring.autowiring;

import ch.qos.logback.classic.db.names.SimpleDBNameResolver;

public class Employee {
    private int id;
    private String name;
    private Department department;

    Employee() {
        System.out.println("called constructor with no parameter!");
    }

    Employee(Department department) {
        System.out.println("called constructor with 'department'  parameter");
        this.department = department;
    }

    Employee(int id, String name) {
        System.out.println("called constructor with 'id, name'  parameters");
        this.id = id;
        this.name = name;
    }

    Employee(int id, String name,Department department) {
        System.out.println("called constructor with 'id, name, department'  parameters");
        this.id = id;
        this.name = name;
        this.department = department;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department.getDeptName());
    }
}