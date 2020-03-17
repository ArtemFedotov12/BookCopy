package com.start.examples.test4Clone;

class A implements Cloneable
{
    public static void main(String[] args) {
        A a = new A();
        if (a instanceof  Cloneable) {
            try {
                a.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }


}

