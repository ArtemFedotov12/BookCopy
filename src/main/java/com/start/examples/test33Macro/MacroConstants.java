package com.start.examples.test33Macro;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum MacroConstants {

    HEADING("doc_caption"),
    HIGHLIGHT("free_marker");

    private static final List list = Arrays.asList("doc_caption", "free_marker");

    private final String value;

    MacroConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static boolean isContains(String value) {
        for (MacroConstants macroConstant: MacroConstants.values()) {
            if (value.equals(macroConstant.getValue())) {
                return true;
            }
        }
        return false;
    }
}
