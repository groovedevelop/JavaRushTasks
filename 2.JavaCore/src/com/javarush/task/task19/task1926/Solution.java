package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
            String[] strings = reader.readLine().split(System.lineSeparator());
            for (String str : strings) {
                System.out.println(new StringBuilder(str).reverse());
            }
        }

        console.close();
        reader.close();
    }
}
