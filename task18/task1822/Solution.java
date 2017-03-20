package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader fbReader = new BufferedReader(fileReader);

        String result;

        while((result = fbReader.readLine()) != null){

            if(result.startsWith(args[0] + " ")){
                System.out.println(result);
                break;
            }
        }

        reader.close();
        fbReader.close();
        fbReader.close();
    }
}