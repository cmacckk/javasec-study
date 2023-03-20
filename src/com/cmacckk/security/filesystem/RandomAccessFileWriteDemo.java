package com.cmacckk.security.filesystem;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileWriteDemo {
    public static void main(String[] args) {
        File file = new File("/tmp/1.txt");

        String content = "hello world!!";

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.write(content.getBytes());
            randomAccessFile.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
