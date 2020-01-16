package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> m = new TreeMap<>();

        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (m.containsKey(s[0]))
            { m.put(s[0], m.get(s[0])+Double.parseDouble(s[1])); }
            else m.put(s[0], Double.parseDouble(s[1]));
        }

        double max = 0.0;

        for (Map.Entry<String, Double> entry: m.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        for (Map.Entry<String, Double> entry: m.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }
        reader.close();

    }
}
