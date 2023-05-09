package com.victorsashnev.tema11.Ejer07;

import java.util.Arrays;

public class Zone{


    private static final int ROWS = 10;
    private static final int COLM = 10;
    protected int[][] seatZone;

    protected static final int MAXSEAT = ROWS * COLM;

    protected Zone(){
        seatZone = new int[ROWS][COLM];
        for (int[] ints : seatZone) {
            Arrays.fill(ints, 0);
        }
    }
    public int[][] getSeatZone() {
        return seatZone;
    }

    @Override
    public String toString() {
        return "Zone{" +
                ", seatZone=" + Arrays.toString(seatZone) +
                '}';
    }
}
