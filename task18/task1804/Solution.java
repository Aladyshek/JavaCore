package com.javarush.task.task18.task1804;

/*
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = reader.readLine();
        FileInputStream siski = new FileInputStream(path);
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        HashMap<Integer, Integer> gotovo = new HashMap<Integer, Integer>();
        int count = 1;
        while(siski.available() > 0)
        {
            int sashka = siski.read();

            spisok.add(sashka);


        }
        for (int i = 0; i < spisok.size(); i++) {
            try
            {
                gotovo.put(spisok.get(i), gotovo.get(spisok.get(i)) + 1);
            }
            catch (NullPointerException e)
            {
                gotovo.put(spisok.get(i), 1);
            }

        }
        int min = 1;

        for (Map.Entry<Integer, Integer> pair : gotovo.entrySet())
        {
            if (pair.getValue() < min) min = pair.getValue();
        }

        for (Map.Entry<Integer, Integer> pair : gotovo.entrySet())
        {
            if (pair.getValue() == min) System.out.print(pair.getKey() + " ");
        }

        siski.close();
        reader.close();

    }

}
