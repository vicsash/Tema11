package com.victorsashnev.tema11.Lib;

import java.util.Random;

public class OrderArray {
    private static void changePos_IntArray(int[] array, int oldSpot, int newSpot) {
        int aux = array[oldSpot];
        array[oldSpot] = array[newSpot];
        array[newSpot] = aux;
    }
    private static void changePos_IntArray(String[] array, int oldSpot, int newSpot) {
        String aux = array[oldSpot];
        array[oldSpot] = array[newSpot];
        array[newSpot] = aux;
    }
    public static int[] mix_Array(int[] array) {
        Random random = new Random();
        int arrayLength= array.length-1;
        int randomPos = random.nextInt(arrayLength + 1);
        changePos_IntArray(array, randomPos, arrayLength);
        return array;
    }

    public static String[] mix_Array(String[] array) {
        Random random = new Random();
        int arrayLength= array.length-1;
        int randomPos = random.nextInt(arrayLength + 1);
        changePos_IntArray(array, randomPos, arrayLength);
        return array;
    }
}
