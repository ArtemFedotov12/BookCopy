package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory;

import com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product.Product;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {

        Product product =  new FactoryOfFactory().factory("carFactory").createProduct("Camry");
        Product product2 = new FactoryOfFactory().factory("TankFactory").createProduct("Tank52");



        product.message();
        product2.message();

    }

}
