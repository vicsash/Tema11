package com.victorsashnev.tema11;

public class Gato extends Animal{

        public Gato(String nombre, int hambre, int tamanyo){
            super(nombre,hambre,tamanyo);
        }
        @Override
        public String emitirSonido(){
            return "MEOW!";
        }

        public String lavarse(){
            return "Me estoy lavando...";
        }
    @Override
    public String toString() {
        return "Gato{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", hambre=" + getHambre() +
                ", tamanyo=" + getTamanyo() +
                ", energia=" + getEnergia() +
                '}';
    }
}
