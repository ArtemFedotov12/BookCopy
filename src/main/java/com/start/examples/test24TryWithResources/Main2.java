package com.start.examples.test24TryWithResources;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 21.11.2019
 */
public class Main2 {
    public static void main(String[] args){
        try {
            tryWithResourcesTwoResources();
        } catch (Exception e) {
            e.printStackTrace();
            Throwable[] suppressed = e.getSuppressed();
            System.out.println("suppressed = " + suppressed);
        }
    }

    public static void tryWithResourcesTwoResources() throws Exception {
        try(AutoClosableResource resourceOne = new AutoClosableResource("One", true);
            AutoClosableResource resourceTwo = new AutoClosableResource("Two", true)
        ){
            resourceOne.doOp(true);
            System.out.println("kke");
            resourceTwo.doOp(true);
        }
    }
}
