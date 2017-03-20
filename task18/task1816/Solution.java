package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{


            FileInputStream fileInStream = new FileInputStream("c:/alenka/1.txt");


            while (fileInStream.available()>0) {
                System.out.println(fileInStream.read());
            }
            fileInStream.close();


    }
}
