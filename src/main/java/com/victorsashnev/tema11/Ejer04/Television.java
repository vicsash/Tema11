package com.victorsashnev.tema11.Ejer04;

public class Television extends Electrodomestico{

    private final double resulucion;

    private final boolean smartTV;

    public double getResulucion() {
        return resulucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public Television(int precioBase, COLORES color, ConsumoEnergetico consumoEnergetico, int peso, double resulucion, boolean smartTV) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resulucion = resulucion;
        this.smartTV = smartTV;
    }

    public Television(int precioBase, COLORES color, ConsumoEnergetico consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resulucion = 20;
        this.smartTV = false;
    }


    public Television(double resulucion, boolean smartTV) {
        this.resulucion = resulucion;
        this.smartTV = smartTV;
    }

    @Override
    public void precioFinal() {
        double cambioDePrecio = getPrecioBase();
        int preciosmart = 0;
        if(isSmartTV() == true)
            preciosmart = 50;
        if(getResulucion()>40){
            cambioDePrecio = cambioDePrecio * 1.30;
        }

        super.precioFinal();
        precioBase+=preciosmart + cambioDePrecio;


    }
}
