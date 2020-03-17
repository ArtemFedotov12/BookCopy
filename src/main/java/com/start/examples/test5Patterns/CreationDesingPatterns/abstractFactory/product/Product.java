package com.start.examples.test5Patterns.CreationDesingPatterns.abstractFactory.product;

public interface Product {

     default  void print() {
         System.out.println(this.getClass().getSimpleName());
     }

     void message();

}
