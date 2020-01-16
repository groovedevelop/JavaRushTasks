package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min (int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public static long min (long a, long b) {
        if ((long)a < (long)b) return (long)a;
        else return (long)b;
    }

    public static double min (double a, double b) {
        if ((double)a < (double)b) return (double)a;
        else return (double)b;
    }
}
