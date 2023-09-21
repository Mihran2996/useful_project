package com.example.test;

public class List {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            expand(array.length + 10);
        }
        array[size++] = value;
    }

    public void add(int[] array) {
        for (int element : array) {
            add(element);
        }
    }

    public void add(int index, int value) {
        checkIndex(index);
        expand(1);
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public void delete(int index) {
        checkIndex(index);
        int temp[] = new int[size - 1];
        int i, j = 0;
        for (i = 0; i < size; i++) {
            if (i == index) {
                continue;
            }
            temp[j++] = array[i];
        }
        array = temp;
        size--;
    }

    public void set(int index, int value) {
        checkIndex(index);
        array[index] = value;
    }

    public int get(int index) {
        checkIndex(index);
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek(int index) {
        checkIndex(index);
        int element = get(index);
        delete(index);
        return element;
    }

    public int size() {
        return this.size;
    }

    public int getIndex(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean constrains(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    private void checkIndex(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("tvyal index-ov element masivum chka");
        }
    }


    private void expand(int capacity) {
        int temp[] = new int[array.length + capacity];
        int indexOf = 0;
        for (int i = 0; i < size; i++) {
            temp[indexOf++] = array[i];
        }
        array = temp;
    }

    public static void main(String[] args) {
        List list = new List();
        int arr[] = {50, 60, 80};
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 9);
        list.print();
        list.set(3, 100);
        list.print();
        list.delete(3);
        list.print();
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        list.print();
        System.out.println(list.peek(2));
        list.print();
        System.out.println(list.size());
        list.print();
        list.add(arr);
        list.print();
        System.out.println(list.size());
        System.out.println(list.getIndex(80));
        System.out.println(list.constrains(80));

    }


}
