package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        byte[] small = new byte[file1.available()/2];
        byte[] big = new byte[file1.available()-small.length];

        file1.read(big);
        file2.write(big);
        file2.close();

        file1.read(small);
        file3.write(small);

        file1.close();
        file3.close();
        reader.close();


    }
}

