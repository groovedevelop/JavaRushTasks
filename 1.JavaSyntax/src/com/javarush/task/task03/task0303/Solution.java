package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 70));
        System.out.println(convertEurToUsd(500, 70));

    }

    public static double convertEurToUsd(int eur, double course) {
        double res = eur * course;
        return res;

    }
}
