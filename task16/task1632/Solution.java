package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new Thread1());
        threads.add(new Thread2());

        threads.add(new Thread3());

        threads.add(new Thread4());

        threads.add(new Thread5());

    }
    public static void main(String[] args) throws InterruptedException {


    }


   static class Thread1 extends Thread
    {



        @Override
        public void run()  {
            while (true)
            {

            }
        }
    }

    static class Thread2 extends Thread
    {

public void run() {
    try {
        throw new InterruptedException();
    }
    catch (Exception e)
    {
        System.out.println("InterruptedException");
    }
}

    }
    static class Thread3 extends Thread
    {



        @Override
        public void run()  {
            while (true)
            {
                try {

                    System.out.println("Ура");
                    Thread.sleep(500);


                }
                catch (Exception e)
                {

                }

            }
        }
    }
   static class Thread4 extends Thread implements Message
    {
        boolean kiska;

        @Override
        public void showWarning()
        {
            kiska =true;
        }

        @Override
        public void run()  {
            while (!kiska)
            {

            }
        }
    }

   static class Thread5 extends Thread
    {


        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                int summ = 0;

                String tmp = null;
                while (true) {
                    tmp = reader.readLine();
                    if (tmp.equals("N")) {
                        break;
                    } else {
                        summ = summ + Integer.parseInt(tmp);
                    }
                }
                System.out.println(summ);
            } catch (Exception e) {

            }
        }
        }

}