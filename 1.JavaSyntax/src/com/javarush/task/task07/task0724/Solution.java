package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human alexey = new Human("Алексей", true, 80);
        Human aleksandr = new Human("Александр", true, 80);
        Human anna = new Human("Анна", false, 80);
        Human zina = new Human("Зина", false, 80);
        Human maria = new Human("Мария", false, 40, alexey, anna);
        Human sergey = new Human("Сергей", false, 40, aleksandr, zina);
        Human pizduk1 = new Human("Пиздюк1", true, 10, sergey, maria);
        Human pizduk2 = new Human("Пиздюк2", true, 10, sergey, maria);
        Human pizduk3 = new Human("Пиздюк2", false, 10, sergey, maria);

        System.out.println(alexey);
        System.out.println(aleksandr);
        System.out.println(anna);
        System.out.println(zina);
        System.out.println(maria);
        System.out.println(sergey);
        System.out.println(pizduk1);
        System.out.println(pizduk2);
        System.out.println(pizduk3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name,boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name,boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}