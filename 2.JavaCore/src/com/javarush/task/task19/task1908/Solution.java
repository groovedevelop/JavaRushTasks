package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();

        BufferedReader r = new BufferedReader(new FileReader(s1));
        BufferedWriter w = new BufferedWriter(new FileWriter(s2));

        while (r.ready()) {
            String[] strings = r.readLine().split(" ");
            for (String string : strings ) {
                if (string.matches("\\d+")) {
                    w.write(string + " ");
                }
            }
        }
        r.close();
        w.close();
    }
}
