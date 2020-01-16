package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        int k = Integer.parseInt(s1);
        int l = Integer.parseInt(s2);
        int m = Integer.parseInt(s3);
        int n = Integer.parseInt(s4);

        if (max2(k,l) > max2(m,n))
            System.out.println(max2(k,l));
        else if (max2(m,n) > max2(k,l))
            System.out.println(max2(m,n));
        else if (max2(m,n) == max2(k,l))
            System.out.println(max2(m,n));


    }

    public static int max2(int a, int b) {
        int x = 0;
        if (a > b)
            x = a;
        else if (b > a)
            x = b;
        else if (a == b)
            x = a;
        return x;

    }
}
