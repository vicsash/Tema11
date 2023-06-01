package com.victorsashnev.tema11.Ejer07;

public class Seat {
    protected boolean occupied;
    protected int seatId;
    protected int counter = 0;
    private final int numero;

    public boolean isOccupied() {
        return occupied;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getNumero() {
        return numero;
    }

    public Seat(boolean occupied, int numero) {
        this.occupied = occupied;
        this.seatId = ++counter;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "occupied=" + occupied +
                ", seatId=" + seatId +
                ", numero=" + numero +
                '}';
    }
}
