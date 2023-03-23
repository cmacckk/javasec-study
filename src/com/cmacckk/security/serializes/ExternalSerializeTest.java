package com.cmacckk.security.serializes;

import java.io.*;
import java.util.Arrays;

public class ExternalSerializeTest implements Externalizable {
    private String name;

    private String email;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(email);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("ReadObject");

        in.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("WriteObject");

        out.defaultWriteObject();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.email = (String) in.readObject();
    }

    private void readObjectNoData() {
        System.out.println("ReadObjectNoData");
    }

    /*
        * writeReplace()和readResolve()方法是在序列化和反序列化时被调用的方法，这两个方法可以用来实现自定义的序列化和反序列化逻辑
     */
    protected Object writeReplace() {
        System.out.println("WriteReplace");
        return null;
    }

    protected Object readResolve() {
        System.out.println("ReadResolve");
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
