package com.jimmy.learn.concurrent.chapter04;

import java.util.concurrent.TimeUnit;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread preious = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(preious), "JoinThread " + i);
            thread.start();
            preious = thread;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + " terminated.");

    }

    static class Domino implements Runnable {
        Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                Profiler.begin();
                thread.join();
                System.out.println("Cost"+Profiler.end()+" mills");
                System.out.println(Thread.currentThread().getName() + " terminated.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
