package com.start.examples.test5Patterns.CreationDesingPatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }


    private static class Helper{
        private static final BillPughSingleton BILL_PUGH_SINGLETON = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.BILL_PUGH_SINGLETON;
    }

}
