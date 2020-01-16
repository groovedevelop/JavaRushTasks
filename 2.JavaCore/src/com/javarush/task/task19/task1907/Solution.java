package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        BufferedReader r = new BufferedReader(new FileReader(s));

        List<String> list = new ArrayList<String>();
        while (r.ready()) {
            list.add(r.readLine());
        }
        r.close();

        int count = 0;
        for (String element : list) {
            if (element.contains("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
