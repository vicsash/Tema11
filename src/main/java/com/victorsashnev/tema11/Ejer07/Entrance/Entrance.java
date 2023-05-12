package com.victorsashnev.tema11.Ejer07.Entrance;

import com.victorsashnev.tema11.Ejer07.Zone;

public class Entrance extends Zone{
    protected final int numEntrada;
    protected  int cont = 0;
    public int getNumEntrada() {
        return numEntrada;
    }

    public Entrance() {
        this.numEntrada = ++ cont;
    }

    @Override
    public String toString() {
        return "Entrance{" +
                "numEntrada=" + numEntrada +
                ", cont=" + cont +
                '}';
    }
}


