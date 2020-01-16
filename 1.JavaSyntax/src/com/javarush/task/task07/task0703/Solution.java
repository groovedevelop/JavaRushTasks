package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        int[] num = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++)
            list[i] = r.readLine();

        for (int i = 0; i < num.length; i++) {
            num[i] = list[i].length();
            System.out.println(num[i]);
        }


    }
}
