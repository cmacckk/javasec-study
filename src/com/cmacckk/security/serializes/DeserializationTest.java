package com.cmacckk.security.serializes;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

public class DeserializationTest implements Serializable {
    private String name;

    private String email;

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

        }
        catch (Exception e) {e.printStackTrace();}
    }
}
