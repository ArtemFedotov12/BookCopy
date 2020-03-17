package com.start.examples.test6ExceptionJenkov;

import com.start.examples.test20ExceptionUtf.Exc;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {

    try {
        m1();
    } catch (Exception e) {
        System.out.println(e);
    }


    }


    static void m1() {
        m2();

    }

    static void m2() {
        m3();

    }

    static void m3() {
        throw new NullPointerException();

    }


}
