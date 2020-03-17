package com.start.examples.test6ExceptionJenkov.test7WholeTest.exception;

public abstract class BaseException extends RuntimeException {

    private static final long serialVersionUID = -2572473838662713721L;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract BaseExceptionType getType();

    public String getCode() {
        return getType().getCode();
    }

    public String getReason() {
        return getType().getReason();
    }

    protected Object[] getArguments() {
        return null;
    }

}
