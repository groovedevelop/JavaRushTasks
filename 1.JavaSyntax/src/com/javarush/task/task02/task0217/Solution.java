package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m2;
        int m3;
        int minimum;
        m2 = min(a, b);
        m3 = min(c, d);
        
        if (m2 < m3)
            minimum = m2;
        else 
            minimum = m3;
        return minimum;

    }

    public static int min(int a, int b) {
        int m;
        if (a < b)
            m = a;
        else
            m = b;
        return m;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}