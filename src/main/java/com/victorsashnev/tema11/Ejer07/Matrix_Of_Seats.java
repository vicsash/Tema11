package com.victorsashnev.tema11.Ejer07;

import com.victorsashnev.tema11.LibMethods;

public class Matrix_Of_Seats {
    protected Matrix_Of_Seats(int row, int col){
    }
    protected Matrix_Of_Seats(){
        int seatNum =0;
        for (int i = 0; i <zone.length;i++){
            for (int j = 0; i <zone[i].length;j++){
                ++seatNum;
                if(LibMethods.randomNumeber(6,0)<5){
                    zone[i][j]= new Seat(false,seatNum);
                }
            }
        }
    }
}
