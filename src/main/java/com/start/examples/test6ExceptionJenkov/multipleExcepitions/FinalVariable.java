package com.start.examples.test6ExceptionJenkov.multipleExcepitions;

public class FinalVariable {
    public static void main(String[] args) {
        try {
            throw  new NullPointerException();
        }catch (NullPointerException | IndexOutOfBoundsException exe) {
            //cannot assign value to final variable
            //exe= new NullPointerException();
            throw exe;
        }
    }
}
