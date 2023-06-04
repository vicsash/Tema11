package com.victorsashnev.tema11.Ejer07;

import com.victorsashnev.tema11.Ejer07.TypeEntrance;
import com.victorsashnev.tema11.Ejer07.Zone;

public abstract class Entrance{
    protected final int numEntrada;
    private static int cont = 0;
    private final int row;
    private final Match match;
    private final Zone zone;
    private final Seat seat;
    public int getNumEntrada() {
        return numEntrada;
    }
    public Entrance(Match match,Zone zone,int row,Seat seat) {
        this.numEntrada = ++ cont;
        this.match = match;
        this.zone = zone;
        this.row = row;
        this.seat=seat;
    }
}


