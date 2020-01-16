package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int countPos = 0;
        int countNeg = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(r.readLine());
            if (a > 0) countPos++;
            if (a < 0) countNeg++;
        }

        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);


    }
}
