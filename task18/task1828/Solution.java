package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;


public class Solution {
    private static String readConsoleLine() throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        reader.close();
        return line;
    }
    private static LinkedHashMap fileToMap(String fileName) throws IOException
    {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        String line,line1,line2;
        while ((line=reader.readLine())!=null){
            line=removeFEFF(line);
            line1=line.substring(0,8);
            line2=line.substring(8);
            map.put(line1,line2);
        }
        reader.close();
        return map;
    }
    private static String removeFEFF(String s) {
        if (s.startsWith("\uFEFF")) {
            s = s.substring(1);
        }
        return s;
    }
    private static String argsToString(String[] args){
        String arguments,productName="",price,quantity;
        price=args[args.length-2];
        if (price.length()<8){
            while (true){
                price=price.concat(" ");
                if (price.length()==8) break;
            }
        }
        quantity=args[args.length-1];
        if (quantity.length()<4){
            while (true){
                quantity=quantity.concat(" ");
                if (quantity.length()==4) break;
            }
        }
        if ("-u".equals(args[0])){
            for (int i = 2; i < args.length-2; i++)
            {
                productName=productName+args[i]+" ";
            }
        }
        else {
            System.out.println("Неверный 1-й параметр!");
        }
        productName=productName.trim();
        if (productName.length()<30){
            while (true){
                productName=productName.concat(" ");
                if (productName.length()==30) break;
            }
        }
        arguments=productName+price+quantity;
        return arguments;
    }
    private static void update(LinkedHashMap<String ,String> map,String id,String arguments)
    {
        if (id.length()<8){
            while (true){
                id=id.concat(" ");
                if (id.length()==8) break;
            }
        }

        map.put(id,arguments);
    }
    private static void delete(LinkedHashMap<String ,String> map,String id)
    {
        if (id.length()<8){
            while (true){
                id=id.concat(" ");
                if (id.length()==8) break;
            }
        }
        map.remove(id);
    }
    private static void mapToFile(LinkedHashMap<String,String> map,String fileName) throws IOException
    {
        BufferedWriter writer=new BufferedWriter(new FileWriter(fileName));
        for(Map.Entry<String, String> pair : map.entrySet()) {
            writer.write(pair.getKey() + pair.getValue() + System.lineSeparator());
        }
        writer.close();
    }
    public static void main(String[] args) throws Exception
    {
        if ("-u".equals(args[0])){
            String fileName=readConsoleLine();
            LinkedHashMap map=fileToMap(fileName);
            String arguments=argsToString(args);
            update(map, args[1], arguments);
            mapToFile(map, fileName);
        }
        else if ("-d".equals(args[0])){
            String fileName=readConsoleLine();
            LinkedHashMap map=fileToMap(fileName);
            delete(map,args[1]);
            mapToFile(map, fileName);
        }
        else {
            System.out.println("Неверный 1-й параметр!");
        }
    }
}