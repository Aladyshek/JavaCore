package com.javarush.task.task18.task1805;

/*
Сортировка байт
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {


        FileInputStream siski = new FileInputStream("c:/1.txt");
        FileOutputStream alenkini = new FileOutputStream("c:/alenka/al.txt");

        byte[] puski = new byte[1000];

        while(siski.available() > 0)
        {
            int sashka = siski.read(puski);
            alenkini.write(puski, 0, sashka);



        }


        siski.close();
        alenkini.close();
    }
    }

