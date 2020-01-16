package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeData incomeData = new IncomeData() {
            public String getCountryCode() {return "UA";}        //For example: UA

            public String getCompany() {return "JavaRush Ltd.";}           //For example: JavaRush Ltd.

            public String getContactFirstName() {return "Ivan";}     //For example: Ivan

            public String getContactLastName() {return "Ivanov";}    //For example: Ivanov

            public int getCountryPhoneCode() {return 38;}       //For example: 38

            public int getPhoneNumber() {return 501234567;}
        };
        IncomeDataAdapter a = new IncomeDataAdapter(incomeData);

        System.out.println(a.getCompanyName());
        System.out.println(a.getCountryName());
        System.out.println(a.getName());
        System.out.println(a.getPhoneNumber());
    }



    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        public String getCompanyName() {
            return data.getCompany();
        }

        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        public String getName() {
            return (data.getContactLastName() + ", " + data.getContactFirstName());
        }

        public String getPhoneNumber() {

            return ("+" + data.getCountryPhoneCode() + String.format("%010d", data.getPhoneNumber())
                    .replaceFirst("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "($1)$2-$3-$4"));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}