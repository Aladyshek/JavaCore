package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run()  {
            try {

                    for (int i = countSeconds; i > 0; i--) {
                        System.out.print(countSeconds + " ");
                        Thread.sleep(1000);
                        countSeconds--;
                        if (countSeconds == 0) {
                            System.out.println("Марш!");
                        }
                    }




            }
            catch (InterruptedException e)
            {
                System.out.println("Прервано!");

            }
            //add your code here - добавь код тут
        }
    }
}
