package com.cmacckk.security.filesystem;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 定义写入文件路径
        String filePath = "/tmp/1.txt";

        // 定义待写入文件内容
        String content = "hello world";

        // 创建FileOutputStream对象
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        // 写入二进制文件
        fileOutputStream.write(content.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
