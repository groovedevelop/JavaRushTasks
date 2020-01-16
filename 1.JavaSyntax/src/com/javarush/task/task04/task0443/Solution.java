package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sY = reader.readLine();
        String sM = reader.readLine();
        String sD = reader.readLine();
        int y = Integer.parseInt(sY);
        int m = Integer.parseInt(sM);
        int d = Integer.parseInt(sD);

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
