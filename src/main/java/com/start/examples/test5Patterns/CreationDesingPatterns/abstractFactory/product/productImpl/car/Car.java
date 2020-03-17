package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.car;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.Product;

public interface Car extends Product {


    @Override
    default void message() {
        System.out.println("car!!!");
    }
}
