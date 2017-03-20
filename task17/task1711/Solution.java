package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        switch (args[0]){

        }
        if(args.length<2) return;
        if(args[0].equals("-c")){
            createC(args);
        }
        else if(args[0].equals("-u")){
            updateU(args);
        }
        else if(args[0].equals("-d")){
            deleteD(args);
        }
        else if(args[0].equals("-i")){
            informI(args);
        }
        else {
            return;
        }
    }
    public synchronized static void createC(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date=null;
        int id=0;
        int checkSex=0;
        if((args.length-1)%3!=0) return;  // почему,  может принять так как есть ???
        //  просто обработать правильно
        for (int i = 2; i <args.length; i=i+3) {
            if(!(args[i].equals("м") || args[i].equals("ж"))){
                checkSex++;
            }
        }
        if(checkSex!=0)return;  // тоже самое ну и т.д.
        for (int i = 1; i <args.length ; i=i+3) {
            date = format.parse(args[i+2]);
            if(args[i+1].equals("м")){
                allPeople.add(allPeople.size(),Person.createMale(args[i], date));
                System.out.println(allPeople.size() - 1);
            }
            else if(args[i+1].equals("ж")){
                allPeople.add(allPeople.size(),Person.createFemale(args[i], date));
                System.out.println(allPeople.size() - 1);
            }
        }
    }
    public synchronized static void updateU(String[] args) throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date=null;
        int id=0;
        int checkSex=0;
        if((args.length-1)%4!=0) return;
        for (int i = 3; i <args.length; i=i+4) {
            if(!(args[i].equals("м") || args[i].equals("ж"))){
                checkSex++;
            }
        }
        if(checkSex!=0)return;
        for (int i = 1; i <args.length ; i=i+4) {
            id =Integer.parseInt(args[i]);
            date = format.parse(args[i+3]);
            if(args[i+2].equals("м")){
                allPeople.get(id).setSex(Sex.MALE);
                allPeople.get(id).setName(args[i+1]);
                allPeople.get(id).setBirthDay(date);
            } else if(args[i+2].equals("ж")){
                allPeople.get(id).setSex(Sex.FEMALE);
                allPeople.get(id).setName(args[i+1]);
                allPeople.get(id).setBirthDay(date);
            }
        }
    }
    public synchronized static void deleteD(String[] args){
        int id=0;
        for (int i = 1; i <args.length ; i++) {
            id =Integer.parseInt(args[i]);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDay(null);
            allPeople.get(id).setName(null);
        }
    }
    public static void informI(String[] args){
        DateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date date=null;
        int id=0;
        for (int i = 1; i <args.length ; i++) {
            id =Integer.parseInt(args[i]);
            String sex="";
            if(allPeople.get(id).getSex()==Sex.MALE){
                sex="м";
            }
            else if(allPeople.get(id).getSex()==Sex.FEMALE){
                sex="ж";
            }
            date = allPeople.get(id).getBirthDay();
            System.out.println(allPeople.get(id).getName() + " " + sex + " " + format2.format(date));
        }
    }
}