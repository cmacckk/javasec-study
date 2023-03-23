package com.cmacckk.security.rmisec;

import java.rmi.Naming;

import static com.cmacckk.security.rmisec.RMIServerTest.RMI_NAME;

public class RMIClientTest {
    public static void main(String[] args) {
        try {
            // 查找远程RMI服务
            RMITestInterface rmiTest = (RMITestInterface) Naming.lookup(RMI_NAME);

            // 调用远程接口RMITestInterface类的test方法
            String result = rmiTest.test();

            // 输出RMI方法调用结果
            System.out.println("RMI Server result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
