package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Вася");
        Cat cat2 = new Cat("Петя");
        Cat cat3 = new Cat("Биба");
        Cat cat4 = new Cat("Боба");
        Cat cat5 = new Cat("Бобик");
        Cat cat6 = new Cat("Кот");
        Cat cat7 = new Cat("Пес");
        Cat cat8 = new Cat("Мурзик");
        Cat cat9 = new Cat("Щенок");
        Cat cat10 = new Cat("Щегол");
        cats.put("Вася", cat1);
        cats.put("Петя", cat2);
        cats.put("Биба", cat3);
        cats.put("Боба", cat4);
        cats.put("Бобик", cat5);
        cats.put("Кот", cat6);
        cats.put("Пес", cat7);
        cats.put("Мурзик", cat8);
        cats.put("Щенок", cat9);
        cats.put("Щегол", cat10);

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
     }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
