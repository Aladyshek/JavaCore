package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader failik = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter failik2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

         while (failik.ready())
          {
            int tmp = failik.read();

              char[] ch = Character.toChars(tmp);

             String a = ch[0]+"";
              a = a.replaceAll("\\p{Punct}", "");
              failik2.write(a);

          }
        failik.close();
        failik2.close();
    }
}
