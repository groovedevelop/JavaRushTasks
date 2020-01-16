package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            Hrivna hrivna = new Hrivna(5000);
            allMoney.add(hrivna);
            Ruble ruble = new Ruble(10000);
            allMoney.add(ruble);
            USD usd = new USD(500);
            allMoney.add(usd);
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
