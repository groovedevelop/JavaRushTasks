package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, StringIndexOutOfBoundsException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            for (String s : str) {
                if (s.length() > 6) {
                    sb.append(s + ",");
                }
            }
        }
        writer.write(sb.deleteCharAt(sb.length()-1).toString());

        reader.close();
        writer.close();
    }
}



