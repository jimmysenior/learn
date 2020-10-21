package com.jimmy.learn.concurrent.chapter03;

import sun.security.jca.GetInstance;

public class InstanceFactory {
    private static class InstanceHolder{
        public static Instance instance = new Instance();
    }

    public static Instance getInstance(){
        return InstanceHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
