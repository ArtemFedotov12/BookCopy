package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.factoryImpl.CarFactory;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.Factory;
import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory.factoryImpl.TankFactory;

public class FactoryOfFactory {

    Factory factory(String factory) {

        switch (factory){
            case "carFactory": return new CarFactory();
            case "TankFactory": return new TankFactory();
            default: return null;
        }


    }

}
