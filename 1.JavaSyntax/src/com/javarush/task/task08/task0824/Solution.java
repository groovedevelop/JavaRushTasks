package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Василий", true, 70);
        Human grandMa1 = new Human("Юлия", false, 70);
        Human grandPa2 = new Human("Юрий", true, 70);
        Human grandMa2 = new Human("Мария", false, 70);
        Human father = new Human("Максим", true, 40);
        Human mother = new Human("Анастасия", false, 35);
        Human son1 = new Human("Саня", true, 15);
        Human son2 = new Human("Вован", true, 10);
        Human daughter = new Human("Анна", false, 5);

        grandPa1.children.add(father);
        grandMa1.children.add(father);
        grandPa2.children.add(mother);
        grandMa2.children.add(mother);
        father.children.add(son1);
        father.children.add(son2);
        father.children.add(daughter);
        mother.children.add(son1);
        mother.children.add(son2);
        mother.children.add(daughter);


        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
