package com.cmacckk.security.serializes;

import java.io.*;
import java.util.Arrays;

public class DeserializationTest implements Serializable {
    private String username;

    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            DeserializationTest test = new DeserializationTest();
            test.setUsername("cmacckk");
            test.setEmail("admin@javaweb.org");

            // 创建Java对象序列化输出流
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            // 序列化DeserializationTest对象
            oos.writeObject(test);
            oos.flush();
            oos.close();

            System.out.println(Arrays.toString(baos.toByteArray()));

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());

            ObjectInputStream ois = new ObjectInputStream(bais);

            DeserializationTest test2 = (DeserializationTest) ois.readObject();

            System.out.println("username: " + test2.getUsername() + ", email: " + test2.getEmail());
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
