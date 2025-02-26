package com.dmdev.lesson10;

public class Person {
    private final int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean asBoolean() {
        return this.id > 10;
    }
}
