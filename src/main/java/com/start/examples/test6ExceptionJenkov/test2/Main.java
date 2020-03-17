package com.start.examples.test6ExceptionJenkov.test2;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Children();
        try {
            parent.kek();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
