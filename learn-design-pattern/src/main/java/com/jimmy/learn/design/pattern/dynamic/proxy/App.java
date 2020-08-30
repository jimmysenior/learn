package com.jimmy.learn.design.pattern.dynamic.proxy;

import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {

        IVehical car = new Car();
        IVehical vehical = (IVehical) Proxy.newProxyInstance(car.getClass().getClassLoader(), Car.class.getInterfaces(), new VehicalInvacationHandler(car));
        vehical.run();
    }
}
