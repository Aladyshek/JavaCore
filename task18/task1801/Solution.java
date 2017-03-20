package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = reader.readLine();
        FileInputStream siski = new FileInputStream(path);

        int max = 0;
        while(siski.available() > 0)
        {
            int sashka = siski.read();
            if (sashka > max)
                max = sashka;
        }
        System.out.println(max);
        siski.close();
        reader.close();
        }
    }


