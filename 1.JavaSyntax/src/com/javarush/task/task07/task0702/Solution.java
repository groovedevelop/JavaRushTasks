package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length-2; i++)
            list[i] = r.readLine();

        for (int i = 9; i >=0; i--)
            System.out.println(list[i]);
    }
}