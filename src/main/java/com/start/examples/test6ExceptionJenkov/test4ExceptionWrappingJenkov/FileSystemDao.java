package com.start.examples.test6ExceptionJenkov.test4ExceptionWrappingJenkov;


import java.io.IOException;

public class FileSystemDao implements BookDao {

    @Override
    public void saveBook() throws DaoException {

        try {
            throw new IOException("fileSystem!");
        } catch (IOException e) {
            throw new DaoException(e.getMessage(), e);
        }

    }

    @Override
    public void deleteBook() throws DaoException {

    }

}
