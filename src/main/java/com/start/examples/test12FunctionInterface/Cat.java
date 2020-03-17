package com.start.examples.test12FunctionInterface;

public class Cat implements Animal{

    private int number=counter;
    private static int counter=0;
    private boolean hop;

    public Cat(boolean hop) {
        counter++;
        this.hop = hop;
    }

    public void setHop(boolean hop) {
        this.hop = hop;
    }

    @Override
    public boolean canHop() {
        return hop;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" " +number+"/n";
    }
}
