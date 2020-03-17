package com.start.examples.test6ExceptionJenkov.test1;

public class Main {
    public static void main(String[] args) {

        try {
            rethrow("one");
        } catch (FirstException | SecondException e) {
            System.out.println(e.getMessage() + "+++++++");
        }

    }
    static void rethrow(String s) throws FirstException, SecondException {

        try {
            if (s.equals("one")) {
                throw new FirstException("f1");
            }
            else {
                throw new SecondException("s2");
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
