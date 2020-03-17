package com.start.examples.test5Patterns.CreationDesingPatterns.adapter;

public class House implements SmthWhatCanWahsItself {
    @Override
    public void wash() {
        System.out.println(this.getClass().getSimpleName());
    }
}
