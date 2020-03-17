package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.productImpl.tank;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.Product;

public interface Tank extends Product {

    @Override
    default void message() {
        System.out.println("tank!!!");
    }

}
