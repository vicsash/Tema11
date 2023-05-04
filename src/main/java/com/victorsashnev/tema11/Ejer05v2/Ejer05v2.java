package com.victorsashnev.tema11.Ejer05v2;
import com.victorsashnev.tema11.LibMethods;

public class Ejer05v2 {
    public Ejer05v2(){
        int opt1;
        final int SPACES = 7;
        Menu menu = new Menu(SPACES);

        do{
            System.out.println("1-Add item");
            System.out.println("2-Remove item");
            System.out.println("3-Show inventory");
            System.out.println("0-Exit");
            opt1 = LibMethods.scanInt();

            switch( opt1){

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(menu.paintInvetory());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Dato incorrecto");
                    break;

            }
        }while( opt1 != 0);


    }

}
