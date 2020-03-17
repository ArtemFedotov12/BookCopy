package com.start.examples.test31Enums;

public class Main {
    public static void main(String[] args) {

            Color color =  Enum.valueOf(Color.class, "GREEN");
        System.out.println(color.getValue());


    }
}
