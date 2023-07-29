package com.example.streamApi.composition_aggregation_association.aggregation;

public class Main {

    //Aggregation

    //In aggregation, entities are loosely coupled together. The each entity can survive its own, independently.
    //There is only a dependency on the other. If the Container is destroyed, Component should be able to survive.

    //Let’s take an example…

    //Imagine we have Employee class having id, name and address. Here address in having street and city. Basically we have 2 classes. Employee and Address.
    //According to aggregation definition, the Address should be independent in which the Employee is composed of an address. Address should be able to survive its own.

    //Look at the below snippet. Employee is accepting an address object via the constructor which means we need an address to create an Employee.
    //Employee HAS an Address!

    //But see here..
    //The address object can live in the code, without any help of Employee! Outer world can create Address objects without any interference.

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Street 1");

        Employee employee = new Employee(1, "John", address);
        System.out.println(employee);
    }

    private static class Employee {

        private final int id;
        private final String name;
        private final Address address;

        public Employee(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return "AggregateEmployee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    private static class Address {
        String street;

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreet() {
            return street;
        }
    }
}
