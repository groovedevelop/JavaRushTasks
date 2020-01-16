package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(new File(read.readLine())));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(args[0] + " ")) {
                System.out.println(line);
                break;
            }
        }

        read.close();
        reader.close();
    }
}
