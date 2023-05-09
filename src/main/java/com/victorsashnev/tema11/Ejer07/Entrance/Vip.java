package com.victorsashnev.tema11.Ejer07.Entrance;

import com.victorsashnev.tema11.LibMethods;

public class Vip extends Entrance {

    private final String match;

    private String alfaNumerico;


    public String getMatch() {
        return match;
    }

    public String getAlfaNumerico() {
        return alfaNumerico;
    }

    public Vip(INFLUXPRICE gamePrice, int numEntrada, String match, String alfaNumerico) {
        super(gamePrice, numEntrada);
        this.match = match;
        int numRand = LibMethods.randomNumeber(MAXSEAT,0);
        int randRow;
        int randomCol;
        boolean full;
        for(int i = 0; i < numRand ; i++ ){
            full = false;
            do {
                randRow = LibMethods.randomNumeber(10,0);
                randomCol = LibMethods.randomNumeber(10,0);
                if(seatZone[randRow][randomCol] == 0){
                    seatZone[randRow][randomCol] = 1;
                    full =true;
                }
            }while(full);
            this.alfaNumerico = alfaNumRand();
        }

    }


    private String alfaNumRand(){
        String letter = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
        String numbers = "1234567890";
        int num = 10;
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

}
