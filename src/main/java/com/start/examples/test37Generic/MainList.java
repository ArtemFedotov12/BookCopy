package com.start.examples.test37Generic;

import com.start.examples.test37Generic.cars.Camry;
import com.start.examples.test37Generic.cars.Car;
import com.start.examples.test37Generic.cars.Toyota;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        listSuper(carList);

        List<Camry> camryList = new ArrayList<>();
        camryList.add(new Camry());
        camryList.add(new Camry());
        listExtend(camryList);
    }

    public static void listSuper(List<? super Toyota> list) {
        list.add(new Camry());
        list.add(new Toyota());
        Object o = list.get(0);
        System.out.println(list);
    }

    public static void listExtend(List<? extends Toyota> list) {
        Toyota toyota = list.get(0);
        System.out.println(list);
        //list.add(new Toyota()); we can pass here "list of Camry" or lower so we can't add anything
    }


}
