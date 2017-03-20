package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException, CorruptedDataException{
        BufferedReader reade = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reade.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(reade.readLine()));
        String line;
        while ((line = reader.readLine()) != null) {
            allLines.add(line);
        }

        while ((line = reader2.readLine()) != null) {
            forRemoveLines.add(line);
        }
        reader.close();
        reader2.close();
        reade.close();

        new Solution().joinData();


    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        }
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
