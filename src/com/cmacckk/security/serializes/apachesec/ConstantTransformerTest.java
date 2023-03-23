package com.cmacckk.security.serializes.apachesec;

import org.apache.commons.collections4.functors.ConstantTransformer;

public class ConstantTransformerTest {
    public static void main(String[] args) {
        Object obj = Runtime.class;
        ConstantTransformer transformer = new ConstantTransformer(obj);
        System.out.println(transformer.transform(obj));
    }
}
