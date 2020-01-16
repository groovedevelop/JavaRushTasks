package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Хендрикс", 10000);
        map.put("Гилмор", 8000);
        map.put("Фли", 7000);
        map.put("Уотерс", 6000);
        map.put("Григгс", 9000);
        map.put("Миллер", 8500);
        map.put("Моррисон", 5000);
        map.put("Батлер", 4000);
        map.put("Летов", 200);
        map.put("Цой", 100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();

            if(value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}