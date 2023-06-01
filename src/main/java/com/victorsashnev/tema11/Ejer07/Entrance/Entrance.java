package com.victorsashnev.tema11.Ejer07.Entrance;

import com.victorsashnev.tema11.Ejer07.TypeEntrance;
import com.victorsashnev.tema11.Ejer07.Zone;

public abstract class Entrance{
    protected final int numEntrada;
    protected  int cont = 0;
    public int getNumEntrada() {
        return numEntrada;
    }
    public Entrance() {
        this.numEntrada = ++ cont;
    }
}


