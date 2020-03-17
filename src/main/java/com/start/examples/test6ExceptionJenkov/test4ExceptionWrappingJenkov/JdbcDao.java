package com.start.examples.test6ExceptionJenkov.test4ExceptionWrappingJenkov;

import java.io.IOException;
import java.sql.SQLException;

public class JdbcDao implements BookDao {

    @Override
    public void saveBook() throws DaoException {

        try {
            throw new SQLException("sqlException!");
        } catch (SQLException e) {
            throw new DaoException(e.getMessage(), e);
        }

    }

    @Override
    public void deleteBook() throws DaoException {

    }
}
