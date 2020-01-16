package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String text;

        File file = new File(name);
        FileWriter fileReader = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileReader);

        while (!((text = reader.readLine()).equals("exit"))) {
            bufferedWriter.write(text + "\n");
        }
        bufferedWriter.write("exit" + "\n");

        bufferedWriter.close();
        reader.close();


    }
}
