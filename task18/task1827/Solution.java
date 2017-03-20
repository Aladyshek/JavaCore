package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            ArrayList<String> records = new ArrayList<>();
            String s;
            while ((s = fileReader.readLine()) != null) {
                records.add(s);
            }
            //Теперь в records все стоки файла
            reader.close();
            fileReader.close();
            int maxID = 0;
            if (!records.get(0).replaceAll(String.valueOf((char) 65279), "").isEmpty())
                if (!records.get(0).substring(0, 8).replaceAll(" ", "").isEmpty()) {
                    maxID = Integer.parseInt(records.get(0).substring(0, 8).replaceAll(" ", "").replace(String.valueOf((char) 65279), ""));
                }
            for (int i = 1; i < records.size(); i++) {
                if (!records.get(i).isEmpty())
                    if (!records.get(i).substring(0, 8).replaceAll(" ", "").isEmpty()) {
                        int currentID = Integer.parseInt(records.get(i).substring(0, 8).replaceAll(" ", ""));
                        if (currentID > maxID)
                            maxID = currentID;
                    }
            }
            String id;
            String productName;
            String price;
            String quantity;
            String finalString = "";
            if (args.length > 0 && args[0].equals("-c")) {
                //ID
                id = String.format("%-8.8s", ++maxID);
                finalString += id;
                //productName
                String productNameString = "";
                for (int i = 1; i < args.length - 2; i++) {
                    productNameString += args[i] + " ";
                }
                productName = String.format("%-30.30s", productNameString);
                finalString += productName;
                //price
                price = String.format("%-8.8s", args[args.length - 2]);
                finalString += price;
                //quantity
                quantity = String.format("%-4.4s", args[args.length - 1]);
                finalString += quantity;
            }
            records.add(finalString);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
            for (String k : records) {
                writer.write(k);
                writer.newLine();
            }
            writer.close();
        }
    }


