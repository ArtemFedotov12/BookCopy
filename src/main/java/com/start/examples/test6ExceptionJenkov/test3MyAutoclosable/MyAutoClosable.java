package com.start.examples.test6ExceptionJenkov.test3MyAutoclosable;

public class MyAutoClosable implements AutoCloseable {

    public void doIt() throws Exception {
        System.out.println("MyAutoClosable doing it!");
        throw new Exception("kkkk");
    }

    @Override
    public void close() {
        System.out.println("MyAutoClosable closed!");
    }
}