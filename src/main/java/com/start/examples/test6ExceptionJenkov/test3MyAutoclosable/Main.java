package com.start.examples.test6ExceptionJenkov.test3MyAutoclosable;

public class Main {
    public static void main(String[] args) {

        try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
            myAutoClosable.doIt();
        } catch (Exception e) {
            System.out.println("Catch!" + e.getMessage());
        }
        finally {
            System.out.println("Finally!");
        }
    }
}
