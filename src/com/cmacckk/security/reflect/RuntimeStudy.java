package com.cmacckk.security.reflect;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class RuntimeStudy {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
//        System.out.println(IOUtils.toString(Runtime.getRuntime().exec("whoami").getInputStream(), StandardCharsets.UTF_8));
        // get Runtime class
        Class<?> runtimeClass1 = Class.forName("java.lang.Runtime");

        // get construct method
        Constructor<?> constructor = runtimeClass1.getDeclaredConstructor();
        constructor.setAccessible(true);

        // create construct instance test
        Object runtimeInstance = constructor.newInstance();

        // get runtime exec(String cmd) method
        Method runtimeMethod = runtimeClass1.getMethod("exec", String.class);

        // call exec method
        Process process = (Process) runtimeMethod.invoke(runtimeInstance, "wireshark");

        // get program result
        InputStream is = process.getInputStream();

        System.out.println(IOUtils.toString(is, StandardCharsets.UTF_8));
    }

}
