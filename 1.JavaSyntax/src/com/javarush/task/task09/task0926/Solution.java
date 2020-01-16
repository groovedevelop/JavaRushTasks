package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int []> list = new ArrayList<>();
        int [] list5 = {1, 2, 3, 4, 5};
        int [] list2 = {1, 2};
        int [] list4 = {1, 2, 3, 4};
        int [] list7 = {1, 2, 3, 4, 5, 6, 7};
        int [] list0 = {};
        list.add(list5);
        list.add(list2);
        list.add(list4);
        list.add(list7);
        list.add(list0);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
