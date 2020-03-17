package com.start.examples.test30EXCEPTIONS;

import java.sql.SQLException;

public class BookDao30 implements Dao30 {

    @Override
    public void save() throws DaoException {
        try {
            throw new SQLException("sql ex");
        }catch (SQLException e) {
            throw new DaoException(e.getMessage(),e);
        }

    }

    @Override
    public void delete() throws DaoException {
        try {
            throw new SQLException("sql ex");
        }catch (SQLException e) {
            throw new DaoException(e.getMessage(),e);
        }
    }

}
