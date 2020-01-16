package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listtemp = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);

            if (n%3==0) {
                list3.add(n);
            }
            if (n%2==0) {
                list2.add(n);
            }
            else if (n%2 != 0 && n%3 != 0) {
                listtemp.add(n);
            }
        }

        printList(list3);
        printList(list2);
        printList(listtemp);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
