package com.start.examples.test28LombokEnum;

import lombok.ToString;

//@ToString
public enum MyEnum {
    VALUE_A,
    VALUE_B;

    @Override
    public String toString() {
        return "MyEnum{}";
    }
}
