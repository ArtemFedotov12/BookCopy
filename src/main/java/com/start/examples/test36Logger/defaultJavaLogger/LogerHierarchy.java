package com.start.examples.test36Logger.defaultJavaLogger;

import java.util.logging.Logger;

public class LogerHierarchy {
    private static final Logger LOGGER2 = Logger.getLogger(LogerHierarchy.class.getName());
    public static void main(String[] args) {
        System.out.println(LOGGER2.getParent());

        // EMPTY see getParent() javadoc
        Logger logger10 = Logger.getLogger("com.jenkov.web");
        System.out.println(logger10.getParent().getName() + " s");

        Logger logger  = Logger.getLogger("");
        Logger logger1 = Logger.getLogger("com");
        Logger logger2 = Logger.getLogger("com.jenkov");
        Logger logger3 = Logger.getLogger("com.jenkov.web");
        //com.jenkov
        System.out.println(logger3.getParent().getName());
    }
}
