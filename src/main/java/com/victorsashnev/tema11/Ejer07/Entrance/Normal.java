package com.victorsashnev.tema11.Ejer07.Entrance;

import com.victorsashnev.tema11.LibMethods;

public class Normal extends Entrance {

    private final String match;



    public String getMatch() {
        return match;
    }

    public Normal(INFLUXPRICE gamePrice, int numEntrada, String match) {
        super(gamePrice, numEntrada);
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

        }
        this.match = match;
    }

    private void fill(){

    }
}
