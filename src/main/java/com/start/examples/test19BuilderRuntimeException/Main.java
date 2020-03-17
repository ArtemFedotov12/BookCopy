package com.start.examples.test19BuilderRuntimeException;

public class Main {
    public static void main(String[] args) {
        RuntimeException runtimeException = BuilderException
                .builder()
                .name("kek")
                .age(2)
                .build();

    }
}
