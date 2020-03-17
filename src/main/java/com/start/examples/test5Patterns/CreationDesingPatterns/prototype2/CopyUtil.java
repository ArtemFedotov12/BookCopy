package com.start.examples.test5Patterns.CreationDesingPatterns.prototype2;

public class CopyUtil<T extends Copyable<T>> {

    public T copy(T object) {
        return object.copy();
    }

}
