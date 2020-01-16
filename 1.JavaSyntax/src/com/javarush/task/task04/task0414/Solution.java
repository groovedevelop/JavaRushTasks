package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int x1 = 365;
        int x2 = 366;


        if (n%400 == 0 | n%4 == 0 & n%100 != 0)
            System.out.println("количество дней в году: " + x2);
        else
            System.out.println("количество дней в году: " + x1);
    }
}