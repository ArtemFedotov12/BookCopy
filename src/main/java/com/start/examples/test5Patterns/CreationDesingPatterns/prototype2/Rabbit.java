package com.start.examples.test5Patterns.CreationDesingPatterns.prototype2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rabbit extends Animal<Rabbit> {

    private String specificRabbitField;


    @Override
    public Rabbit copy() {
        Rabbit rabbit = new Rabbit();
        rabbit.setSpecificRabbitField(this.getSpecificRabbitField());
        rabbit.setWeight(this.getWeight());
        return rabbit;
    }

    @Override
    public void run() {
        System.out.println("Rabbit run");
    }

}
