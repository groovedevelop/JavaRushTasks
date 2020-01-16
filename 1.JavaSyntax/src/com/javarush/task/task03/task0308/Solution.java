package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 2; i <= 10; i++) {
            fact = fact * i;
        }
        System.out.println(fact);



    }
}
