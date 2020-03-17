package com.start.examples.test36Logger.log4jMy;


import org.apache.log4j.Logger;

public class Main {
    // log4j
    private static final Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) {


        Helper helper = new Helper();

        try {
            helper.divide(5);
        }catch (ArithmeticException e) {
            logger.error("ArithmeticException ---",e);
        }

    }

}
