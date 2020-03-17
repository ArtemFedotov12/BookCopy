package com.start.examples.test5Patterns.CreationDesingPatterns.adapter.phone;

public class Samsung extends Phone {
    @Override
    public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
