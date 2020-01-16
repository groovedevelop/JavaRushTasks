package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Arkhipov", "Maxim");
        map.put("Bondar", "Alexander");
        map.put("Hendrix", "Jimi");
        map.put("Bowie", "David");
        map.put("Griggs", "Parker");
        map.put("Black", "John");
        map.put("Frusciante", "John");
        map.put("Lennon", "John");
        map.put("Killmister", "Lemmy");
        map.put("Waters", "Roger");


        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value == name) {
                count++;
            }
        }
        return count;


    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        int count = 0;
        while (iterator2.hasNext())
        {
            Map.Entry<String, String> pair = iterator2.next();
            String key = pair.getKey();
            if (key == lastName) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
