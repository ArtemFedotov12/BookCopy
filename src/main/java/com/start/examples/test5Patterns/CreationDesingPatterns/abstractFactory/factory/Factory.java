package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.factory;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.Product;

public interface Factory {

    Product createProduct(String name);

}
