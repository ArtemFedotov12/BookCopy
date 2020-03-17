package com.start.examples.test6ExceptionJenkov.test7WholeTest.exception;

public class ConnectionRejectedException extends BaseException {

    private static final String defaultMessage = "Connection with number '%s' doesn't  satisfy connection requirements '%s' ";
    
    public ConnectionRejectedException(int connectionNumber, String connectionRequirements) {
        super(String.format(defaultMessage,connectionNumber,connectionRequirements));

    }

    public ConnectionRejectedException(String message) {
        super(message);
    }

    @Override
    public BaseExceptionType getType() {
        return BaseExceptionType.CONNECTION_REJECTED;
    }

}
