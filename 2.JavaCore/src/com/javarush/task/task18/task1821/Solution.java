package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(args[0]);

        int[] chars = new int[256];
        while (file.available() > 0) {
            chars[file.read()]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                System.out.println((char) i + " " + chars[i]);
            }
        }

        file.close();
    }
}
