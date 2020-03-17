package com.start.examples.test18FinalMethod;

public class Cat {

    final void go() {
        System.out.println("go");
    }

    void calc(Integer i) {
        i++;
        i+=10;
    }

    public static void main(String[] args) {
        Integer integer = 10;
        Cat cat = new Mur();
        cat.calc(integer);
        System.out.println(integer);



    }

}
