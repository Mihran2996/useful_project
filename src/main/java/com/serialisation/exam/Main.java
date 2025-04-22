package com.serialisation.exam;

import java.io.*;

public class Main {

    //Example to serialize/deserialize object

    public static void main(String[] args) {
        Person person = new Person("Poxos", "Poxosyan");

        try {
            File person1 = File.createTempFile("person", ".txt", new File("/home/mihran/IdeaProjects/useful_project/src/main/resources"));

            FileOutputStream fos = new FileOutputStream(person1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);

            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("src/main/resources/person879392435759673261.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person2 = (Person) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(person2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
