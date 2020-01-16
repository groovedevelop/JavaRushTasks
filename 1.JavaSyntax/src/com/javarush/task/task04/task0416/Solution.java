package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(r.readLine());
        double c = 5.0;
        String color;

        if (t%c < 3)
            color = "зеленый";
        else if (t%c < 4)
            color = "желтый";
        else
            color = "красный";

        System.out.println(color);


    }
}