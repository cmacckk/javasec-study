package com.cmacckk.security.filesystem;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/etc/passwd");

        // open file object and create file input stream
        FileInputStream fis = new FileInputStream(file);

        // define every read byte
        int a = 0;

        // define buffer size
        byte[] bytes = new byte[1024];

        // create binary output object
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // loop read file object
        while ((a = fis.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes, 0, a);
        }

        System.out.println(byteArrayOutputStream.toString());
    }
}
