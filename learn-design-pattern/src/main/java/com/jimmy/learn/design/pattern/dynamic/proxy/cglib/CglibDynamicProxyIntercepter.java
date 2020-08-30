package com.jimmy.learn.design.pattern.dynamic.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxyIntercepter implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("---------before-------");
//        Object res = method.invoke(o,objects);
        Object res = methodProxy.invokeSuper(o,objects);
        System.out.println("---------after-------");
        return res;
    }
}
