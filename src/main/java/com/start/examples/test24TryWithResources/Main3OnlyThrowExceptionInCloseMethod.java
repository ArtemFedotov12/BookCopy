package com.start.examples.test24TryWithResources;

import com.start.examples.test20ExceptionUtf.Exc;

public class Main3OnlyThrowExceptionInCloseMethod {
    public static void main(String[] args) {
        try {
            tryWithResourcesTwoResources();
        } catch (Exception e) {
            e.printStackTrace();
            //Throwable[] suppressed = e.getSuppressed();
        }
    }

    public static void tryWithResourcesTwoResources() throws Exception {
        try(AutoClosableResource resourceOne = new AutoClosableResource("One", true);
        ){
            resourceOne.doOp(false);
            System.out.println("kke");
        }catch (Exception e) {
            System.out.println(e.getMessage()+"!!!");
        }
    }
}
