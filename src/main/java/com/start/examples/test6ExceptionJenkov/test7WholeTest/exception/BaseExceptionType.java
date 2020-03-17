package com.start.examples.test6ExceptionJenkov.test7WholeTest.exception;

import lombok.Getter;


@Getter
public enum BaseExceptionType {

    CONNECTION_REJECTED("BASE-001", "Connection failed"),
    CONNECTION_CLOSED("BASE-002","Connection closed");

    private final String code;
    private final String reason;

    BaseExceptionType(String code, String reason) {
        this.code = code;
        this.reason = reason;
    }

}
