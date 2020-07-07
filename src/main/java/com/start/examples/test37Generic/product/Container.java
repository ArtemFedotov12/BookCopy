package com.start.examples.test37Generic.product;

import java.util.Collections;

public class Container<T extends Product> {

    public static void main(String[] args) {

    }

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
