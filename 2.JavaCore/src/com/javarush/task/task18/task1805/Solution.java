package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        SortedSet<Integer> listSet = new TreeSet<Integer>();

        while (fis.available() > 0) {
            list.add(fis.read());
        }

        for (int i = 0; i < list.size(); i++) {
            listSet.add(list.get(i));
        }

        for (Integer el: listSet) {
            System.out.print(el + " ");
        }

        reader.close();
        fis.close();
    }
}
