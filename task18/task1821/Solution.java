package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {

        FileInputStream pervyi = new FileInputStream("c:/1/1.txt");

        while (pervyi.available() > 0)
        {
            int a = pervyi.read();
            if (a == 13)
                System.out.println("!");
        }
    }
}
