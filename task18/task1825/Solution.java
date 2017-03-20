package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        ArrayList<String> schit = new ArrayList<String>();
        while (true)
        {
            String a = reader.readLine();
            if (!(a.equals("end"))) {
                schit.add(a);
            }
            else break;
        }
        String path = null;

        for (int i = 0; i < schit.size(); i++) {
            String[] splitik = schit.get(i).split(".part");
            map.put(Integer.parseInt(splitik[1]), schit.get(i));
            path = splitik[0];
        }

        FileOutputStream output = new FileOutputStream(path);
        for (int i = 1; i <= schit.size(); i++) {
            FileInputStream input = new FileInputStream(map.get(i));
            while(input.available()>0)
            {


            }
            input.close();
        }
        output.close();
        reader.close();
    }
}
