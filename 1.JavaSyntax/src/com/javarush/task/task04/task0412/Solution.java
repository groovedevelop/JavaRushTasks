package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int Num = Integer.parseInt(sNum);

        if (Num > 0)
            System.out.println(Num * 2);
        if (Num < 0)
            System.out.println(Num + 1);
        if (Num == 0)
            System.out.println(Num);

    }

}