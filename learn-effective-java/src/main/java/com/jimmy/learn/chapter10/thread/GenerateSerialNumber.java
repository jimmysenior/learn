package com.jimmy.learn.chapter10.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicLong;

public class GenerateSerialNumber {

    private static final AtomicLong nextSerialNum = new AtomicLong();
    private static long generateSerialNumber() {
        return nextSerialNum.getAndIncrement();
    }

    public static void main(String[] args) {
        System.out.println(generateSerialNumber());
    }


}
