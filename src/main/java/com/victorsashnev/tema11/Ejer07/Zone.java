package com.victorsashnev.tema11.Ejer07;

public abstract class Zone{
    private int id;
    private static int counterid =0;
    private static  int couterRow=0;
    private final int row;
    private final int SEATPERROW=20;
    private final int  MAXNUMROW =5;
    private final int MAXSEATS = SEATPERROW * MAXNUMROW;

    public Zone(int id, int row) {
        this.id = ++counterid;
        if(couterRow > SEATPERROW){
            couterRow = 0;
        }
        this.row = ++couterRow;
    }

    public boolean confirmSeat(){
        if(counterid > MAXNUMROW){
            return false;
        }
        return true;
    }
}
