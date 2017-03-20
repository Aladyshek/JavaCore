package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        String n1 =reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();


        FileOutputStream name1 = new FileOutputStream(n1);
        FileInputStream name2 = new FileInputStream(n2);
        FileInputStream name3 = new FileInputStream(n3);

        while (name2.available()>0)
        {
            int a = name2.read();
            name1.write(a);

        }
        while (name3.available()>0)
        {
            int b = name3.read();
            name1.write(b);

        }
        name1.close();
        name2.close();
        name3.close();
        reader.close();
    }
}
