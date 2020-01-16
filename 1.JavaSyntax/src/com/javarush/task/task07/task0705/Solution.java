package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[20];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++)
            list[i] = Integer.parseInt(r.readLine());

        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < 10; i++)
            num1[i] = list[i];
        for (int i = 10; i < 20; i++)
            num2[i-10] = list[i];
        for (int i = 0; i < num2.length; i++)
            System.out.println(num2[i]);
    }


}
