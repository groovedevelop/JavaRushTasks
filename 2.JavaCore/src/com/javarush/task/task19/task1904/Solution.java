package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String str = fileScanner.nextLine();
            String[] strings = str.split("\\s", 4);
            Date myDate = new SimpleDateFormat("d M y", Locale.ENGLISH).parse(strings[3]);

            return new Person(strings[1], strings[2], strings[0], myDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
