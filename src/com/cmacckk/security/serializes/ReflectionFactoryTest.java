package com.cmacckk.security.serializes;

import sun.reflect.ReflectionFactory;

import java.lang.reflect.Constructor;

public class ReflectionFactoryTest {
    public static void main(String[] args) {
        try {
            // 获取sun.reflect.ReflectionFactory类的实例
            ReflectionFactory factory = ReflectionFactory.getReflectionFactory();

            // 使用反序列化方式获取DeserializationTest类的构造方法
            Constructor<?> constructor = factory.newConstructorForSerialization(DeserializationTest.class, Object.class.getConstructor());

            // 实例化DeserializationTest类
            System.out.println(constructor.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
