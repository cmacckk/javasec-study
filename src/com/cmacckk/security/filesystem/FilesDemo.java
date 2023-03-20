package com.cmacckk.security.filesystem;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FilesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("/etc/passwd");

        try{
            byte[] bytes = Files.readAllBytes(path);
            System.out.println(new String(bytes));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
