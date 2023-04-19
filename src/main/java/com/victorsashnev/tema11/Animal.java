package com.victorsashnev.tema11;

public abstract class  Animal {
    private static int counter = 0;
    private final int id;
    private final String nombre;
    private  int hambre;
    private final int tamanyo;
    private int energia;

    public  Animal(Animal){

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public String lavarse(){
        return "No se llavarme";
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public int getEnergia() {
        return energia;
    }

    public Animal(String nombre, int hambre, int tamanyo) {
        id = ++counter;
        this.nombre = nombre;
        this.hambre = hambre;
        this.energia = 100;
        this.tamanyo = tamanyo;
    }
    public abstract String emitirSonido();


    public  void comer(){
        if(hambre > 0)
            hambre--;
    }

    public  void dormir(){
        energia = 100;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", hambre=" + hambre +
                ", tamanyo=" + tamanyo +
                ", energia=" + energia +
                '}';
    }
}
