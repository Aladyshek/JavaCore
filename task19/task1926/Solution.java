package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        BufferedReader readF = new BufferedReader(new FileReader(a));


        String line = readF.readLine();
        while (line!=null)
        {
            StringBuilder buffer = new StringBuilder(line);

            System.out.println(buffer.reverse());
            line = readF.readLine();
        }
        reader.close();
        readF.close();

    }

}
