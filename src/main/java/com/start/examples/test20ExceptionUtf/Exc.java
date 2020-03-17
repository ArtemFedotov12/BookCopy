package com.start.examples.test20ExceptionUtf;

public class Exc extends RuntimeException {

    private static final String message = "кек";

    public Exc() {
        super(message);
    }
}
