package com.victorsashnev.tema11.Ejer03;

import java.util.Arrays;

abstract class Coche {

    protected final String matricula;
    protected int velocidadActual;
    protected int marchaActual;
    protected int[] posiciones;

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }
    public int[] getPosiciones() {
        return posiciones;
    }

    public Coche(String matricula, int velocidadActual, int marchaActual, int[] posiciones) {
        this.matricula = matricula;
        this.velocidadActual = 0;
        this.marchaActual =0;
        this.posiciones = posiciones;
    }
    public void  accelerar(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public void frenar() {
        this.velocidadActual = 0;
    }

    public void cambiarMarcha(int marchaActual){
        if(marchaActual<0)
            this.marchaActual=0;
        this.marchaActual = marchaActual;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marchaActual=" + marchaActual +
                ", posiciones=" + Arrays.toString(posiciones) +
                '}';
    }
}
