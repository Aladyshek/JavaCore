package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        String cmd = args[0].substring(0,2);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat date1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person tmpPerson;
        switch (cmd){
            case "-c":
                if(args[2].equals("м")){
                    allPeople.add(Person.createMale(args[1], date.parse(args[3])));
                }
                else if(args[2].equals("ж")){
                    allPeople.add(Person.createFemale(args[1], date.parse(args[3])));
                }
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                tmpPerson = allPeople.get(Integer.parseInt(args[1]));
                tmpPerson.setName(args[2]);
                if(args[3].equals("м")){
                    tmpPerson.setSex(Sex.MALE);
                }else if (args[3].equals("ж")){
                    tmpPerson.setSex(Sex.FEMALE);
                }
                tmpPerson.setBirthDay(date.parse(args[4]));
                break;
            case "-d":
                tmpPerson = allPeople.get(Integer.parseInt(args[1]));
                tmpPerson.setName(null);
                tmpPerson.setSex(null);
                tmpPerson.setBirthDay(null);
                break;
            case "-i":
                tmpPerson = allPeople.get(Integer.parseInt(args[1]));
                if (tmpPerson.getSex().equals(Sex.FEMALE)){
                    System.out.print(tmpPerson.getName() + " " + "ж" + " " + date1.format(tmpPerson.getBirthDay()));
                }
                else if (tmpPerson.getSex().equals(Sex.MALE)){
                    System.out.print(tmpPerson.getName() + " " + "м" + " " + date1.format(tmpPerson.getBirthDay()));
                }
                break;
        }

    }
}
