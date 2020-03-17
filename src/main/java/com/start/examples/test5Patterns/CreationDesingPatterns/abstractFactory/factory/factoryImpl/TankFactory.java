package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.factoryImpl;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.Factory;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.tank.Tank;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.tank.tankImpl.Tank52;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.tank.tankImpl.Tank53;

public class TankFactory implements Factory {

    @Override
    public Tank createProduct(String name) {
        switch (name) {
            case "Tank52": return new Tank52();
            case "Tank53":   return new Tank53();
            default:
                return null;
        }
    }
}
