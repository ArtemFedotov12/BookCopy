package com.start.examples.test5Patterns.CreationDesingPatterns.prototype2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Animal<T extends Copyable<T>> implements IAnimal, Copyable<T> {

    private float weight;

    public abstract T copy();
    public abstract void run();

}
