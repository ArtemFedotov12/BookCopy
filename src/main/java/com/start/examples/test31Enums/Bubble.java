package com.start.examples.test31Enums;

enum Bubble {

    TYPE("default"),
    TEXT("default"),
    bubbleStyle("default");


    private String  value;

    Bubble(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}