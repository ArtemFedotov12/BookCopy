package com.start.examples.test30EXCEPTIONS;

public class Main {
    public static void main(String[] args) throws DaoException {
        Main main = new Main();
        try {
            main.method1();
        }catch (DaoException e) {
            throw new DaoException(e.getMessage(),e);
        }

    }

    void method1() throws DaoException {
        method2();
    }

    void method2() throws DaoException {
        method3();
    }
    void method3() throws DaoException {
        Dao30 dao30 = new BookDao30();
        dao30.save();
    }


}
