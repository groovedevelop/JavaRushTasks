package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if (a == b || b == c || a == c) {
            if (a == b && a != c) {
                System.out.println(a + " " + b);
            } else if (b == c && b != a) {
                System.out.println(b + " " + c);
            } else if (a == c && a != b) {
                System.out.print(a);
                System.out.print(" ");
                System.out.print(c);
            }
        }
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }

    }
}