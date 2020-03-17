package com.start.examples.test16DeadLock;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyLock implements Runnable{

    @NonNull
    private Cat catFirst;
    @NonNull
    private Cat catSecond;


    @Override
    public void run() {

        synchronized (catFirst) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (catSecond) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
