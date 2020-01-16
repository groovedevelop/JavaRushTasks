package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        List<Character> vowelsOut = new ArrayList<>();
        List<Character> consonantsOut = new ArrayList<>();

        char[] strToArray = str.toCharArray();
        for (char c : strToArray) {
            if (isVowel(c)) {
                vowelsOut.add(c);
            } else {
                consonantsOut.add(c);
            }
        }

        for (char v : vowelsOut) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (char c : consonantsOut) {
            if (c != 32)
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}

/*
    String s = new BufferedReader(new InputStreamReader(System.in)).readLine().replace(" ", "");
    String a = "", b = "";

    for (Character ch : s.toCharArray()) {
        if (isVowel(ch)) {
            a += ch + " ";//напишите тут ваш код
        } else {
            b += ch + " ";
        }
    }
    System.out.println(a);
    System.out.println(b);
 */