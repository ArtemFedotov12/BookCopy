package com.start.examples.test10Protected.goose;


import com.start.examples.test10Protected.shore.Bird;

public class Gosling extends Bird { // extends means create subclass
    public void swim() {
        super.floatInWater(); // calling protected member
        System.out.println(text); // calling protected member

    }


}