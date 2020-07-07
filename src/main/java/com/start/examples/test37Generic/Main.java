package com.start.examples.test37Generic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Field with id=%s doesn't exist within the company with id=%s";

        System.out.println(String.format(str, "10", "25"));
    }
}
