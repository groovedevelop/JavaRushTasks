package com.javarush.task.task18.task1802;

import java.io.*;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int min = 10000;
        int tmp;

        while (inputStream.available() > 0) {
            tmp = inputStream.read();
            if (tmp < min) min = tmp;
        }

        System.out.println(min);
        reader.close();
        inputStream.close();
    }
}
