package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
      TestThread a = new TestThread();
        //Add your code here - добавь код тут
     a.start();
        a.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
 public TestThread() {

        }
    }
}