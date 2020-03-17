package com.start.examples.test25AddingSuppresedExce;

import com.start.examples.test24TryWithResources.AutoClosableResource;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 22.11.2019
 */
public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        try {
            me();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void me() throws Exception {
        Exception finalException = null;
        try(AutoClosableResource resourceOne = new AutoClosableResource("One", true)) {
            resourceOne.doOp(false);
        } catch(Exception e) {
            finalException = new Exception("Error...");
            finalException.addSuppressed(e);
            for(Throwable suppressed : e.getSuppressed()){
                finalException.addSuppressed(suppressed);
            }
        } finally {
            if(finalException != null){
                throw finalException;
            }
        }
    }

}
