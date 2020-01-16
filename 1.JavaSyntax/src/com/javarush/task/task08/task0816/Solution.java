package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Хендрикс", dateFormat.parse("NOVEMBER 2 1942"));
        map.put("Гилмор", dateFormat.parse("MARCH 6 1946"));
        map.put("Фрушанте", dateFormat.parse("MARCH 5 1970"));
        map.put("Ричардс", dateFormat.parse("JUNE 1 1943"));
        map.put("Клэптон", dateFormat.parse("MARCH 3 1945"));
        map.put("Пейдж", dateFormat.parse("JANUARY 9 1944"));
        map.put("Лох", dateFormat.parse("DECEMBER 1 1943"));
        map.put("Фли", dateFormat.parse("JULY 1 1962"));
        map.put("Сэндмэн", dateFormat.parse("AUGUST 2 1952"));
        
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            int value = pair.getValue().getMonth();
            if (value == 5 || value == 6 || value == 7) {
                iterator.remove();
            }

        }

    }

    public static void main(String[] args) {

    }
}
