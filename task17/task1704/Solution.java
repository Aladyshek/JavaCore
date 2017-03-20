package com.javarush.task.task17.task1704;

/*
Синхронизированные заметки 2
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException{
        FileInputStream alenka = new FileInputStream("c:/alenka/1.txt");
        FileOutputStream sashka  = new FileOutputStream("c:/alenka/2.txt");
        FileOutputStream sashka2  = new FileOutputStream("c:/alenka/6.txt");
        FileOutputStream sashka3  = new FileOutputStream("c:/alenka/5.txt");
        FileOutputStream sashka4  = new FileOutputStream("c:/alenka/4.txt");
        FileOutputStream sashka5  = new FileOutputStream("c:/alenka/3.txt");

        while (alenka.available() > 0)
        {
            int siski = alenka.read();
            sashka.write(siski);
            sashka2.write(siski);
            sashka3.write(siski);
            sashka5.write(siski);
            sashka4.write(siski);
        }

        alenka.close();
        sashka.close();
    }
}
