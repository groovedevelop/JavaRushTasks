package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();

        Cat murzik = new Cat();
        Cat barsik = new Cat();
        Cat bobik = new Cat();
        Cat vaska = new Cat();

        cats.add(murzik);
        cats.add(barsik);
        cats.add(bobik);
        cats.add(vaska);

        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<Dog>();

        Dog sharik = new Dog();
        Dog rex = new Dog();
        Dog fox = new Dog();

        dogs.add(sharik);
        dogs.add(rex);
        dogs.add(fox);

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> join = new HashSet<Object>();
        join.addAll(cats);
        join.addAll(dogs);

        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) System.out.println(pet);
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
