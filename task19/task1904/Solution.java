package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner)
        {
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }

        @Override
        public Person read() throws IOException {
            return read();
        }


    }
}
