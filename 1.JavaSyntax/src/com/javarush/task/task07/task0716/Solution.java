package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");

        strings = fix(strings);


        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);

            if (s.contains("р") && !(s.contains("л"))) {
                strings.remove(s);
                i--;
            }
            else if (s.contains("л") && !(s.contains("р"))) {
                strings.add(i, s);
                i++;
            }
            else continue;
        }
        return strings;
    }
}