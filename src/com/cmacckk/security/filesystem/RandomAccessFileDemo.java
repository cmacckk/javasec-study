package com.cmacckk.security.filesystem;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        File file = new File("/etc/passwd");

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");

            // 定义每次读取的字节数
            int a = 0;

            // 定义缓冲区大小
            byte[] bytes = new byte[1024];

            // 创建字节数组输出流对象
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            // 循环读取文件
            while ((a = randomAccessFile.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes, 0, a);
            }

            System.out.println(byteArrayOutputStream.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
