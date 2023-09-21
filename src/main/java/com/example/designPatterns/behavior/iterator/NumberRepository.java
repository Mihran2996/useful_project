package com.example.designPatterns.behavior.iterator;

public class NumberRepository implements Container {

    private String[] numbers = {"one", "two", "three", "four"};

    @Override
    public CustomIterator getCustomIterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements CustomIterator {

        private int index;

        @Override
        public boolean hasNext() {
            if (index < numbers.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return numbers[this.index++];
            }
            return null;
        }
    }
}
