package com.jimmy.learn.concurrent.chapter04;

public class MainThread {
    public static void main(String[] args) {
        Profiler.begin();
        Thread main = Thread.currentThread();
        Thread thread = new Thread(new Another(main), "Another");
        thread.start();
        System.out.println(main.getName() + " terminated.");
        System.out.println("Cost"+ Profiler.end()+"mills");
    }


    static class Another implements Runnable {

        Thread thread;

        public Another(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                synchronized (MainThread.class) {
                    thread.join();
                    System.out.println("hahaha");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
