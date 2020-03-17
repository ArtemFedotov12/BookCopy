package com.start.examples.test36Logger.defaultJavaLogger;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    private static final Logger LOGGER = Logger.getGlobal();
    private static final Logger LOGGER2 = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        // default loging properties C:\Program Files\Java\jre1.8.0_241\lib\logging.properties
        // read our custom log.properties file
        System.out.println(System.getProperty("java.util.logging.config.file"));
        LogManager.getLogManager().readConfiguration();
        // C:\Users\anduser\java0.log will be created and log will be written
        Handler handler = new ConsoleHandler();//new FileHandler("%h/my.log");
       // handler.setFilter(new Myfilter());
        //handler.setFormatter(new MyFormatter());
        LOGGER2.setUseParentHandlers(false);
       // LOGGER2.addHandler(handler);
        System.out.println(LOGGER2.getName() + "------------------");
        System.out.println(LOGGER2.getParent() + "------------------");

        try {
            throw new Exception("My Exception!");
        } catch (Exception e) {
            LOGGER2.log(Level.WARNING,"message111",e);
        }


        LOGGER2.info("message");
        LOGGER2.finest("message222");
    }

    static class Myfilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("222");
        }
    }

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + " : " + record.getMessage() + record.getThrown() + "\n";
        }
    }

}
