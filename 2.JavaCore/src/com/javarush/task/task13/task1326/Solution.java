package com.javarush.task.task13.task1326;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        String name = reader.readLine();

        File file = new File(name);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        while(br.ready()){
            int i = Integer.parseInt(br.readLine());
            if (i % 2 == 0)
                list.add(i);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        br.close();

    }
}
