package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;



        String[] keys = {"user", "loser", "coder", "proger"};
        //тут цикл по чтению ключей, пункт 1
        while (Arrays.asList(keys).contains(key = reader.readLine())) {
            //создаем объект, пункт 2
            switch (key) {
                case "user":
                    User user = new User();
                    doWork(user);
                    break;
                case "loser":
                    Loser loser = new Loser();
                    doWork(loser);
                    break;
                case "coder":
                    Coder coder = new Coder();
                    doWork(coder);
                    break;
                case "proger":
                    Proger proger = new Proger();
                    doWork(proger);
                    break;
                default:
                    break;

            }
        }


    }

    public static void doWork(Person person) {
        if (person instanceof User) ((User) person).live();
        else if (person instanceof Loser) ((Loser) person).doNothing();
        else if (person instanceof Coder) ((Coder) person).writeCode();
        else if (person instanceof Proger) ((Proger) person).enjoy();

    }
}
