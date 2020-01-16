package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Russia")) {
                Hen henR = new RussianHen();
                return henR;
            }
            else if (country.equals("Ukraine")) {
                Hen henU = new UkrainianHen();
                return henU;
            }
            else if (country.equals("Moldova")) {
                Hen henM = new MoldovanHen();
                return henM;
            }
            else if (country.equals("Belarus")) {
                Hen henB = new BelarusianHen();
                return henB;
            }
            else return hen;

        }
    }









}
