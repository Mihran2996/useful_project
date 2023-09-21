package com.example.designPatterns.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {
    private List<Integer> data = new ArrayList<>();

    public void executeData() {
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
    }

    public Prototype(){}

    public Prototype(List<Integer> data) {
        this.data = data;
    }

    public List<Integer> getData() {
        return data;
    }

    @Override
    protected Object clone() {
        List<Integer> clonedData = new ArrayList<>();
        data.forEach(clonedData::add);
        return new Prototype(clonedData);

    }
}
