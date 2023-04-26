package com.victorsashnev.tema11.Ejer04;

public abstract class Electrodomestico {
    protected enum CONSUMOENERGETICO{
        A(100),B(80),C(60),D(50),E(30),F(10);
        private int value;

        CONSUMOENERGETICO(int i) {
        }

        void consumoEnergético(final  int newValue){
            value = newValue;
        }
        public int getValue(){return  value;}}
   

    protected int precioBase;

    protected String color;

    protected CONSUMOENERGETICO consumoenergetico;

    protected int peso;

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public CONSUMOENERGETICO getConsumoenergetico() {
        return consumoenergetico;
    }

    public int getPeso() {
        return peso;
    }

    public Electrodomestico(int precioBase, String color, CONSUMOENERGETICO consumoenergetico, int peso) {
        this.precioBase = 100;
        this.color = "Blanco" ;
        this.consumoenergetico = CONSUMOENERGETICO.F;
        this.peso = 5;
    }

    
}
