package com.start.examples.test24TryWithResources;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 21.11.2019
 */
public class AutoClosableResource implements AutoCloseable {

    private String   name                 = null;
    private boolean throwExceptionOnClose = true;

    public AutoClosableResource(String name, boolean throwExceptionOnClose) {
        this.name = name;
        this.throwExceptionOnClose = throwExceptionOnClose;
    }

    public void doOp(boolean throwException) throws Exception {
        System.out.println("Resource " + this.name + " doing operation");
        if(throwException) {
            throw new Exception("Error when calling doOp() on resource " + this.name);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource " + this.name + " close() called");
        if(this.throwExceptionOnClose){
            throw new Exception("Error when trying to close resource " + this.name);
        }
    }
}
