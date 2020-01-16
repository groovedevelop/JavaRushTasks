package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        String text = new String(buffer);
        int countSpace = 0;
        for (byte b : buffer) {
            if (' ' == (char)b) countSpace++;
        }
        float res = (float)(countSpace/buffer.length)*100;
        System.out.printf("%2f", res);

        fis.close();



    }
}
