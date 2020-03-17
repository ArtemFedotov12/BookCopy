package com.start.examples.test36Logger.defaultJavaLogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogLevels {
    public static void main(String[] args) {
        Logger logger      = Logger.getLogger("");
        Logger logger1     = Logger.getLogger("1");
        Logger logger1_2   = Logger.getLogger("1.2");

        logger1  .setLevel(Level.WARNING);
        logger1_2.setLevel(Level.FINE);

        logger     .info("msg:");
        logger1    .info("msg: 1");
        logger1_2  .info("msg: 1.2");
    }
}
