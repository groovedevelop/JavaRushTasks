package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            FileInputStream file = new FileInputStream(reader.readLine());
            byte[] buffer = new byte[file.available()];
            if (file.read(buffer) < 1000) {
                file.close();
                reader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
