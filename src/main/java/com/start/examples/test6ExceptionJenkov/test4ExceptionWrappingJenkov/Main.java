package com.start.examples.test6ExceptionJenkov.test4ExceptionWrappingJenkov;

public class Main {
    public static void main(String[] args) {

        BookDao bookDao = new FileSystemDao();

        try {
            bookDao.saveBook();
        } catch (DaoException e) {
            e.printStackTrace();
            System.out.println("Message : " + e.getMessage() + "Cause : " + e.getCause());
        }

    }
}
