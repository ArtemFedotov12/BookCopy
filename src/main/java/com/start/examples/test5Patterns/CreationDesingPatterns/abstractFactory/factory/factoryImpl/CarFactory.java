package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.factoryImpl;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.Factory;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.car.Car;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.car.carImpl.Camry;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.car.carImpl.Corolla;

public class CarFactory implements Factory {

    @Override
    public Car createProduct(String name) {

        switch (name) {
            case "Corolla": return new Corolla();
            case "Camry":   return new Camry();
            default:
                return null;
        }


    }
}
