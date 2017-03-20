package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader failik = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter failik2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (failik.ready())
        {
            int tmp = failik.read();
            if (tmp == 46)
            {
                failik2.write(33);
            }
            else failik2.write(tmp);
        }
        failik.close();
        failik2.close();

    }
}
