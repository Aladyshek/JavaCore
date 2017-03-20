package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));

        reader.close();
        ArrayList<String> stringteger = new ArrayList<String>();

        int index = 0;
        while (fileReader.ready())
        {
            int tmp = fileReader.read();
            if (!(tmp==32))
            {
                char[] tmp2 = Character.toChars(tmp);
                try {
                    stringteger.set(index, stringteger.get(index) + tmp2[0]);
                }
                catch (Exception e)
                {
                    stringteger.add(index, tmp2[0]+"");
                }
            }
            else
            {
                index++;
            }

        }

        ArrayList<Integer> arrik = new ArrayList<Integer>();
        for (int i = 0; i < stringteger.size(); i++) {
            try {
                arrik.add(Integer.parseInt(stringteger.get(i)));
            }
            catch (Exception r)
            {

            }
        }
        for (int i = 0; i < arrik.size() ; i++) {
            final String s = Integer.toString(arrik.get(i));
            file2.write(s);
            file2.write(32);

        }



        file2.close();
        fileReader.close();

    }
}
