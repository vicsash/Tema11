package com.victorsashnev.tema11.Lib;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DateUtilities {
    static Random rand = new Random();
    public static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
    public static GregorianCalendar dateWithRand(){
        int day = randomNumeber(30,1);
        int month = randomNumeber(11,0);
        int year = randomNumeber(2022,1980);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(year,month,day);
        return calendar;
    }
    public static long differenceBetweenDate_Milisecond(GregorianCalendar dateOne,GregorianCalendar dateTwo){
        return (dateOne.getTimeInMillis() - dateTwo.getTimeInMillis());
    }
    public static long differenceBetweenDate_Second(GregorianCalendar dateOne,GregorianCalendar dateTwo){
        return TimeUnit.MILLISECONDS.toSeconds((dateOne.getTimeInMillis() - dateTwo.getTimeInMillis()));
    }
    public static long differenceBetweenDate_Minutes(GregorianCalendar dateOne,GregorianCalendar dateTwo){
        return TimeUnit.MILLISECONDS.toMinutes((dateOne.getTimeInMillis() - dateTwo.getTimeInMillis()));
    }
    public static long differenceBetweenDate_Hours(GregorianCalendar dateOne,GregorianCalendar dateTwo){

        return TimeUnit.MILLISECONDS.toHours(dateOne.getTimeInMillis()-dateTwo.getTimeInMillis());
    }
    public static long differenceBetweenDate_Days(GregorianCalendar dateOne,GregorianCalendar dateTwo){
        return TimeUnit.MILLISECONDS.toDays(dateOne.getTimeInMillis()-dateTwo.getTimeInMillis()) ;
    }
    public static long differenceBetweenDate_Years(GregorianCalendar dateOne,GregorianCalendar dateTwo){
        return differenceBetweenDate_Days(dateOne,dateTwo) /365;
    }

    public static long differenceBetweenDate_Months(GregorianCalendar dateOne,GregorianCalendar dateTwo){
        return differenceBetweenDate_Days(dateOne,dateTwo) /30; }
}

