package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);

        if (num == 1)
            System.out.println("понедельник");
        if (num == 2)
            System.out.println("вторник");
        if (num == 3)
            System.out.println("среда");
        if (num == 4)
            System.out.println("четверг");
        if (num == 5)
            System.out.println("пятница");
        if (num == 6)
            System.out.println("суббота");
        if (num == 7)
            System.out.println("воскресенье");
        if (num < 1 | num > 7)
            System.out.println("такого дня недели не существует");

    }
}