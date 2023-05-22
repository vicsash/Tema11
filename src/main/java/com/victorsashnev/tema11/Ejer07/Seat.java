package com.victorsashnev.tema11.Ejer07;

public class Seat {
    private boolean occupied;
    private int seatId;
    private int counter = 0;
    private final int numero;

    public Seat(boolean occupied, int numero) {
        this.occupied = occupied;
        this.seatId = ++counter;
        this.numero = numero;
    }
}
