package com.start.examples.test24TryWithResources;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 21.11.2019
 */
public class Main {

    public static void main(String[] args){
        try {
            tryWithResourcesSingleResource();
        } catch (Exception e) {
            e.printStackTrace();
            //Throwable[] suppressed = e.getSuppressed();
        }
    }

    public static void tryWithResourcesSingleResource() throws Exception {
        try(AutoClosableResource resourceOne = new AutoClosableResource("One",true)) {
            resourceOne.doOp(true);
        }
    }

}
