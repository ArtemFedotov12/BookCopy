package com.start.examples.test31Enums;

import java.util.*;

public enum ActionType {
    IMAGE("image"),
    MOUSE("mouse"),
    ARROW("arrow"),
    HIGHLIGHT("highlight"),
    EXPLANATION("explanation"),
    KEY_PRESS("keyPress"),
    INPUT_RADIO("inputRadio"),
    INPUT_TEXT("inputText"),
    SELECT_SINGLE("selectSingle");

    private final String value;
    private static final Map<String, ActionType> valueMap;
    private static final Set<String> highlightValues;

    static {
        Set<String> highlightSet = new HashSet<>();
        highlightSet.add(MOUSE.getValue());
        highlightSet.add(HIGHLIGHT.getValue());
        highlightSet.add(EXPLANATION.getValue());
        highlightSet.add(INPUT_RADIO.getValue());
        highlightSet.add(INPUT_TEXT.getValue());
        highlightSet.add(SELECT_SINGLE.getValue());
        highlightValues = Collections.unmodifiableSet(highlightSet);

        valueMap = new HashMap<>();
        for (ActionType actionType : ActionType.values()) {
            valueMap.put(actionType.getValue(), actionType);
        }
    }

    ActionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Set<String> getHighlightValues() {
        return highlightValues;
    }

    public static ActionType getByValue(String value) {
        return valueMap.get(value);
    }
}

