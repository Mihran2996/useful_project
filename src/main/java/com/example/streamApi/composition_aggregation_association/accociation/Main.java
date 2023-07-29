package com.example.streamApi.composition_aggregation_association.accociation;

public class Main {

    //WHAT IS THE ASSOCIATION?

    //Association in Java is a connection or relation between two separate classes that are set up through their objects.
    //Association relationship indicates how objects know each other and how they are using each other’s functionality.
    //It can be one-to-one, one-to-many, many-to-one, and many-to-many.

    //TWO FORMS OF ASSOCIATION
    //Composition and Aggregation are the two special forms of association. Let’s check them out with the help of an example.

    //COMPOSITION
    //It is a “belongs-to” type of association.
    //It simply means that one of the objects is a logically larger structure, which contains the other object.
    //In other words, it’s part or member of the larger object.
    //Alternatively, it is often called a “has-a” relationship

    //FOR EXAMPLE
    //a building has a room, or in other words, a room belongs to a building.
    //The composition is a strong kind of “has-a” relationship because the objects’ lifecycles are tied.
    // It means that if we destroy the owner object, its members also will be destroyed with it.

    //AGGREGATION
    //That is also a “has-a” relationship,
    //but, what distinguishes it from composition, is that the lifecycles of the objects are not tied.
    // Both the entries can survive individually which means ending one entity will not affect the other entity.
    //Both of them can exist independently of each other.
    // Therefore, it is often referred to as week association.

    //FOR EXAMPLE
    //A player who is a part of the team can exist even when the team ceases to exist.
    // The main reason why you need Aggregation is to maintain code reusability.
}
