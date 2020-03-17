package com.start.examples.test16DeadLock;

public class Main {
    public static void main(String[] args) {

        Cat catFirst = new Cat("Vaska");
        Cat catSecond = new Cat("Myrzik");

        MyLock myLock1 = new MyLock(catFirst,catSecond);
        MyLock myLock2 = new MyLock(catSecond,catFirst);

        Thread thread1 = new Thread(myLock1);
        Thread thread2 = new Thread(myLock2);

        thread1.start();
        thread2.start();


    }
}
