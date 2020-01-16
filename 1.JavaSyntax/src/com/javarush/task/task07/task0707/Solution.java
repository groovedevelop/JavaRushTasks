package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Строка");
        list.add("Строка2");
        list.add("Строка3");
        list.add("Строка4");
        list.add("Строка5");

        System.out.println(list.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
