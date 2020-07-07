package com.start.examples.test37Generic.createGenericInstance;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenericFactory<MyClass> factory = new GenericFactory<>(MyClass.class);

        // only for empty constructor,
        // if constructor has parameters throw InstantiationException
        MyClass myClassInstance = factory.createInstance();

        System.out.println(myClassInstance.getName());

    }
}
