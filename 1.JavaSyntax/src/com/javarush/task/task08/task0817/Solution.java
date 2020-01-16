package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Hendrix", "Jimi");
        map.put("Gilmour", "David");
        map.put("Morrison", "Jim");
        map.put("Black", "Jack");
        map.put("White", "Jack");
        map.put("Gray", "Jack");
        map.put("Smith", "Will");
        map.put("Osbourne", "Ozzy");
        map.put("Waters", "Roger");
        map.put("Griggs", "Parker");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        for (String item: list) {
            if (Collections.frequency(list, item) > 2) {
                removeItemFromMapByValue(map, item);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
