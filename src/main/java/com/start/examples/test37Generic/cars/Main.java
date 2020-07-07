package com.start.examples.test37Generic.cars;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cell<? super Toyota> cell = new Cell<>();

        cell.setT(new Toyota());
        cell.setT(new Camry());

        Object o =  cell.getT();
        System.out.println(o);

        cell.customOutput(new Toyota());
        cell.customOutput(new Camry());
        //cell.customOutput(new Car());

        Cell<? extends Toyota> cell10 = new Cell<>();

    }

    public static void kl(Cell<? super Toyota> cell) {
        cell.customOutput(new Camry());
        cell.setT(new Camry());
        cell.setT(new Toyota());

    }


}


