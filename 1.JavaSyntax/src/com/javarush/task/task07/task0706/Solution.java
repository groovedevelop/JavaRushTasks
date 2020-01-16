package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] num = new int[15];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(r.readLine());
            if (i%2==0 || i == 0) {
                evenSum += num[i];
            } else {
                oddSum += num[i];
            }
        }

        String res = (evenSum < oddSum) ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.";
        System.out.println(res);


    }
}
