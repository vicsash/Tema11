package com.victorsashnev.tema11.Ejer04;

import java.util.Arrays;
import java.util.HashMap;

public abstract class Electrodomestico {
    protected enum ConsumoEnergetico{
        A(100),B(80),C(60),D(50),E(30),F(10);
        private final int value;

        ConsumoEnergetico(int i) {
            value = i;
        }
        public int getValue(){return  value;}}

    public enum COLORES{
        BLANCO,NEGRO,ROJO,AZUL,GRIS
    }


    protected int precioBase;

    protected COLORES color;

    private  ConsumoEnergetico consumoEnergetico;

    protected int peso;

    /*private HashMap<Character, Integer> Electrodomestico = new HashMap<>();*/
   /* private void setElectrodomestico(HashMap<Character, Integer> Electrodomestico){
        Electrodomestico.put('A',100);
        Electrodomestico.put('B',80);
        Electrodomestico.put('C',60);
        Electrodomestico.put('D',50);
        Electrodomestico.put('E',30);
        Electrodomestico.put('F',10);
    }*/

    public int getPrecioBase() {
        return precioBase;
    }

    public COLORES getColor() {
        return color;
    }

    public int getPeso() {
        return peso;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Electrodomestico(int precioBase, COLORES color, ConsumoEnergetico consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = COLORES.BLANCO;
        ConsumoEnergetico c = ConsumoEnergetico.F;
        this.peso = 5;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.color = COLORES.BLANCO;
        ConsumoEnergetico c = ConsumoEnergetico.F;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra){
        ConsumoEnergetico[] ce = ConsumoEnergetico.values();
        for (ConsumoEnergetico energetico : ce) {
            if (energetico.name().equalsIgnoreCase(String.valueOf(letra))) {
                return;
            }
        }
        this.consumoEnergetico = ConsumoEnergetico.F;
    }

    public void comprobarColor(String color){
        COLORES[] colors = COLORES.values();
        for (COLORES colore : colors) {
            if (colore.name().equalsIgnoreCase(Arrays.toString(colors))) {
                return;
            }
        }
        this.color = COLORES.BLANCO;
    }

    public double precioFinal() {
        double precioConsumo = consumoEnergetico.getValue();
        double precioPeso = getPeso();
        double sum;
        if (peso > 0 && peso < 19) {
            precioPeso = 10;
        } else if (peso > 20 && peso < 49){
            precioPeso = 50;
        }else if(peso > 50 && peso < 79){
            precioPeso = 80;
        } else if(peso > 80){
            precioPeso = 100;
        }
        sum= precioBase + precioConsumo + precioPeso;
        return  sum;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
