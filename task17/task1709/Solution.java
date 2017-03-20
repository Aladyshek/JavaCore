package com.javarush.task.task17.task1709;

/* 
Предложения
*/

import javax.swing.*;

public class Solution {
    public static int proposal = 0;

    public static void main(String[] args) {

        switch (JOptionPane.showInputDialog(null, "Введи: Сашуля или Алёнуля)))"))
        {
            case "Сашуля":
                System.out.println("Ты выбрала Сашулю)) УРаа");
                break;
            case "Алёнуля":
                System.out.println("Ты выбрала Алёнулю)) УРаа");
                break;
            default:
                System.out.println("Странный выбор((");
                break;
        }


    }




}
