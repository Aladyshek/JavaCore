package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String perviy = reader.readLine();
        String vtoroiy = reader.readLine();

        FileInputStream p = new FileInputStream(perviy);
        FileOutputStream v = new FileOutputStream(vtoroiy);

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (p.available() > 0)
        {
            int lolo = p.read();
            list.add(lolo);
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            v.write(list.get(i));
        }
        v.close();
        p.close();
        reader.close();
    }

}
