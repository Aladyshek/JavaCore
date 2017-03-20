package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        { String chit = reader.readLine();
            try {

                FileInputStream read = new FileInputStream(chit);
            }
            catch (FileNotFoundException e)
            {
                System.out.println( reader.readLine());
            }
        }
    }
}
