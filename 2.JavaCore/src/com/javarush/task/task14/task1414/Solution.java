package com.javarush.task.task14.task1414;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] keys = {"cartoon", "thriller", "soapOpera"};
        String key = null;
        Movie movie;

        while (Arrays.asList(keys).contains(key = reader.readLine())) {
            switch (key) {
                case "cartoon":
                    movie = MovieFactory.getMovie("cartoon");
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                case "thriller":
                    movie = MovieFactory.getMovie("thriller");
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                case "soapOpera":
                    movie = MovieFactory.getMovie("soapOpera");
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                default:
                    break;
            }
        }
        MovieFactory.getMovie(key);
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
