package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{

        ArrayList<String> alenka = new ArrayList<String >();
        String a = "al";
        String b = "enka";

       try
       {
           alenka.set(0, a);
       }
       catch (Exception e)
       {
           alenka.add(0, a);
       }

        alenka.set(0, alenka.get(0)+ b);

        System.out.println(alenka);

    }
}
