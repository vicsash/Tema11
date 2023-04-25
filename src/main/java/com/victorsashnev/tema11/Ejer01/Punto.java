package com.victorsashnev.tema11.Ejer01;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 10;
        this.y = 10;
    }

    public double distance(Punto uno,Punto dos){
        return Math.sqrt(Math.pow((dos.x-uno.x),2)+Math.pow((dos.y- uno.y),2));
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
