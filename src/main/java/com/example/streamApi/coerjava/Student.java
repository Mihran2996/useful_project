package com.example.streamApi.coerjava;

import java.util.List;

public class Student implements Cloneable {

    private String name;
    private String surname;
    private List<String> anyList;
    private Book book;

    public Student(String name, String surname, List<String> anyList, Book book) {
        this.name = name;
        this.surname = surname;
        this.anyList = anyList;
        this.book = book;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        Student student = (Student) super.clone();
        student.book = (Book) student.book.clone();
        return student;
    }

    public List<String> getAnyList() {
        return anyList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAnyList(List<String> anyList) {
        this.anyList = anyList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
