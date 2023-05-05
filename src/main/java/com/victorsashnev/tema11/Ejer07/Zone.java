package com.victorsashnev.tema11.Ejer07;

public class Zone{

    private final int[] zona ={1,2,3,4};
    private int[][] seatsZone;

    public Zone(int[] capacity) {

    }

    private boolean confirmIfZoneFull(){
       for(int i = 0; i < seatsZone.length;i++){
           for (int j = 0;j < seatsZone[i].length;j++){
                if(!(seatsZone[i][j])
                    return false;
           }
       }
       return true;
   }
}
