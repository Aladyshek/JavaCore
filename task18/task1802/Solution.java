package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = reader.readLine();
        FileInputStream siski = new FileInputStream(path);

        int min = siski.read();
        while(siski.available() > 0)
        {
            int sashka = siski.read();
            if (sashka < min)
                min = sashka;
        }
        System.out.println(min);
        siski.close();
        reader.close();
    }
}
