package com.victorsashnev.tema11.Ejer07.Entrance;

import com.victorsashnev.tema11.Ejer07.Zone;

public class Entrance{
    protected final int numEntrada;
    protected  int cont = 0;
    public int getNumEntrada() {
        return numEntrada;
    }
    public Entrance() {
        this.numEntrada = ++ cont;
    }
    private  final int ROWS = 10;
    private final int COLM = 10;
    protected int[][] seatZone;
    protected final int MAXSEAT = ROWS * COLM;
    public int[][] getSeatZone() {
        return seatZone;
    }

    @Override
    public String toString() {
        return "Entrance{" +
                "numEntrada=" + numEntrada +
                ", cont=" + cont +
                '}';
    }
}


