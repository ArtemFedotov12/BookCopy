package com.start.examples.test1;

import lombok.ToString;

@ToString
public class StringBuilders {
    int age;
    float k;

    public StringBuilders() {
        this(2);
        this.k=100;
    }

    public StringBuilders(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        StringBuilders stringBuilders = new StringBuilders();
        System.out.println(stringBuilders);

    }
}
