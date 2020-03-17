package com.start.examples.test5Patterns.CreationDesingPatterns.adapter;

import com.start.examples.test5Patterns.CreationDesingPatterns.adapter.phone.Samsung;
import com.start.examples.test5Patterns.CreationDesingPatterns.adapter.wrapper.PhoneWrapper;

public class Main {
    public static void main(String[] args) {
        /*
         * We have multitude implementation of Phone interface(Samsung,Nokia,Iphone ....)
         * Code below is forbidden to change, except our injection.(new PhoneWrapper(new Samsung());)
         */
        SmthWhatCanWahsItself smthWhatCanWahsItself = new PhoneWrapper(new Samsung());
        smthWhatCanWahsItself.wash();

    }
}
