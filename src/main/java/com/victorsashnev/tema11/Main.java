package com.victorsashnev.tema11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Perro perro1 = new Perro("Toby",0,10);
        Perro perro2 = new Perro("Toby",0,10);


        Gato jerry = new Gato("Jerry",0,10);
        System.out.println(perro1);
        System.out.println(jerry);

        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10;i++){
            if(random.nextBoolean()){
                animals[i]= new Gato("gato" +i,0,10);
            }else{
                animals[i] = new Perro("perro" +i,0,10);
            }
        }
        for (Animal a : animals){
            if( a instanceof Perro)
                System.out.println("Hola soy un pero");
            else if( a instanceof Gato){
                System.out.println("Hola soy un gato");
                //System.out.printf("%s\n", ((Gato)a).lavarse());
            }
            System.out.printf("Me llamo %s\n", a.getNombre());
            System.out.printf("%s\n", a.emitirSonido());
            System.out.printf("%s\n", a.lavarse());

        }

    }
}