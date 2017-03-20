package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read1 = reader.readLine();
        String read2 = reader.readLine();

        FileReader pusya = new FileReader(read1);
        FileWriter zuzya = new FileWriter(read2);

        //ArrayList<Integer> array = new ArrayList<Integer>();
        int index = 0;
        while (pusya.ready())
        {
            int tmp = pusya.read();
            if (!(index%2 == 0))
            {
                zuzya.write(Character.toChars(tmp));
            }
            index++;

        }

        reader.close();
        pusya.close();
        zuzya.close();
    }
}
