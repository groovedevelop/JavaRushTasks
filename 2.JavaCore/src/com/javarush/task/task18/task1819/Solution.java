package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        FileInputStream file1 = new FileInputStream(file1Name);
        byte[] file1Buffer = new byte[file1.available()];
        file1.read(file1Buffer);
        FileOutputStream file1Writer = new FileOutputStream(file1Name);
        FileInputStream file2 = new FileInputStream(file2Name);
        byte[] file2Buffer = new byte[file2.available()];
        file2.read(file2Buffer);
        byte[] buffer = new byte[file1Buffer.length+file2Buffer.length];
        System.arraycopy(file2Buffer,0, buffer,0, file2Buffer.length);
        System.arraycopy(file1Buffer, 0, buffer, file2Buffer.length, file1Buffer.length);
        file1Writer.write(buffer);

        file1.close();
        file2.close();
        file1Writer.close();
        reader.close();

    }
}
