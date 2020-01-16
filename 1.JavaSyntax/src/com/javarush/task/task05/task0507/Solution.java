package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while (true) {
            double number = Double.parseDouble(r.readLine());
            if (number == -1) {
                break;
            } else {
                sum = sum + number;
                count++;
            }
        }
        System.out.println(sum/count);


    }
}

