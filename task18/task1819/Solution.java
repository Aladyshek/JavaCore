package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nam1 = reader.readLine();
        String nam2 = reader.readLine();

        FileInputStream name = new FileInputStream(nam1);
        FileInputStream name1 = new FileInputStream(nam2);

        FileOutputStream name2 = new FileOutputStream(nam1);
        ArrayList<Integer> listok = new ArrayList<Integer>();

        while (name.available()> 0)
        {
            listok.add(name.read());
        }

        while (name1.available()>0)
        {
            int a = name1.read();
            name2.write(a);
        }
        for (int i = 0; i < listok.size(); i++) {
            name2.write(listok.get(i));
        }
        reader.close();
        name.close();
        name1.close();
        name2.close();
    }
}
