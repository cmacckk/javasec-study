package com.cmacckk.security.serializes.apachesec;

import org.apache.commons.collections4.functors.InvokerTransformer;
public class InvokeTransformerTest {
    public static void main(String[] args) {
        String cmd = "wireshark";

        InvokerTransformer transformer = new InvokerTransformer(
                "exec", new Class[]{String.class}, new Object[]{cmd}
        );
        transformer.transform(Runtime.getRuntime());
    }
}
