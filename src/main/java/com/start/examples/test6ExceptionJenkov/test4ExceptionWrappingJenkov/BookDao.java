package com.start.examples.test6ExceptionJenkov.test4ExceptionWrappingJenkov;

public interface BookDao {

    void saveBook() throws DaoException;
    void deleteBook() throws DaoException;

}
