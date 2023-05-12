package com.victorsashnev.tema11.Ejer07.Entrance;

import java.util.Arrays;

public class Normal extends Entrance {

    private final String match;

    public String getMatch() {
        return match;
    }

    public Normal(int numEntrada, String match) {
        super(numEntrada);
        this.match = match;
    }

   /* @Override
    public String toString() {
        return "Normal{" +
                "seatZone=" + Arrays.toString(seatZone) +
                '}';
    }*/
}
