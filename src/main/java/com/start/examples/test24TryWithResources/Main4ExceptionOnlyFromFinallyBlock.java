package com.start.examples.test24TryWithResources;

public class Main4ExceptionOnlyFromFinallyBlock {
    public static void main(String[] args) {
        try {
            tryWithResourcesSingleResource();
        } catch (Exception e) {
            e.printStackTrace();
            Throwable[] suppressed = e.getSuppressed();
        }
    }

    public static void tryWithResourcesSingleResource() throws Exception {
        try(AutoClosableResource resourceOne = new AutoClosableResource("One", true)) {
            resourceOne.doOp(false);
        } catch(Exception e) {
            Throwable[] suppressed = e.getSuppressed();
            throw e;
        } finally {
            throw new Exception("Hey, an exception from the finally block");
        }
    }

}
