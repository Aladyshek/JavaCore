package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while (true)
        {
            a= reader.readLine();
            if (a.equals("exit"))break;

          ReadThread obj = new ReadThread(a);
            obj.start();

        }
reader.close();


    }

    public static class ReadThread extends Thread{
        private String peremennaya;
        public ReadThread(String fileName) {

           this.peremennaya = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут
        public  ArrayList<Integer> readFile() throws IOException{
            FileInputStream fignya = new FileInputStream(this.peremennaya);
            ArrayList<Integer> listok = new ArrayList<Integer>();

            while (fignya.available()>0)
            {
                int abuba = fignya.read();

                listok.add(abuba);
            }
            fignya.close();
            return listok;
        }
        public void findMax(ArrayList<Integer> trololo) {
            HashMap<Integer,Integer> mapik = new HashMap<Integer, Integer>();

            for (int i = 0; i < trololo.size(); i++) {
                try {
                    mapik.put(trololo.get(i), mapik.get(trololo.get(i))+1);
                }
                catch (Exception e)
                {
                    mapik.put(trololo.get(i), 1);
                }
            }

            int max = 1;
            for (Map.Entry<Integer, Integer> pair : mapik.entrySet()) {

              if (pair.getValue() > max)
              {
                  max = pair.getValue();
              }

            }
            for (Map.Entry<Integer, Integer> pair : mapik.entrySet()) {

                if (pair.getValue() == max)
                {
                    resultMap.put(this.peremennaya, pair.getKey());
                }

            }

        }

        @Override
        public void run() {
try {
    findMax(readFile());

}
catch (Exception e)
{

}
        }
    }
    }


