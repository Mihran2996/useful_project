package com.example.coerjava;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class DynamicArray<T> implements Cloneable{

    public T[] arrays;
    private int size;

    DynamicArray() {
        arrays = (T[]) new Object[2];
        size=0;
    }

    public void setArrays(T[] arrays) {
        this.arrays = arrays;
    }


    public void add(T value){
        if (size!=2){
            arrays[size++] = value;
        }else {
            System.out.println("Arrays is full!");
        }
    }

    public T[] getArrays() {
        return arrays;
    }

    private T[] copyValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        T[] copied = (T[]) new Object[this.arrays.length];
        for (int i = 0; i <this.arrays.length ; i++) {
            copied[i] = (T) this.arrays[i].getClass().getDeclaredMethod("clone").invoke(arrays[i]);
        }
        return copied;
    }


    @Override
    public Object clone()throws CloneNotSupportedException{
        DynamicArray<T>  clone =(DynamicArray<T> ) super.clone();
        try {
            clone.setArrays(copyValue());
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        return clone;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "arrays=" + Arrays.toString(arrays) +
                ", size=" + size +
                '}';
    }
}
