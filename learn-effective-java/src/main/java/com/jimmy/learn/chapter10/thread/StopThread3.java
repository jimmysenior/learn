package com.jimmy.learn.chapter10.thread;

import java.util.concurrent.TimeUnit;

public class StopThread3 {
    private static volatile boolean stopRequested;
    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread =  new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (!stopRequested){
                    i++;
                }
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
