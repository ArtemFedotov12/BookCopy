package com.start.examples.test6ExceptionJenkov.test2;

import java.sql.SQLException;

public class Parent {

    public void kek() throws SQLException {
        System.out.println("kek");
        throw  new SQLException();
    }

}
