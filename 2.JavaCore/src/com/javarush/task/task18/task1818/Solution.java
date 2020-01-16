package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(reader.readLine(), true);
        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());

        byte[] file2Buffer = new byte[file2.available()];
        byte[] file3Buffer = new byte[file3.available()];

        file2.read(file2Buffer);
        file1.write(file2Buffer);
        file3.read(file3Buffer);
        file1.write(file3Buffer);

        file1.close();
        file2.close();
        file3.close();
        reader.close();



    }
}
