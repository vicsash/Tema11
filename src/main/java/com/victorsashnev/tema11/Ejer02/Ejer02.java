package com.victorsashnev.tema11.Ejer02;

import java.util.ArrayList;

public class Ejer02 {
    public Ejer02(){
        ArrayList<Punto> puntos = new ArrayList<>(4);
        puntos.add(new Punto(0,0));
        puntos.add(new Punto(2,0));
        puntos.add(new Punto(2,2));
        puntos.add(new Punto(0,2));
        Poligono poli = new Poligono(puntos);
        System.out.println(poli);
        System.out.println(poli.perimtero(puntos));

    }
}
