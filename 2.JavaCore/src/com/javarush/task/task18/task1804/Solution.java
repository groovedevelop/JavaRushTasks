package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());

        long[] array = new long[256];

        while (fis.available() > 0) array[fis.read()]++;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) System.out.print(i + " ");
        }

        reader.close();
        fis.close();
    }
}
