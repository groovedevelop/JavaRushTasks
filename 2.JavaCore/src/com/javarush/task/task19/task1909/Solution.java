package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();

        BufferedReader r = new BufferedReader(new FileReader(s1));
        BufferedWriter w = new BufferedWriter(new FileWriter(s2));

        while (r.ready()) {
            w.write(r.readLine().replaceAll("\\.", "!"));
        }
        r.close();
        w.close();




    }
}
