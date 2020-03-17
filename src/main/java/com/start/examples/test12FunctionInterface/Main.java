package com.start.examples.test12FunctionInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(true);
        Cat cat2 = new Cat(false);
        Cat cat3 = new Cat(true);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        CanHop canHop = Animal::canHop;

        cats
                .stream()
                .filter(Cat::canHop)
                .forEach(System.out::println);



    }
}
