package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s1);
        if (a <= 0) throw new Exception();
        int b = Integer.parseInt(s2);
        if (b <= 0) throw new Exception();


        while (!(a == b)) {
            if (a < b) {
                int temp;
                temp = b;
                b = a;
                a = temp;
            }
            if (a > b) {
                a = a - b;
            }
        }
        System.out.println(a);


    }
}
