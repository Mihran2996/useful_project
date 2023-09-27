package com.example.composition_aggregation_association.composition;

public class Main {

    //In contrast to aggregation in composition, entities are tightly coupled together. The dependent entity cannot survive its own.
    // If the Container is destroyed, Component is also destroyed and no longer exists.

    //Let’s take the same example…Employee and Address…

    //Now, Employee is accepting a parameter —  street which is needed to create an address.
    // Instead of injecting Address object via constructor, now employee is creating an Address object runtime inside the constructor.
    //And this Employee has a private inner class of Address!

    //Since it’s a private inner class, it’s not accessible to the outer world also!
    //Then clients cannot create independent objects of Address! It implies that Address is tightly coupled with the Employee…

    //******************************************************************************************************************

    //The benefits of using Composition is as follows:

    //Composition allows the reuse of code.
    //Java does not support multiple inheritances but by using composition we can achieve it.
    //It represents as a has-a relationship.
    //In composition, both entities are dependent on each other.
    //The composition is achieved by using an instance variable that refers to other objects.

    //******************************************************************************************************************

    //                                      E X A M P L E


    public static void main(String[] args) {
        Employee employee = new Employee(1, "john","Street 1");

        System.out.println(employee);
        employee = null;
        System.out.println(employee);

    }

    private static class Employee {

        private final int id;
        private final String name;
        private final Address address;

        public Employee(int id, String name,String street) {
            this.id = id;
            this.name = name;
            this.address = new Address(street);
        }

        public Address getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "AggregateEmployee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }

        private static class Address {
            String street;

            public Address(String street) {
                this.street = street;
            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        '}';
            }
        }
    }


}
