package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
         BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
         int[] list = new int[3];

         for (int i = 0; i < 3; i++)
            list[i] = Integer.parseInt(r.readLine());

         for (int i = list.length - 1; i > 0; i--) {
             for (int j = 0; j < i; j++) {
                 if (list[j] > list[j + 1]) {
                     int tmp = list[j];
                     list[j] = list[j + 1];
                     list[j + 1] = tmp;
                 }
             }
         }

         for (int i = 0; i < list.length / 2; i++) {
             int tmp = list[i];
             list[i] = list[list.length - i - 1];
             list[list.length - i - 1] = tmp;
         }

        for (int i = 0; i < 3; i++)
            System.out.print(list[i] +" ");
    }
}
