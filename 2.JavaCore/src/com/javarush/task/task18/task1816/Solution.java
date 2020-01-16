package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(args[0]);


        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);

        int count = 0;
        for(byte a: buffer) {
            if ((a >= 65 && a <= 90) || (a >= 97 & a <= 122)) {
                count++;
            }
        }
        System.out.println(count);
        fis.close();
        reader.close();



    }
}
