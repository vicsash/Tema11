package com.victorsashnev.tema11.Ejer04;

public class Lavadora extends Electrodomestico {

    private int carga;

    public int getCarga() {
        return carga;
    }

    public Lavadora(int precioBase, int peso, int carga) {
        super(precioBase, peso);
        this.carga = carga;
    }



    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(int precioBase, COLORES color, ConsumoEnergetico consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void precioFinal(){
         int cargaActual = getCarga();
         if(cargaActual > 30){
             super.precioFinal();
             precioBase +=50;
         }
    }


    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioBase=" + precioBase +
                ", color=" + color +
                ", peso=" + peso +
                '}';
    }

}
