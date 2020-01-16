package com.javarush.task.task03.task0314;

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
            System.out.println( );
            n++;
            a = 1;
        }


    }
}
