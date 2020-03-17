package com.start.examples.test32.macroItem;

import com.google.gson.JsonObject;

public abstract class AbstractMacroItem implements MacroItem {

    private Object object;

    public AbstractMacroItem(Object object) {
        this.object = object;
    }

    public abstract JsonObject convert();

}
