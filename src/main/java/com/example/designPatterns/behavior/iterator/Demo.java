package com.example.designPatterns.behavior.iterator;

public class Demo {
    public static void main(String[] args) {
        NumberRepository numberRepository = new NumberRepository();

        CustomIterator customIterator = numberRepository.getCustomIterator();

        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }
    }
}
