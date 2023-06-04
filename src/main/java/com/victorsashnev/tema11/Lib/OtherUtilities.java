package com.victorsashnev.tema11.Lib;

public class OtherUtilities {
    public static boolean confirmIfPrime(int num){
        int div;
        int counter = 0 ;
        for (int i = 1; i <= num / 2; ++i) {
            div= num % i;
            if(div==0){
                counter++;}
        }
        if(counter <= 2)
            return true;
        return false;
    }
}
