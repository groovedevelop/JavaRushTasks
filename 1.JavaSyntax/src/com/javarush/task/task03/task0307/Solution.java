package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Kolya";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Vasya";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Petya";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Jimi";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Jimbo";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Jack";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Phil";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Leo";

        Terran terran1 = new Terran();
        terran1.name = "Max";
        Terran terran2 = new Terran();
        terran2.name = "Sanya";
        Terran terran3 = new Terran();
        terran3.name = "Billy";
        Terran terran4 = new Terran();
        terran4.name = "Jeka";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
