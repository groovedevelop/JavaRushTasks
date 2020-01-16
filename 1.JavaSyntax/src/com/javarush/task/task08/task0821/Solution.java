package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Lennon", "John");
        map.put("Frusciante", "John");
        map.put("Lennon", "Shon");
        map.put("Black", "John");
        map.put("White", "Jack");
        map.put("Gray", "Phil");
        map.put("Holly", "Butch");
        map.put("Goodman", "Jody");
        map.put("Badman", "Pizda");
        map.put("Huy", "Chlen");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
