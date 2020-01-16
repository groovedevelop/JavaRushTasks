package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        int minI = 0;
        int max = list.get(0).length();
        int maxI = 0;

        for (int i = 0; i < 10; i++) {
            if (min < list.get(i).length()) {
                min = list.get(i).length();
                minI = i;
            }
            if (max > list.get(i).length()) {
                max = list.get(i).length();
                maxI = i;
            }
        }

        System.out.println(minI < maxI ? list.get(minI) : list.get(maxI));







    }
}
