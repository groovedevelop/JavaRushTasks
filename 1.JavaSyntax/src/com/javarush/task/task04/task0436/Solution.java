package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();

        }

    }
}
