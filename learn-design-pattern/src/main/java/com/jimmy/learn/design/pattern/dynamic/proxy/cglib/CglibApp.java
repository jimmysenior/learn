package com.jimmy.learn.design.pattern.dynamic.proxy.cglib;

import com.jimmy.learn.design.pattern.dynamic.proxy.Car;
import com.jimmy.learn.design.pattern.dynamic.proxy.IVehical;
import net.sf.cglib.proxy.Enhancer;

import java.awt.*;

public class CglibApp {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new CglibDynamicProxyIntercepter());
        IVehical carProxy =  (Car)enhancer.create();
        carProxy.run();

    }
}
