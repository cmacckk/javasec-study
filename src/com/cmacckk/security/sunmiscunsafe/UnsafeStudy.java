package com.cmacckk.security.sunmiscunsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeStudy {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");

        theUnsafeField.setAccessible(true);

        Unsafe unsafe = (Unsafe) theUnsafeField.get(null);
    }
}
