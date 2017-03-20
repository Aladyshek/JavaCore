package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
        public static void main(String[] args) throws IOException {

            Locale.setDefault(Locale.ENGLISH);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            reader.close();
            FileInputStream inputStream = new FileInputStream(fileName1);
            FileOutputStream outputStream = new FileOutputStream(fileName2);
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextDouble()){
                double d = scanner.nextDouble();
                long L = Math.round(d);
                outputStream.write(Long.valueOf(L).toString().getBytes());
                outputStream.write(' ');
            }
            outputStream.close();
            scanner.close();
            inputStream.close();
    }
}
