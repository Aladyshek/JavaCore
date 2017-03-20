package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consolka = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();
        String rez = outputStream.toString();

        System.setOut(consolka);

        String[] massiv = rez.split(" ");


        int a = Integer.parseInt(massiv[0]);
        int b = Integer.parseInt(massiv[2]);

        if (rez.contains("+")) System.out.print(rez.replace("= ", "= " + (a+b)));

        if (rez.contains("-")) System.out.print(rez.replace("= ", "= " + (a-b)));

        if (rez.contains("*")) System.out.print(rez.replace("= ", "= " + (a*b)));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

