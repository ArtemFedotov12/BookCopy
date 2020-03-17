package com.start.examples.test32;

import com.start.examples.test32.macroItem.LongoValuesMacroItem;
import com.start.examples.test32.macroItem.MacroItem;

public class Main {
    public static void main(String[] args) {

        MacroConverter macroConverter = new MacroConverter();

        MacroItem macroItem = new LongoValuesMacroItem(new Object());

        macroConverter.convert(macroItem);



    }
}
