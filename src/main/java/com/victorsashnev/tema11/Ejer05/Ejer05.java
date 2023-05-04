package com.victorsashnev.tema11.Ejer05;
import com.victorsashnev.tema11.LibMenu;
import com.victorsashnev.tema11.LibMethods;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.awt.*;
import java.util.ArrayList;

public class Ejer05 {
    public Ejer05(){
        int opt1;
        final int SPACES = 7;
        Menu menu = new Menu(SPACES);
        menu.addPickAxe();
        menu.addStone();
        menu.addSword();
        menu.addWood();
        menu.addEnderPearl();
        menu.addEgg();
        do{
            System.out.println("1-Add item");
            System.out.println("2-Remove item");
            System.out.println("3-Show inventory");
            System.out.println("0-Exit");
            opt1 = LibMethods.scanInt();

            switch( opt1){

                case 1:
                    menu.addObject(1,1,"Shovel");
                    break;
                case 2:
                    //int ran = LibMethods.randomNumeber(7,1);
                    menu.removeObject(1);
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
