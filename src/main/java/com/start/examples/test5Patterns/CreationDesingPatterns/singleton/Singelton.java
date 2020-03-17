package com.start.examples.test5Patterns.CreationDesingPatterns.singleton;

public class Singelton {

    private Singelton() {
    }

    private static final class Helper{
        private static final Singelton SINGELTON = new Singelton();
    }

    public static Singelton getInstance() {
        return Helper.SINGELTON;
    }

}
