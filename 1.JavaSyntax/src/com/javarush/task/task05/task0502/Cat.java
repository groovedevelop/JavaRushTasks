package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() { }

    public boolean fight(Cat anotherCat) {
        int winMe = 0;
        int winAnother = 0;
        if (this.age > anotherCat.age) {
            winMe++;
        }
        else if (this.age < anotherCat.age ){
            winAnother++;
        }

        if (this.strength > anotherCat.strength) {
            winMe++;
        }
        else if (this.strength < anotherCat.strength ){
            winAnother++;
        }

        if (this.weight > anotherCat.weight) {
            winMe++;
        }
        else if (this.weight < anotherCat.weight ){
            winAnother++;
        }

        if (winMe > winAnother) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.age = 1;
        cat1.weight = 1;
        cat1.strength = 1;

        cat2.age = 2;
        cat2.weight = 2;
        cat2.strength = 2;

        cat3.age = 3;
        cat3.weight = 3;
        cat3.strength = 3;
    }
}
