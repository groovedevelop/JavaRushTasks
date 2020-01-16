package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++)
            list[i] = Integer.parseInt(r.readLine());

        for (int i = 9; i >= 0; i--)
            System.out.println(list[i]);


    }
}

