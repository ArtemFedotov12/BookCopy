package com.start.examples.test1;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;
    private String data;

    public Cat(String name, int age, String data) {
        this.name = name;
        this.age = age;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals Ttt");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hash");
        return Objects.hash(name);
    }
}
