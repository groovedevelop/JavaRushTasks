package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());

        if (n > 0) {
            for (int i = 0; i < n-1; i++) {
                int tmp = Integer.parseInt(reader.readLine());
                if (tmp > maximum) {
                    maximum = tmp;
                }
            }
        }

        System.out.println(maximum);
    }
}
