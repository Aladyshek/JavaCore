package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{

        FileInputStream nasrat = new FileInputStream("c:/alenka/1.txt");

        System.out.println(nasrat.available());

        while (nasrat.available() > 0)
        {
                        int data = nasrat.read();
            System.out.println(nasrat.available());
        }
nasrat.close();
    }
}
