package com.start.examples.test31Enums;

enum Color{
    RED("#FF0000"),
    BLUE("blue"),
    GREEN("green");

    private String value;
/*    private boolean booleanValue;
    private int intValue;
    private double doubleValue;*/

    Color(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}