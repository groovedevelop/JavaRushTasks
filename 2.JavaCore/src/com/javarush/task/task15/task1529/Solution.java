package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.equals("helicopter")) {
            Helicopter helicopter = new Helicopter();
            result = helicopter;
        }
        else if (s.equals("plane")) {
            int n = Integer.parseInt(reader.readLine());
            Plane plane = new Plane(n);
            result = plane;
        }

        reader.close();
    }
}
