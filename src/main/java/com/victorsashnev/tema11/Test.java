package com.victorsashnev.tema11;

import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Random;
import com.victorsashnev.tema11.Lib.*;
public class Test {
    static Random rand = new Random();
    public static void main(String []args) throws ParseException {
        /*
        for(int i = 0; i <1000;i++){
            int month = randomNumeber(11,0);
            System.out.println(month);
        }*/
        GregorianCalendar currentDay = new GregorianCalendar();
        currentDay = DateUtilities.CurrentDate();
        GregorianCalendar randomDate = DateUtilities.randomDate();
        System.out.println(DateUtilities.formatDateToShow_DayMonthYear(currentDay));
        System.out.println(DateUtilities.formatDateToShow_DayMonthYear(randomDate));
    }

    public static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
}
