package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private int height;
        private boolean sex;
        private String color;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, int weight, int height, boolean sex) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, int age, int weight, int height, boolean sex, String color) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
            this.color = color;
        }

        public Human(String name, boolean sex, String color) {
            this.name = name;
            this.sex = sex;
            this.color = color;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(boolean sex, String color) {
            this.sex = sex;
            this.color = color;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }


    }
}
