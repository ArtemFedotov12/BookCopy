package com.start.examples.test42SringDeadlock;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        Runnable runnable1 = new StringLock(s1, s2);
        Runnable runnable2 = new StringLock(s2, s1);

        Thread thread1  = new Thread(runnable1);
        Thread thread2  = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}
