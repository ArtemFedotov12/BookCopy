package com.start.examples.test5Patterns.CreationDesingPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Big big = new Big
                .builder()
                .setAge(2)
                .setName("kek")
                .setMarried(false)
                .build();

        System.out.println(big);
    }

}
