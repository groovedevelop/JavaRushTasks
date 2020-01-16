package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(args[0]));
        BufferedWriter w = new BufferedWriter(new FileWriter(args[1]));

        while (r.ready()) {
            String[] strings = r.readLine().split(" ");
            for (String element : strings) {
                if (element.matches(".*\\d.")) {
                    w.write(element + " ");
                }
            }
        }
        r.close();
        w.close();
    }


}
