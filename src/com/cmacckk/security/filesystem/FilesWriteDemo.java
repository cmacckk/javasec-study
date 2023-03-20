package com.cmacckk.security.filesystem;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesWriteDemo {
    public static void main(String[] args) {
        Path path = Paths.get("/tmp/1.txt");

        String content = "hello world!!!!";

        try {
            Files.write(path, content.getBytes());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
