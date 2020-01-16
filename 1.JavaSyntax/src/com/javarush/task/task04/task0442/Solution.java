package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int  res = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            res += number;
            if (number == -1) {
                System.out.println(res);
                break;
            }

        }


    }
}
