package com.start.examples.test23TryWithResources;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 21.11.2019
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.orderOfClosingResources();

    }


    private void orderOfClosingResources() throws Exception {
        try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
             AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

            af.doSomething();
            as.doSomething();
            System.out.println("Before");
            return;
        }
    }

}
