package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader siski = new BufferedReader(new InputStreamReader(System.in));

        String name1 = siski.readLine();
        String name2 = siski.readLine();
        String name3 = siski.readLine();

        FileInputStream nasrat = new FileInputStream(name1);
        FileOutputStream vagina = new FileOutputStream(name2);
        FileOutputStream penis = new FileOutputStream(name3);

        int byte1, byte2;

        if ((nasrat.available() % 2) == 0)
            byte1 = nasrat.available() / 2;
        else
           byte1 = nasrat.available() / 2;
            byte2 = nasrat.available() - byte1;

        for (int i = 0; i < byte2; i++) {
            int data = nasrat.read();
            vagina.write(data);
        }

        for (int i = 0; i < byte1; i++) {
            int data = nasrat.read();
            penis.write(data);
        }

        siski.close();
        nasrat.close();
        vagina.close();
        penis.close();
    }
}
