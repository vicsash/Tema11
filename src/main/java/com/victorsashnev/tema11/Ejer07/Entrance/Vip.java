package com.victorsashnev.tema11.Ejer07.Entrance;

import com.victorsashnev.tema11.LibMethods;

import java.util.Arrays;

public class Vip extends Entrance {

    private final String match;

    private String alfaNumerico;


    public String getMatch() {
        return match;
    }

    public String getAlfaNumerico() {
        return alfaNumerico;
    }

    public Vip( int numEntrada, String match, String alfaNumerico) {
        super( numEntrada);
        this.match = match;
        alfaNumerico = alfaNumRand();


    }
    private String alfaNumRand(){
        String letter = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
        String numbers = "1234567890";
        int num = 15;
        int choice;
        int letterRange;
        int numberRange;
        StringBuilder alfanumerico = new StringBuilder();
        for (int i = 0; i < num; i++){
            choice=LibMethods.randomNumeber(2,1);
            letterRange = LibMethods.randomNumeber(letter.length(),0);
            numberRange = LibMethods.randomNumeber(numbers.length(),0);
            if(choice == 2){
                alfanumerico.append(String.valueOf(letter.charAt(letterRange)));
            }else
                alfanumerico.append(String.valueOf(numbers.charAt(letterRange)));
        }
        return alfanumerico.toString();
    }

    /*@Override
    public String toString() {
        return "Vip{" +
                "seatZone=" + Arrays.toString(seatZone) +
                '}';
    }*/
}
