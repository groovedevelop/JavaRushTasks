package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (String fileName = reader.readLine(); !fileName.equals("exit"); fileName = reader.readLine()) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
            readThread.join();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        ArrayList<Integer> list = new ArrayList<Integer>();

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available() > 0) {
                list.add(fis.read());
            }
            fis.close();
        }
        public void run() {
            int element = list.get(0);
            for(Integer x : list) {
                if (Collections.frequency(list, x) > Collections.frequency(list , element)) {
                    element = x;
                }
            }
            resultMap.put(fileName, element);
        }
    }
}
