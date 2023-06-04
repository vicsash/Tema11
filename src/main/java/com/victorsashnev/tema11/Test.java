package com.victorsashnev.tema11;

import java.util.Random;

public class Test {
    static Random rand = new Random();
    public static void main(String []args){

        for(int i = 0; i <1000;i++){
            int month = randomNumeber(11,0);
            System.out.println(month);
        }
    }
    public static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
}
