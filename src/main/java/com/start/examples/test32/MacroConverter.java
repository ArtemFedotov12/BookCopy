package com.start.examples.test32;

import com.google.gson.JsonObject;
import com.start.examples.test32.macroItem.MacroItem;

public class MacroConverter {

    public JsonObject convert(MacroItem item) {
        return item.convert();
    }

}
