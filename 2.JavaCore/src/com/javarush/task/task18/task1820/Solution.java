package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(new File(read.readLine())));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(read.readLine())));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");
            for (String num : numbers) {
                int res = (int)Math.round(Double.parseDouble(num));
                writer.write(res + " ");
            }
        }

        reader.close();
        writer.close();
        read.close();
    }
}
