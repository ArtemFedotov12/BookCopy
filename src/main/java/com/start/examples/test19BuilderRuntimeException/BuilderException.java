package com.start.examples.test19BuilderRuntimeException;

import lombok.Builder;

@Builder
public class BuilderException extends RuntimeException {

    String name;
    int age;

    public BuilderException(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }
}
