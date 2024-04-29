package org.example.bean;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MapperBeanFactory<T> implements FactoryBean<T> {

    private Class<T> type;

    public MapperBeanFactory() {
    }

    public MapperBeanFactory(Class<T> type) {
        this.type = type;
    }

    @Override
    public Class<T> getObjectType() {
        return type;
    }

    @Override
    public T getObject() {
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, (proxy, method, args) -> {
            System.out.printf("Class %s, execute %s method, parameters=%s%n",
                    method.getDeclaringClass().getName(), method.getName(), args[0]);
            return switch (method.getName()) {
                case "sayHello" -> "hello, " + args[0];
                case "sayHi" -> "hi, " + args[0];
                default -> "hello, world!";
            };
        });
    }

    public void setType(Class<T> type) {
        this.type = type;
    }
}
