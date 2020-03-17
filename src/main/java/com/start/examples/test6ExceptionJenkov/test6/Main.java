package com.start.examples.test6ExceptionJenkov.test6;

public class Main {
    public static void main(String[] args) {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("kek");
        } catch (Throwable t ) {
            System.out.println("tttt");
        }
    }
}
