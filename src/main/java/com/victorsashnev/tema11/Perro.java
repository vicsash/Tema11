package com.victorsashnev.tema11;

public  class Perro extends Animal{
    public Perro(String nombre, int hambre, int tamanyo){
        super(nombre,hambre,tamanyo);
    }

    public Perro(Perro perro) {
        super(perro);
    }

    @Override
    public String emitirSonido(){
        return "Gauu!";
    }


    @Override
    public String toString() {
        return "Perro{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", hambre=" + getHambre() +
                ", tamanyo=" + getTamanyo() +
                ", energia=" + getEnergia() +
                '}';
    }
}

