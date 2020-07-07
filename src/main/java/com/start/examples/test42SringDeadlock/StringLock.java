package com.start.examples.test42SringDeadlock;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@NoArgsConstructor
@AllArgsConstructor
public class StringLock implements Runnable {

    private String s1;
    private String s2;

    @SneakyThrows
    @Override
    public void run() {
        synchronized (s1) {
            System.out.println(s1);
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
            synchronized (s2) {
                Thread.sleep(1000);
                System.out.println(s2);
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

}
