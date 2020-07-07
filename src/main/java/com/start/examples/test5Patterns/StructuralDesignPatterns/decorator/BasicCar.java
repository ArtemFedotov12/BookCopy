package com.start.examples.test5Patterns.StructuralDesignPatterns.decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}