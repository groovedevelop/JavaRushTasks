package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] stackTraceElements = (Thread.currentThread().getStackTrace());
        int count = 0;
        for (int i = 0; i < stackTraceElements.length; i++)
        {
            count++;
        }
        System.out.println(count);
        return count;

    }
}

