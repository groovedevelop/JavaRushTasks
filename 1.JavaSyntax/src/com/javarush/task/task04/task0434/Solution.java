package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        int a = 1;
        while (n != 11) {
            while (a != 11) {
                System.out.print(n*a + " ");
                a++;
            }
            System.out.println();
            n++;
            a = 1;
        }

    }
}
