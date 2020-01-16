package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = r.readLine();
        String file2Name = r.readLine();
        r.close();

        FileReader file1 = new FileReader(file1Name);
        FileWriter file2 = new FileWriter(file2Name);

        int d;
        for (int i = 1; file1.ready() ; i++) {
            d=file1.read();
            if(i%2==0){
                file2.write(d);
            }
        }

        file2.close();
        file1.close();


    }
}
