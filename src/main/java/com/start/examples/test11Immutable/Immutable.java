package com.start.examples.test11Immutable;

public final class Immutable {

    private final String  name;
    private final int age;
    private final Cat cat;
    private final StringBuilder stringBuilder;

    public Immutable(String name, int age, Cat cat) {
        this.name = name;
        this.age = age;
        this.cat = cat;
        this.stringBuilder = new StringBuilder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat getCat() throws CloneNotSupportedException {
        return cat.clone();
    }

    public StringBuilder getStringBuilder() {
        return new StringBuilder(stringBuilder);
    }
}
