package com.victorsashnev.tema11.Ejer02;

import java.util.ArrayList;

public class Poligono {
    protected final ArrayList<Punto> puntos;


    public Poligono(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public int numVertex(){
        return puntos.size();
    }

    public double perimtero(P){
        double perimetro = 0;

        return perimetro;
    }
    @Override
    public String toString() {
        return "Poligono{" +
                "puntos=" + puntos +
                '}';
    }
}
